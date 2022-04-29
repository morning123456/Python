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



public class Main5 extends Application {
	TextField tf_dan  ;   
	TextArea cl  ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main5.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			tf_dan = (TextField)scene.lookup("#tf_dan");   
			cl = (TextArea)scene.lookup("#cl");   
		
		   Button btn = (Button)scene.lookup("#btn");
		
		btn.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
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
		String a = tf_dan.getText();
		
		int aa = Integer.parseInt(a);
		
		String text ="";
		for(int i=1; i<=9; i++) {
			text += aa+"*"+i+"="+aa*i+"\n";
		}
		
		cl.setText(text);
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}






