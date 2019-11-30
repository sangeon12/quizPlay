package tutorial;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GoTController {
	public void exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void back() {
		Main.instance.changeScene("/tutorial/CommonT.fxml", null);
	}
	public void next() {
		Main.instance.changeScene("/tutorial/IT.fxml", null);
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
	@FXML
	private ImageView imgView8;
	@FXML
	private ImageView imgView9;
	public void initialize() {
		Image img1 = new Image(getClass().getResource("/img5/Go1T.PNG").toString());
		imgView1.setImage(img1);
		Image img2 = new Image(getClass().getResource("/img5/Go2T.PNG").toString());
		imgView2.setImage(img2);
		Image img3 = new Image(getClass().getResource("/img5/Go3T.PNG").toString());
		imgView3.setImage(img3);
		Image img4 = new Image(getClass().getResource("/img5/Go4T.PNG").toString());
		imgView4.setImage(img4);
		Image img5 = new Image(getClass().getResource("/img5/Go5T.PNG").toString());
		imgView5.setImage(img5);
		Image img6 = new Image(getClass().getResource("/img5/Go6T.PNG").toString());
		imgView6.setImage(img6);
		Image img7 = new Image(getClass().getResource("/img5/Go7T.PNG").toString());
		imgView7.setImage(img7);
		Image img8 = new Image(getClass().getResource("/img5/Go8T.PNG").toString());
		imgView8.setImage(img8);
		Image img9 = new Image(getClass().getResource("/img5/Go9T.PNG").toString());
		imgView9.setImage(img9);

		
	}
}
