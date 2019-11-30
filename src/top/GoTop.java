package top;

import application.Main;
import javafx.scene.control.Label;

public class GoTop {
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public Label top0;
	public Label top1;
	public Label top2;
	public Label p;
	int cnt0 = Main.instance.Go0Re;
	int cnt1 = Main.instance.Go1Re;
	int cnt2 = Main.instance.Go2Re;
	public void initialize() {
		if(!Main.instance.oG0) {
			top0.setText(String.valueOf(cnt0));
			if(cnt0==8) {
				p.setText("존");	
				Main.instance.oG0 = true;
			}
		}else if(Main.instance.oG0) {
			top0.setText(String.valueOf(cnt0));
			p.setText("존");
		}
		if(!Main.instance.oG1) {
			top1.setText(String.valueOf(cnt1));
			if(cnt1==15) {
				p.setText("존");	
				Main.instance.oG1 = true;
			}
		}else if(Main.instance.oG1) {
			top1.setText(String.valueOf(cnt1));
			p.setText("존");
		}
		if(!Main.instance.oG2) {
			top2.setText(String.valueOf(cnt2));
			if(cnt2==15) {
				p.setText("존");	
				Main.instance.oG2 = true;
			}
		}else if(Main.instance.oG2) {
			top2.setText(String.valueOf(cnt2));
			p.setText("존");
		}
	}
}
