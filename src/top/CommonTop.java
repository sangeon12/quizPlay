package top;

import application.Main;
import javafx.scene.control.Label;

public class CommonTop {
	public Label top;
	public Label p;
	int cnt = Main.instance.commonCnt;
	public void initialize() {
		if(!Main.instance.oC) {
			top.setText(String.valueOf(cnt));
			if(cnt==10) {
				p.setText("언");	
				Main.instance.oC = true;
			}
		}else if(Main.instance.oC) {
			top.setText(String.valueOf(cnt));
			p.setText("언");
		}
	}
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
}
