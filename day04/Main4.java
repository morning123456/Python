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
import javafx.scene.control.TextField;



public class Main4 extends Application {
	TextField tfMe  ;   
	TextField tfCom  ;
	TextField tfRe  ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main4.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
				tfMe = (TextField)scene.lookup("#tfMe");   
				tfCom = (TextField)scene.lookup("#tfCom");
				tfRe = (TextField)scene.lookup("#tfRe");
			
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
		String me = tfMe.getText();
		String com = "";
		String result = "";
		
        double rnd = Math.random();
        if(rnd>0.5) {
        	com = "홀";
        }else {
        	com="짝";
        }
        if(me.equals(com)) {
        	result ="이김";
        }else {
        	result ="짐";
        }
		
        tfCom.setText(com);
        tfRe.setText(result);
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}






