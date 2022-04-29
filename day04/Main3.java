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



public class Main3 extends Application {
	TextField tf1  ;   
	TextField tf2  ;
	TextField tf3  ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main3.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			 tf1 = (TextField)scene.lookup("#tf1");   
			 tf2 = (TextField)scene.lookup("#tf2");
			 tf3 = (TextField)scene.lookup("#tf3");
			
			
			Label lbl = (Label)scene.lookup("#lbl");

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
		String a = tf1.getText();
		String b = tf2.getText();

		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int sum = aa+bb;
		
		tf3.setText(Integer.toString(sum));
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}






