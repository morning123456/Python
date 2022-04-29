package application;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class Main7 extends Application {
	TextField tf1;
	TextField tf2;
	TextArea ta;
	Button btn;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main7.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			 tf1 = (TextField)scene.lookup("#tf1");
			 tf2 = (TextField)scene.lookup("#tf2");
			 ta = (TextArea)scene.lookup("#ta");
			
			 btn = (Button)scene.lookup("#btn");
			
			btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					// TODO Auto-generated method stub
					myclick();
				}

			});
		    
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void myclick() {
		String a = tf1.getText();
		int aa = Integer.parseInt(a);
		
		String b = tf2.getText();
		int bb = Integer.parseInt(b);

		String txt = "";
		for(int i=aa; i<=bb;i++) {
			txt+=drawStar(i);
		}
		
		
		ta.setText(txt);
		
	}
	
	public String drawStar(int cnt) {
		String ret = "";
		for(int i=0; i<cnt;i++) {
			ret+="*";
		}
		ret+="\n";
		return ret;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}






