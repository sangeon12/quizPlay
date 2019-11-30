package views4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartController {
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
	public void sStart() {
		s.setText(startList.get(0));
	}
	public void next2() {
		Main.instance.changeScene("/views4/ChoiceStart.fxml", null);
	}
	public void next() {
		if(cnt==4) {
			Main.instance.changeScene("/views4/ChoiceStart.fxml", null);
		}else {
			s.setText(startList.get(cnt));
			cnt++;
		}
	}
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
}
