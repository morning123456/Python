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



public class Main8 extends Application {
	
	String num="";
	
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn0;
	Button btn_call;
	TextField tf;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main8.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			btn1 = (Button)scene.lookup("#btn1");
			btn2 = (Button)scene.lookup("#btn2");
			btn3 = (Button)scene.lookup("#btn3");
			btn4 = (Button)scene.lookup("#btn4");
			btn5 = (Button)scene.lookup("#btn5");
			btn6 = (Button)scene.lookup("#btn6");
			btn7 = (Button)scene.lookup("#btn7");
			btn8 = (Button)scene.lookup("#btn8");
			btn9 = (Button)scene.lookup("#btn9");
			btn0 = (Button)scene.lookup("#btn0");
			
			btn_call = (Button)scene.lookup("#btn_call");
			
			tf = (TextField)scene.lookup("#tf");
			
			btn1.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					btn1();
				}
			});
		    
			btn2.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					btn2();
				}
			});
			
			btn3.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					btn3();
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btn1() {
		num += btn1.getText();
		tf.setText(num);
		
	}

	private void btn2() {
		num += btn2.getText();
		tf.setText(num);
	}

	private void btn3() {
		num += btn3.getText();
		tf.setText(num);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}






