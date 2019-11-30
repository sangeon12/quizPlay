package views3;

import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HistoryFinish {
	public Label finish;
	int a = Main.instance.Go1234;
	
	public void Exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	@FXML
	public void initialize(){
	
	int cnt = Main.instance.GoRe;
	int cnt0 = Main.instance.Go0Re;
	int cnt1 = Main.instance.Go1Re;
	int cnt2 = Main.instance.Go2Re;
	
	if(cnt1==15||cnt2==15||cnt0==8) {
		finish.setText("다 맞으셨습니다. 암호는 [존]입니다.");
	}else {
		finish.setText(cnt+"개 맞았습니다. 타임머신 가동을 중지합니다.");
	}
	}
}
