package views3;

import application.Main;

public class HistoryController {
	public void backToMainPage() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	
	int cnt = 0;
	public void go1() {
		cnt++;
		Main.instance.Go1234 = cnt;
		Main.instance.changeScene("/views3/Go1.fxml", null);
	}
	public void go2() {
		cnt = cnt+2;
		Main.instance.Go1234 = cnt;
		Main.instance.changeScene("/views3/Go2.fxml", null);
	}
	public void go0() {
		Main.instance.Go1234 = cnt;
		Main.instance.changeScene("/views3/Go0.fxml", null);
	}
	
}
