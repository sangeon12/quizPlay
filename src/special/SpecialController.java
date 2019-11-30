package special;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import application.Main;
import domain.QuizVO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SpecialController {
	public Label sQuiz;
	public TextField t;
	
	ArrayList<QuizVO> quizList = new ArrayList<>();
	
	private QuizVO now = null; 
	
	public boolean s = false;
	
	@FXML
	public void initialize() {
		File s = new File(getClass().getResource("/s/me.txt").getFile());
		try {
			FileInputStream fis = new FileInputStream(s);
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
		sQuiz.setText("히든퀴즈를 시작하려면 확인 버튼을 클릭하여주세요.");
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
		String a = t.getText(); // 사용자의 답변을 가져와서    
		String correct = this.now.getAnswer();
		if(a == null || a.isEmpty()) {
			return;
		}
		if (a.equals(correct)) {
			sQuiz.setText("정답입니다.");
			t.setText(null);
			cnt++;
			s=true;
		} else {
			sQuiz.setText("틀렸습니다. 정답은 "+correct+"입니다.");
			t.setText(null);
			s=true;
		}
		
		toggle = true;
	}

	int count = 0;
	public boolean f = false;
	public void next() {
		toggle = false;
		if(isEnd) {
			//게임이 종료되었다면 엔딩씬으로 넘어간다.
			Main.instance.sCnt = cnt;
			Main.instance.changeScene("/special/SEnd.fxml", null);
			
		}
		if(!f) {
			QuizVO quiz = quizList.get(count);
			this.now = quiz;
			sQuiz.setText(quiz.getQuiz());
			
			count++;
			cntOfProblem++;
			s=false;
			
		}
		
		if(cntOfProblem >= 10) {
			isEnd = true;	
			f=true;
		}
	}
	public void next2() {
		if(s) {
			return;
		}else if(this.now==null) {
			return;
		}
		String correct = this.now.getAnswer();
		sQuiz.setText("패스합니다. 정답은 "+correct+"입니다.");
		t.setText(null);
		toggle = true;
	}
}
