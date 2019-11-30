package views2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import application.Main;
import domain.QuizVO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CommonController {
	private List<QuizVO> quizList = new ArrayList<>();
	
	private QuizVO now = null; // 현재 퀴즈
	
	public Label commonQuiz;
	
	public void backToMainPage() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	@FXML
	private void initialize() {
		File common = new File(getClass().getResource("/resources/commonList.txt").getFile());
		try {
			FileInputStream fis = new FileInputStream(common);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String quiz = br.readLine();
				if (quiz == null) {
					break;
				}
				String[] q = quiz.split("#");
				quizList.add(new QuizVO(q[0], q[1]));
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("가져오기 실패");
		}

		quiz();
	}

	public void quiz() {
		commonQuiz.setText("퀴즈를 시작하려면 다음 버튼을 클릭하세요.");
	}
	
	private int cntOfProblem= 0;
	private boolean isEnd = false;
	private boolean toggle = false;
	
	public void next() {
		 if(this.now == null|| toggle) {
			
			nextQuiz();
			return;
		}
			
		
	}
	public int cnt =0;
	int count =1;
	public void nextQuiz() {
		if(this.now == null||toggle) {
			toggle = false;
			if(isEnd) {
				//게임이 종료되었다면 엔딩씬으로 넘어간다.
				Main.instance.commonCnt = cnt;
				Main.instance.changeScene("/views2/CommonEnd.fxml", null);
				
			}
			Random rnd = new Random();
			int idx = rnd.nextInt(quizList.size());

			QuizVO quiz = quizList.get(idx);
			this.now = quiz;
			commonQuiz.setText(count+". "+quiz.getQuiz());
			count++;
			
			quizList.remove(idx);
			cntOfProblem++;
			
			if(cntOfProblem >= 10) {
				isEnd = true;			
			}
		}
		
	}
	public void o() {
		if(this.now==null||toggle) {
			return;
		}
		
		String correct = this.now.getAnswer();
		
		if(correct.equals("o")) {
			commonQuiz.setText("정답입니다.");
			cnt++;
		}else if(correct.equals("x")){
			commonQuiz.setText("틀렸습니다.");
		}
		toggle = true;
	}
	public void x() {
		if(this.now == null ||toggle) {
			return;
		}
		String correct = this.now.getAnswer();
		
		if(correct.equals("x")) {
			commonQuiz.setText("정답입니다.");
			cnt++;
		}else if(correct.equals("o")){
			commonQuiz.setText("틀렸습니다.");
		}
		toggle = true;
	}
}