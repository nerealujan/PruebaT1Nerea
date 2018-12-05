package application.control;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/** 
 * @author nerea
 */
public class Main extends Application {
	Stage stage;
	FXMLLoader loader1, loader2;
	Scene escena1, escena2;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			loader1 = new FXMLLoader(getClass().getResource("Profile.fxml"));
			loader2 = new FXMLLoader(getClass().getResource("GetMe.fxml"));
			mainWindow();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mainWindow() throws Exception {

		AnchorPane pane1 = loader1.load();
		escena1 = new Scene(pane1);
		
		// Fuente desde Google fonts
		escena1.getStylesheets().add(
				"https://fonts.googleapis.com/css?family=Allerta+Stencil");

		stage.setScene(escena1);
		
		stage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
