package top;

import application.Main;
import javafx.scene.control.Label;

public class OldTop {
	public Label top;
	public Label p;
	int cnt = Main.instance.oldCnt;
	public void initialize() {
		if(!Main.instance.oO) {
			top.setText(String.valueOf(cnt));
			if(cnt==10) {
				p.setText("상");	
				Main.instance.oO=true;
				
			}
		}else if(Main.instance.oO) {
			top.setText(String.valueOf(cnt));
			p.setText("상");	
		}
	}
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
}
