package views4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IncidentController {
	ArrayList<String> startList = new ArrayList<String>();
	@FXML
	public Label p1;
	@FXML
	public Label p2;
	@FXML
	public Label p3;
	@FXML
	public Label p4;
	@FXML
	public Label po;
	@FXML
	public Label me;
	
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
	
	public Button e1;
	public Button e2;
	public Button e3;
	public Button e4;
	
	public boolean h0 = false;
	public boolean h1 = false;
	public int h2 = 2;
	public boolean h3 = false;
	public boolean h4 = false;
	public int q = 2;
	
	public void back() {
		Main.instance.changeScene("/views/MainLayout.fxml", null);
	}
	int cnt =0;
	public void example1() {
		if(!h4) {
			return;
		}
		if(!h1&&a==1) {
			p1.setText("예? 이봐요!! 누굴 범인 취급 하는 겁니까??");
			p2.setText(null);
			p3.setText(null);
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==1) {
			p3.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==2) {
			p1.setText("예? 이봐요!! 누굴 범인 취급 하는 겁니까??");
			p2.setText(null);
			p3.setText(null);
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==2) {
			p2.setText("이런..");
			h2=h2-1;
			h0=false;
		}
		if(!h1&&a==3) {
			p1.setText("이봐요!! 누굴 범인 취급하는겁니까?");
			p2.setText(null);
			p3.setText(null);
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==3) {
			p4.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==4) {
			p1.setText("이봐요!! 누굴 범인 취급하는겁니까?");
			p2.setText(null);
			p3.setText(null);
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==4) {
			p2.setText("이런..");
			h2=h2-1;
			h0=false;
		}
	}
	
	
	public void example2() {
		if(!h4) {
			return;
		}
		if(!h1&&a==1) {
			p1.setText(null);
			p2.setText("예? 저는 범인이 아니에요!!");
			p3.setText(null);
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==1) {
			p3.setText("이런..");
			h2=h2-1;
			h0=false;
		}
		if(!h1&&a==2) {
			p1.setText(null);
			p2.setText("네..? 아닙니다!!");
			p3.setText(null);
			p4.setText(null);
			q=q-1;
			h1=true;
		}else if(h0&&a==2) {
			p2.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==3) {
			p1.setText(null);
			p2.setText("예? 저는 범인이 아니에요!!");
			p3.setText(null);
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==3) {
			p4.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==4) {
			p1.setText(null);
			p2.setText("네..? 아닙니다!!");
			p3.setText(null);
			p4.setText(null);
			q=q-1;
			h1=true;
		}else if(h0&&a==4) {
			p2.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
	}
	
	
	public void example3() {
		if(!h4) {
			return;
		}
		if(!h1&&a==1) {
			p1.setText(null);
			p2.setText(null);
			p3.setText("네..? 아닙니다!!");
			p4.setText(null);
			q=q-1;
			h1=true;
		}else if(h0&&a==1) {
			p3.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==2) {
			p1.setText(null);
			p2.setText(null);
			p3.setText("예? 저는 범인이 아니에요!!");
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==2) {
			p2.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==3) {
			p1.setText(null);
			p2.setText(null);
			p3.setText("예? 저는 범인이 아니에요!!");
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==3) {
			p4.setText("이런");
			h2=h2-1;
			h0=false;
		}
		if(!h1&&a==4) {
			p1.setText(null);
			p2.setText(null);
			p3.setText("예? 저는 범인이 아니에요!!");
			p4.setText(null);
			q=q-2;
			h1=true;
		}else if(h0&&a==4) {
			p2.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
	}
	
	
	public void example4() {
		if(!h4) {
			return;
		}
		if(!h1&&a==1) {
			p1.setText(null);
			p2.setText(null);
			p3.setText(null);
			p4.setText("예? 무슨 소리세요!! ");
			q=q-2;
			h1=true;
		}else if(h0&&a==1) {
			p3.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==2) {
			p1.setText(null);
			p2.setText(null);
			p3.setText(null);
			p4.setText("예? 무슨 소리세요!! ");
			q=q-2;
			h1=true;
		}else if(h0&&a==2) {
			p2.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==3) {
			p1.setText(null);
			p2.setText(null);
			p3.setText(null);
			p4.setText("네..? 아닙니다!! ");
			q=q-1;
			h1=true;
		}else if(h0&&a==3) {
			p4.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
		if(!h1&&a==4) {
			p1.setText(null);
			p2.setText(null);
			p3.setText(null);
			p4.setText("예?? 저는 범인이 아니에요!!");
			q=q-2;
			h1=true;
		}else if(h0&&a==4) {
			p2.setText("그게 무슨 말 같지도 않은 소리입니까??");
			h2=h2-2;
			h0=false;
		}
	}
	
	int a = Main.instance.cCnt;
	String[] i1 = {"분명 이 빌라는 지은지 오래되서 다 친하다고 했어.. 그런데 피해자는 '갈색머리'라고 했지!! 그 이유는 ", "범인의 머리 염색이 잘됐기 때문이지!!", 
			"범인의 이름을 모르기 때문이지!!", "범인의 갈색머리가 부러웠기 때문이지!!","범인의 갈색머리가 안감겨 있기 때문이지!!"};
	String[] i2 = {"분명 학교 첫 수업 시간이라고 했어!!", "그런데 어떻게 첫 수업 시간에 중간고사 채점을 하지?","그런데 첫 수업 시간에 어떻게 수학이 들어있지?",
			"그런데 첫 수업 시간에 어떻게 수업을 할 수 있지?","그런데 첫 수업 시간에 어떻게 자리 배정을 했지?"};
	String[] i3 = {"분명 영하 20도라고 했어..","그런데 어떻게 패팅을 안 입지?","그런데 어떻게 냉동실에 아이스크림이 있지?"
			,"그런데 어떻게 수영장 청소를 하지?","그런데 어떻게 보일러를 안틀어놓지?"};
	String[] i4 = {"피해자에 손에 움켜쥔 [P],[&],[A]..","P와 &과 A.. P, And, A panda판다가 돼지","P&A무슨 음식점 이름 같 않나?",
			"P&A의 의미는 이름이 분명해!!","P&A는 뭔가 너 같기때문이지!!"};
	@FXML
	public void initialize() {
		File st = new File(getClass().getResource("/incident/i"+a+".txt").getFile());
		try {
			FileInputStream fis = new FileInputStream(st);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String start2 = br.readLine();
				if (start2 == null) {
					break;
				}
				start2 = start2.replace("\\n", "\n");
				startList.add(start2);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		
		Image img1 = new Image(getClass().getResource("/img/1.jpg").toString());
		imgView1.setImage(img1);
		Image img2 = new Image(getClass().getResource("/img/2.jpg").toString());
		imgView2.setImage(img2);
		Image img3 = new Image(getClass().getResource("/img/3.jpg").toString());
		imgView3.setImage(img3);
		Image img4 = new Image(getClass().getResource("/img/4.jpg").toString());
		imgView4.setImage(img4);
		Image img5 = new Image(getClass().getResource("/img/po.jpg").toString());
		imgView5.setImage(img5);
		
		sStart();
		
	}
	public void sStart() {
		me.setText(startList.get(cnt));
		cnt++;
	}
	int cnt1 =0;
	public void next() {
		if(cnt==1) {
			po.setText(startList.get(cnt));
			me.setText(null);
			cnt++;
		}else if(cnt==2) {
			me.setText(startList.get(cnt));
			po.setText(null);
			cnt++;
		}else if(cnt==3) {
			po.setText(startList.get(cnt));
			me.setText(null);
			cnt++;
		}else if(cnt>3&&cnt<11) {
			me.setText(startList.get(cnt));
			po.setText(null);
			cnt++;
		}else if(cnt ==11) {
			p1.setText(startList.get(cnt));
			me.setText(null);
			cnt++;
		}else if(cnt==12) {
			p2.setText(startList.get(cnt));
			cnt++;
		}else if(cnt==13) {
			p3.setText(startList.get(cnt));
			cnt++;
		}else if(cnt==14) {
			p4.setText(startList.get(cnt));
			cnt++;
		}else if(cnt==15) {
			me.setText(startList.get(cnt));
			cnt++;
		}else if(cnt==16) {
			me.setText(startList.get(cnt));
			cnt++;
			e1.setText("한범식");
			e2.setText("김창성");
			e3.setText("김헌주");
			e4.setText("정장석");
			h4=true;
		}else if(q==0) {
			po.setText("탐정님 그는 범인이 아닌것 같습니다...");
			Main.instance.iCnt = cnt1;
			h3=true;
			h2=2;
			q=2;
		}else if(q==1) {
			if(a == 1) {
				me.setText(i1[0]);
				e1.setText(i1[1]);
				e2.setText(i1[2]);
				e3.setText(i1[3]);
				e4.setText(i1[4]);
			}else if(a ==2){
				me.setText(i2[0]);
				e1.setText(i2[1]);
				e2.setText(i2[2]);
				e3.setText(i2[3]);
				e4.setText(i2[4]);
			}else if(a==3) {
				me.setText(i3[0]);
				e1.setText(i3[1]);
				e2.setText(i3[2]);
				e3.setText(i3[3]);
				e4.setText(i3[4]);
			}else if(a==4) {
				me.setText(i4[0]);
				e1.setText(i4[1]);
				e2.setText(i4[2]);
				e3.setText(i4[3]);
				e4.setText(i4[4]);
			}
			q++;
			h0=true;
		}else if(h2==0) {
			po.setText("탐정님..");
			 Main.instance.iCnt = cnt1;
			 h2=2;
			q=2;
			 h3=true;
		}else if(h2==1) {
			po.setText("수상하군요, 연행하도록 하겠습니다.");
			h2=2;
			q=2;
			 cnt1++;
			 Main.instance.iCnt = cnt1;
			 h3=true;
		}else if(h3) {
			Main.instance.changeScene("/views4/SBEnd.fxml", null);
		}
	}
	public void p() {
		if(cnt==16) {
			return;
		}else if(cnt<16) {
			cnt =16;
			p1.setText(startList.get(11));
			p2.setText(startList.get(12));
			p3.setText(startList.get(13));
			p4.setText(startList.get(14));
			po.setText(null);
			next();
		}
	}
}
