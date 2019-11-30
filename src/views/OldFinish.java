package views;


import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OldFinish {
	public Label finish3;

	public void Exit() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	@FXML
	public void initialize(){
		ArrayList<String> result2 = new ArrayList<String>();
		result2.add("다 틀리셨습니다.");
		result2.add("개 맞았습니다. 찍으신건가요?");
		result2.add("개 맞았습니다. 센스가 부족하시군요.");
		result2.add("개 맞았습니다. 다음엔 조금 더 힘내십시요.");
		result2.add("개 맞았습니다. 센스가 조금 있으시군요.");
		result2.add("개 맞았습니다. 꾀 잘하시는 편이군요.");
		result2.add("개 맞았습니다. 센스가 많으신 편이군요.");
		result2.add("개 맞았습니다. 센스가 많으시네요, 조금만 더 하면 다 맞을 수 있습니다.");
		result2.add("개 맞았습니다. 아주 좋습니다!! 조금만 더 맞으면 다 맞을 수 있습니다.");
		result2.add("개 맞았습니다. 아쉽군요!! 한개만 더 맞으면 됩니다.");
		result2.add("다 정답입니다. 축하해요 다 맞으셨군요, 암호는 [상]입니다!!");
		
		int cnt = Main.instance.oldCnt;
		if(cnt == 0 || cnt == 10) {
			finish3.setText(result2.get(cnt));
		}else {
			finish3.setText(cnt + result2.get(cnt));
		}
		
	}
}