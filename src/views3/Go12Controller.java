package views3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import application.Main;
import domain.QuizVO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Go12Controller {
	ArrayList<QuizVO> quizList = new ArrayList<>();
	
	public Label hQuiz;
	public TextField txt;
	
	private QuizVO now = null; 
	
	public boolean s = false;
	
	int a = Main.instance.Go1234;
	
	public void backToMainPage() {
		Main.instance.changeScene("/views3/MainHistoryQuiz.fxml", null);
	}
	
	@FXML
	public void initialize() {
		File old = new File(getClass().getResource("/history/Go"+a+".txt").getFile());
		try {
			FileInputStream fis = new FileInputStream(old);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String quiz = br.readLine();
				if (quiz == null) {
					break;
				}
				quiz = quiz.replace("\\n", "\n");
				String[] q = quiz.split("#");
				quizList.add(new QuizVO(q[0], q[1]));
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류발생");
		}
		quiz();
	}
	public void quiz() {
		if(a==1) {
			hQuiz.setText("여기가 삼국시대군. 삼국시대가 어떻게 탄생 되었는지 확인 버튼을 눌러 보러가자.");	
		}else if(a==2){
			hQuiz.setText("여기가 고려시대군. 고려시대가 어떻게 탄생 되었는지 확인 버튼을 눌러 보러가자");
		}else if(a==0) {
			hQuiz.setText("여기가 고조선시대군. 고조선시대가 어떻게 탄생 되었는지 확인 버튼을 눌러 보러가자");
		}
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
		String a = txt.getText(); // 사용자의 답변을 가져와서    
		String correct = this.now.getAnswer();
		if(a == null || a.isEmpty()) {
			return;
		}
		if (a.equals(correct)) {
			hQuiz.setText("맞아 "+correct+"!!");
			txt.setText(null);
			cnt++;
			s=true;
		} else {
			hQuiz.setText("아니야 "+correct+"인것같다.");
			txt.setText(null);
			s=true;
		}
		
		toggle = true;
	}

	int count = 0;
	int count2 = 1;
	public boolean f = false;
	public void next() {
		toggle = false;
		if(isEnd) {
			//게임이 종료되었다면 엔딩씬으로 넘어간다.
			if(a==0) {
				Main.instance.GoRe = cnt;
				Main.instance.Go0Re = cnt;
			}else if(a==1) {
				Main.instance.GoRe = cnt;
				Main.instance.Go1Re = cnt;
			}else if(a==2) {
				Main.instance.GoRe = cnt;
				Main.instance.Go2Re = cnt;
			}
			
			Main.instance.changeScene("/views3/Go1234End.fxml", null);
			
		}
		if(!f) {
			QuizVO quiz = quizList.get(count);
			this.now = quiz;
			hQuiz.setText(count2+". "+quiz.getQuiz());
			
			count2++;
			count++;
			cntOfProblem++;
			s=false;
			
		}
		if(a==0) {
			if(cntOfProblem>=8) {
				isEnd = true;	
				f=true;
			}
		}
		if(a>0) {
			if(cntOfProblem>=15) {
				isEnd = true;	
				f=true;
			}
		}
	}
	public void next2() {
		if(s) {
			return;
		}else if(this.now==null) {
			return;
		}
		String correct = this.now.getAnswer();
		hQuiz.setText("음.. "+correct+"인것같은데..");
		txt.setText(null);
		toggle = true;
	}
}
