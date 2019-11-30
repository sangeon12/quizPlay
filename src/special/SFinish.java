package special;

import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SFinish {
	ArrayList<String> result = new ArrayList<String>();
	public Label r;
	
	public void end() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	int cnt = Main.instance.sCnt;
	@FXML
	public void initialize() { 
		if(!Main.instance.oS) {
			result.add("나에 대해 아는게 뭐야?");
			result.add("겨우 하나 맞췄네 다 틀린거랑 똑같지 뭐");
			result.add("나를 몰라도 한참 모르네");
			result.add("나에 대해 모르는게 있으면 물어봐 알려줌");
			result.add("음 나에 대해 조금은 알고있네");
			result.add("오 나에 대해 꾀 잘 알고있네");
			result.add("오 나에 대해 많이 알고있네?");
			result.add("와 날 이렇게 잘 안다고?");
			result.add("와 소름 이렇게나 알고있어?");
			result.add("스토커임..?");
			result.add("나랑 사귀자");
			r.setText(result.get(cnt));
			Main.instance.oS = true;
		}else if(Main.instance.oS) {
			r.setText("한번 푼 히든퀴즈는 엔딩이 나오지 않습니다.");
		}
	}
}
