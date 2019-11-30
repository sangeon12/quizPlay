package tutorial;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CommonTController {
	public void exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void back() {
		Main.instance.changeScene("/tutorial/OldT.fxml", null);
	}
	public void next() {
		Main.instance.changeScene("/tutorial/GoT.fxml", null);
	}
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
	@FXML
	private ImageView imgView6;
	public void initialize() {
		Image img1 = new Image(getClass().getResource("/img4/Common1T.PNG").toString());
		imgView1.setImage(img1);
		Image img2 = new Image(getClass().getResource("/img4/Common2T.PNG").toString());
		imgView2.setImage(img2);
		Image img3 = new Image(getClass().getResource("/img4/Common3T.PNG").toString());
		imgView3.setImage(img3);
		Image img4 = new Image(getClass().getResource("/img4/Common4T.PNG").toString());
		imgView4.setImage(img4);
		Image img5 = new Image(getClass().getResource("/img4/Common5T.PNG").toString());
		imgView5.setImage(img5);
		Image img6 = new Image(getClass().getResource("/img4/Common6T.PNG").toString());
		imgView6.setImage(img6);
	}
}
