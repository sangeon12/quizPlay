package top;

import application.Main;
import javafx.scene.control.Label;

public class ITop {
	public Label top;
	public Label p;
	int cnt = Main.instance.iCnt;
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void initialize() {
		if(!Main.instance.oI) {
			if(cnt==1) {
				p.setText("시나");
				Main.instance.oI = true;
			}
		}else if(Main.instance.oI) {
			p.setText("시나");
		}
	}
}
