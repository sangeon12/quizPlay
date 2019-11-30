package special;

import application.Main;
import javafx.scene.control.TextField;
import s.PUtil;

public class PController {
	public TextField t;
	public void backToMainPage() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	public void next() {
		String a = t.getText();
		if(a.equals("상언존시나")) {
			Main.instance.changeScene("/special/MainSpecialQuiz.fxml", null);
		}else {
			PUtil.alert("틀렸습니다.", null);
			t.setText(null);
			return;
		}
	}
}
