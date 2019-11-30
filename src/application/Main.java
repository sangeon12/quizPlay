package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	private Stage ps;
	public static Main instance;
	
	public int oldCnt = 0;
	public int commonCnt = 0;
	public int iCnt = 0;
	public int cCnt = 0;
	public int pCnt = 1;
	public int sCnt = 0;
	
	public int Go1234 = 0;
	public int Go0Re = 0;
	public int Go1Re = 0;
	public int Go2Re = 0;
	public int GoRe = 0;
	
	
	
	public boolean oS= false;
	public boolean oO= false;
	public boolean oC= false;
	public boolean oI= false;
	
	public boolean oG0=false;
	public boolean oG1=false;
	public boolean oG2=false;

	@Override
	public void start(Stage primaryStage) {
		instance = this;
		
		this.ps = primaryStage;
		try {
			
			changeScene("/views/MainLayout.fxml", null);
			
			primaryStage.setResizable(false);
			primaryStage.setTitle("QuizPlay");
			primaryStage.getIcons().add(new Image("/img/fhrh.png"));
					
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void changeScene(String view, String css) {
		if(css == null) {
			css = "application.css";
		}
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource(view));
			AnchorPane root = loader.load();
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource(css).toExternalForm());
			
			this.ps.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("화면 전환 실패");
		}
		
	}
	public void count(int a, int b) {
		
	}
}