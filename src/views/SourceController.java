package views;

import application.Main;

public class SourceController {
	public void backToMainPage() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
}
