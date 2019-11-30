package views4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ChoiceController {
	public Label s;
	ArrayList<String> startList = new ArrayList<String>();
	
	@FXML
	public void initialize() {
		File st = new File(getClass().getResource("/incident/start.txt").getFile());
		try {
			FileInputStream fis = new FileInputStream(st);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String start2 = br.readLine();
				if (start2 == null) {
					break;
				}
				startList.add(start2);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		sStart();
	}
	int cnt =1;
	int cnt2 = 0;
	public void sStart() {
		s.setText(startList.get(3));
	}
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void e1() {
		cnt2 = cnt2+1;
		Main.instance.cCnt = cnt2;
		Main.instance.changeScene("/views4/MainIncidentQuiz.fxml", null);
		
		
	}
	public void e2() {
		cnt2 = cnt2+2;
		Main.instance.cCnt = cnt2;
		Main.instance.changeScene("/views4/MainIncidentQuiz.fxml", null);
	}
	public void e3() {
		cnt2 = cnt2+3;
		Main.instance.cCnt= cnt2;
		Main.instance.changeScene("/views4/MainIncidentQuiz.fxml", null);
	}
	public void e4() {
		cnt2 = cnt2+4;
		Main.instance.cCnt= cnt2;
		Main.instance.changeScene("/views4/MainIncidentQuiz.fxml", null);
	}
	/*public void e5() {
		Main.instance.changeScene("/views4/MainIncidentQuiz.fxml", null);
		int cnt2 = Main.instance.cCnt;
	}*/
}
