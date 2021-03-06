package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Label lbl = new Label("Hello finestra!");
		
		
		VBox box = new VBox();//impagina in verticale
		box.getChildren().add(lbl);
		Button btn = new Button("click");
		Text txt = new Text("Ciao");
		btn.setOnAction(e -> {
			
			System.out.println("Hai cliccato");
			txt.setText("Aurora");
		});
		box.getChildren().add(btn);
		box.getChildren().add(txt);
		Scene scena = new Scene(lbl, 500, 400);
		
		primaryStage.setTitle("la mia prima finestra in java");
		primaryStage.setScene(scena);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
