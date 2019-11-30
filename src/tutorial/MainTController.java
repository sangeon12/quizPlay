package tutorial;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainTController {
	@FXML
	private ImageView imgView1;
	@FXML
	private ImageView imgView2;
	@FXML
	private ImageView imgView3;
	@FXML
	private ImageView imgView4;
	@FXML
	private ImageView imgView5;
	public void exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void next() {
		Main.instance.changeScene("/tutorial/OldT.fxml", null);
	}
	public void initialize() {
		Image img1 = new Image(getClass().getResource("/img2/Main1T.PNG").toString());
		imgView1.setImage(img1);
		Image img2 = new Image(getClass().getResource("/img2/Main2T.PNG").toString());
		imgView2.setImage(img2);
		Image img3 = new Image(getClass().getResource("/img2/Main33T.PNG").toString());
		imgView3.setImage(img3);
		Image img4 = new Image(getClass().getResource("/img2/Main4T.PNG").toString());
		imgView4.setImage(img4);
		Image img5 = new Image(getClass().getResource("/img2/Main5T.PNG").toString());
		imgView5.setImage(img5);
		
	}
}
