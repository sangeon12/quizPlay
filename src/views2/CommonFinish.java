package views2;

import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CommonFinish {
	public Label finish3;
	public void Exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	@FXML
	public void initialize(){
		ArrayList<String> result2 = new ArrayList<String>();
		result2.add("다 틀리셨습니다.");
		result2.add("개 맞았습니다. 상식이 부족하시군요.");
		result2.add("개 맞았습니다. 상식이 부족합니다, 공부하세요");
		result2.add("개 맞았습니다. 5개 이상 맞을 수 있도록 더욱 공부하십시요.");
		result2.add("개 맞았습니다. 조금은 상식이 있는 편이군요.");
		result2.add("개 맞았습니다. 상식이 꾀 있는 편이군요.");
		result2.add("개 맞았습니다. 공부를 조금 잘하시나 보네요.");
		result2.add("개 맞았습니다. 많이 맞으셨군요, 조금만 더 하면 다 맞을 수 있습니다.");
		result2.add("개 맞았습니다. 아주 좋습니다!! 조금만 더 하면 암호를 얻을 수 있습니다.");
		result2.add("개 맞았습니다. 아쉽군요!! 한개만 더 맞으면 됩니다.");
		result2.add("다 정답입니다. 축하해요 다 맞으셨군요, 암호는 [언]입니다!!");
		
		int cnt = Main.instance.commonCnt;
		if(cnt == 0 || cnt == 10) {
			finish3.setText(result2.get(cnt));
		}else {
			finish3.setText(cnt + result2.get(cnt));
		}
		
	}
}
