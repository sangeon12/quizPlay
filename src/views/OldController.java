package views;

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
import javafx.scene.control.TextField;

public class OldController {

	public Label oldQuiz;
	public TextField txtAnswer;

	private List<QuizVO> quizList = new ArrayList<>();

	private QuizVO now = null; // 현재 퀴즈
	
	public boolean s = false;

	public void backToMainPage() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}

	@FXML
	private void initialize() {
		File old = new File(getClass().getResource("/resources/oldList.txt").getFile());
		try {
			FileInputStream fis = new FileInputStream(old);
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
		oldQuiz.setText("퀴즈를 시작하려면 확인 버튼을 클릭하세요.");
	}

	private int cntOfProblem= 0;
	private boolean isEnd = false;
	private boolean toggle = false; //현재 넘기는 건지 푼건지 체크
	private int cnt = 0;
	
	public void answer() {
		if(this.now == null || toggle) {
			next(); 
			return;
		}
		String a = txtAnswer.getText(); // 사용자의 답변을 가져와서    
		String correct = this.now.getAnswer();
		if(a == null || a.isEmpty()) {
			return;
		}
		if (a.equals(correct)) {
			oldQuiz.setText("정답입니다.");
			txtAnswer.setText(null);
			cnt++;
			s=true;
		} else {
			oldQuiz.setText("틀렸습니다. 정답은 "+correct+"입니다.");
			txtAnswer.setText(null);
			s=true;
		}
		
		toggle = true;
	}

	int count =1;
	public void next() {
		toggle = false;
		if(isEnd) {
			//게임이 종료되었다면 엔딩씬으로 넘어간다.
			Main.instance.oldCnt = cnt;
			Main.instance.changeScene("/views/OldEnd.fxml", null);
			
		}
		
		Random rnd = new Random();
		int idx = rnd.nextInt(quizList.size());

		QuizVO quiz = quizList.get(idx);
		this.now = quiz;
		oldQuiz.setText(count+". "+quiz.getQuiz());
		count++;
		
		quizList.remove(idx);
		cntOfProblem++;
		s=false;
		
		if(cntOfProblem >= 10) {
			isEnd = true;			
		}
	}
	public void next2() {
		if(s) {
			return;
		}else if(this.now==null) {
			return;
		}
		String correct = this.now.getAnswer();
		oldQuiz.setText("패스합니다. 정답은 "+correct+"입니다.");
		txtAnswer.setText(null);
		toggle = true;
	}

	/*public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}*/
	
}