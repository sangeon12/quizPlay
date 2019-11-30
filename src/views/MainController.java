package views;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	public Button btn;
	
	public void loadOldLayout() {
		Main.instance.changeScene("/views/MainOldQuiz.fxml", null);
	}
	public void loadCommonLayout(){
		Main.instance.changeScene("/views2/MainCommonQuiz.fxml", null);
	}
	public void loadHistoryLaytout() {
		Main.instance.changeScene("/views3/MainHistoryQuiz.fxml", null);
	}
	public void loadOldTop() {
		Main.instance.changeScene("/top/OldResult.fxml", null);
	}
	public void loadCommonTop() {
		Main.instance.changeScene("/top/CommonResult.fxml", null);
	}
	public void loadIncidentLayout() {
		Main.instance.changeScene("/views4/Incidentstart.fxml", null);
	}
	public void loadITop() {
		Main.instance.changeScene("/top/IResult.fxml", null);
	}
	public void loadS() {
		Main.instance.changeScene("/special/SpecialP.fxml", null);
	}
	public void loadGoTop() {
		Main.instance.changeScene("/top/GoResult.fxml", null);
	}
	public void loadTT() {
		Main.instance.changeScene("/tutorial/MainT.fxml", null);
	}
	public void loadSource() {
		Main.instance.changeScene("/views/Source.fxml", null);
	}
}