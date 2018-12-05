package application.control;

import java.io.IOException;


import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Control {
	
	Stage stage;
	Scene escena2;
	Stage stage1;
	Scene escena1;
	
	@FXML
	AnchorPane AnchorPane;

	@FXML
	ImageView cara;



	public void sendStage() throws Exception {
		

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("GetMe.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			// Fuente desde Google fonts
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Allerta+Stencil");

			Stage homeStage = new Stage();
			homeStage.setTitle("Main Menu");
		
			homeStage.setScene(scene);
			homeStage.setMaximized(false);
			homeStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

	public void closeStage() throws Exception {
		
		Stage thisStage = (Stage) AnchorPane.getScene().getWindow();
	    thisStage.close();
		
	}


	public void initialize() {

		TranslateTransition translateTransition = new TranslateTransition(
				Duration.seconds(0.5), cara);
		translateTransition.play();


		translateTransition
				.setOnFinished(event -> {
					
					
					TranslateTransition translateTransition1 = new TranslateTransition(
							Duration.seconds(1), cara);
					
					translateTransition1.play();


				});

	}
}