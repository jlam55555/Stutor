// package and imports
package stutor.res.ctrl;
import stutor.part.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
// controller class for main
public class MainCtrl {
	
	// methods to start new threads
    @FXML protected void startChat() { Chat.create(); }
    @FXML protected void startNote() { Note.create(); }
    @FXML protected void startWord() { Word.create(); }

}