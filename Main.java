import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class Main extends Application {

	public static void main(String[] args) 
	{
			
		launch(args);		
		
	}
	
	public void start(Stage stage)
	{
		GridPane buttonPane = new GridPane();
		
		buttonPane.setPrefSize(250, 200);
		
		Button upButton = new Button("Up");
		Button downButton = new Button("Down");
		Button leftButton = new Button("Left");
		Button rightButton = new Button("Right");
		Button forwardButton = new Button("Forward");
		Button backwardButton = new Button("Backward");
		
		Label positionLabel = new Label("Position:");
		Label positionValuesLabel = new Label();
		
		
		buttonPane.add(upButton, 0 , 0);
		buttonPane.add(downButton, 0, 5);
		buttonPane.add(leftButton, 1, 2);
		buttonPane.add(rightButton, 3 , 2);
		buttonPane.add(forwardButton, 2, 1);
		buttonPane.add(backwardButton, 2, 3);
		buttonPane.add(positionLabel, 4 , 0);
		buttonPane.add(positionValuesLabel, 4 , 1);
		
		Shafer_Drone drone1 = new Shafer_Drone();
		
		
		upButton.setOnAction((ActionEvent e) -> {
			
			drone1.up();
			
			positionValuesLabel.setText("(" + drone1.getPosition()[0] + " , " + drone1.getPosition()[1] + " , " + drone1.getPosition()[2] +" )" );	
		});
		
		downButton.setOnAction((ActionEvent e) -> {
			
			drone1.down();
			
			positionValuesLabel.setText("(" + drone1.getPosition()[0] + " , " + drone1.getPosition()[1] + " , " + drone1.getPosition()[2] +" )" );	
		});
		
			leftButton.setOnAction((ActionEvent e) -> {
			
			drone1.turnLeft();
			
			positionValuesLabel.setText("(" + drone1.getPosition()[0] + " , " + drone1.getPosition()[1] + " , " + drone1.getPosition()[2] +" )" );	
		});
			
		rightButton.setOnAction((ActionEvent e) -> {
				
			drone1.turnRight();
				
			positionValuesLabel.setText("(" + drone1.getPosition()[0] + " , " + drone1.getPosition()[1] + " , " + drone1.getPosition()[2] +" )" );	
		});
			
		forwardButton.setOnAction((ActionEvent e) -> {
				
			drone1.forward();
				
			positionValuesLabel.setText("(" + drone1.getPosition()[0] + " , " + drone1.getPosition()[1] + " , " + drone1.getPosition()[2] +" )" );	
		});
		
		backwardButton.setOnAction((ActionEvent e) -> {
			
			drone1.backward();
			
			positionValuesLabel.setText("(" + drone1.getPosition()[0] + " , " + drone1.getPosition()[1] + " , " + drone1.getPosition()[2] +" )" );	
		});
		
		
		Scene scene = new Scene(buttonPane);
		
		stage.setScene(scene);
		
		stage.show();
		
		
	}

}
