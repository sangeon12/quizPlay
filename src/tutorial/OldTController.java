package tutorial;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OldTController {
	public void exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void back() {
		Main.instance.changeScene("/tutorial/MainT.fxml", null);
	}
	public void next() {
		Main.instance.changeScene("/tutorial/CommonT.fxml", null);
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
	@FXML
	private ImageView imgView7;
	public void initialize() {
		Image img1 = new Image(getClass().getResource("/img3/Old1T.PNG").toString());
		imgView1.setImage(img1);
		Image img2 = new Image(getClass().getResource("/img3/Old2T.PNG").toString());
		imgView2.setImage(img2);
		Image img3 = new Image(getClass().getResource("/img3/Old3T.PNG").toString());
		imgView3.setImage(img3);
		Image img4 = new Image(getClass().getResource("/img3/Old4T.PNG").toString());
		imgView4.setImage(img4);
		Image img5 = new Image(getClass().getResource("/img3/Old5T.PNG").toString());
		imgView5.setImage(img5);
		Image img6 = new Image(getClass().getResource("/img3/Old6T.PNG").toString());
		imgView6.setImage(img6);
		Image img7 = new Image(getClass().getResource("/img3/Old7T.PNG").toString());
		imgView7.setImage(img7);

		
	}
}
