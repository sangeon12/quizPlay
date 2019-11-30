package views4;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EndController {
	@FXML
	private ImageView imgView1;
	
	public Label r;
	
	int cnt =  Main.instance.iCnt;
	
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void initialize() {
		if(cnt==0) {
			Image img1 = new Image(getClass().getResource("/img/B.jpg").toString());
			imgView1.setImage(img1);
			r.setText("탐정님 수사에 도움이 안되시는군요.");
		}else if(cnt==1) {
			Image img1 = new Image(getClass().getResource("/img/S.jpg").toString());
			imgView1.setImage(img1);
			r.setText("감사합니다 탐정님 이번에도 도움을 받았네요.");
		}
	}
}
