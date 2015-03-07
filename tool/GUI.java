// package and imports
package stutor.tool;
import stutor.main.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// methods to create and manage GUI
public class GUI {
	
	// method to create a stage, given a stage and FXML
	public static Stage create(String fxmlName, String title, int width, int height, boolean maximized) {
		
		// load FXML
		Parent root = null;
		try {
			root = FXMLLoader.load(GUI.class.getResource("../res/fxml/" + fxmlName + ".fxml"));
		} catch(Exception e) {
			Main.end(e.getMessage());
		}
		
		// create Scene
		Scene scene = new Scene(root, width, height);
		
		// create Stage
		Stage stage = new Stage();
		stage.setTitle(title);
		stage.setMaximized(maximized);
		stage.setScene(scene);
		
		return stage;
		
	}
	
}