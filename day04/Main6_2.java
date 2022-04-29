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



public class Main6_2 extends Application {
	Label lbl1  ;   
	Label lbl2  ;   
	Label lbl3  ;   
	Label lbl4  ;   
	Label lbl5  ;   
	Label lbl6  ;   
	Button btn ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main6.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			lbl1 = (Label)scene.lookup("#lbl1");   
			lbl2 = (Label)scene.lookup("#lbl2");   
			lbl3 = (Label)scene.lookup("#lbl3");   
			lbl4 = (Label)scene.lookup("#lbl4");   
			lbl5 = (Label)scene.lookup("#lbl5");   
			lbl6 = (Label)scene.lookup("#lbl6");   
		
		    btn = (Button)scene.lookup("#btn");
		
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
		
		int ran1 = (int) (Math.random()*45);
		int ran2 = (int) (Math.random()*45);
		int ran3 = (int) (Math.random()*45);
		int ran4 = (int) (Math.random()*45);
		int ran5 = (int) (Math.random()*45);
		int ran6 = (int) (Math.random()*45);


		
		
			
		lbl1.setText(Integer.toString(ran1));
		lbl2.setText(Integer.toString(ran2));
		lbl3.setText(Integer.toString(ran3));
		lbl4.setText(Integer.toString(ran4));
		lbl5.setText(Integer.toString(ran5));
		lbl6.setText(Integer.toString(ran6));
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}






