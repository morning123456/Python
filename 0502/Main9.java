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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;



public class Main9 extends Application {
	TextField tf_mine  ;   
	TextField tf_com  ;
	TextField tf_result  ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main9.fxml"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			tf_mine = (TextField)scene.lookup("#tf_mine");   
			tf_com = (TextField)scene.lookup("#tf_com");
			tf_result = (TextField)scene.lookup("#tf_result");
			
			Button btn = (Button)scene.lookup("#btn");
			
			btn.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					myclick();
				}
			});
			
			tf_mine.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					
					if(event.getCode() == KeyCode.ENTER) {
						myclick();
					}
					
				}
				
			});

				
			
		    
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void myclick() {
		String me = tf_mine.getText();
		String com = "";
		String result = "";
		
        double rnd = Math.random();

        if(rnd>0.66) {
        	com = "가위";
        }else if(rnd>0.33) {
        	com="바위";
        }
        else {
        	com="보";
        }
        
        
        
        
        if(me.equals("가위")&&com.equals("가위")) result="비김";
        if(me.equals("가위")&&com.equals("바위")) result="짐";
        if(me.equals("가위")&&com.equals("보")) result="이김";
        
        if(me.equals("바위")&&com.equals("가위")) result="이김";
        if(me.equals("바위")&&com.equals("바위")) result="비김";
        if(me.equals("바위")&&com.equals("보")) result="짐";
        
        if(me.equals("보")&&com.equals("가위")) result="짐";
        if(me.equals("보")&&com.equals("바위")) result="이김";
        if(me.equals("보")&&com.equals("보")) result="비김";
        
        
        tf_com.setText(com);
        tf_result.setText(result);
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}






