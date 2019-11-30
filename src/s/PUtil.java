package s;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PUtil {
	public static void alert(String msg, String header) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("알림");
		alert.setHeaderText(header);
		alert.setContentText(msg);
		
		alert.show();
	}
}
