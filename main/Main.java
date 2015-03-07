// package and imports
package stutor.main;
import stutor.tool.GUI;
import javafx.application.Application;
import javafx.stage.Stage;

// main class 
public class Main extends Application {

	
	// main method
	@Override
	public void start(Stage primaryStage) {
		
		// create scene and stage
		Stage stage = GUI.create("Main","Stutor",750,500,true);
		stage.show();
		
	}
	
	// end the program if an error arises
	public static void end(String message) {
		
		System.err.format("Error: %s%n%n" , message);
		System.exit(-1);
		
	}

}