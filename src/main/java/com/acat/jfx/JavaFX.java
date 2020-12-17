package com.acat.jfx;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Path to Font
		/*StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("user.dir"));
		sb.append(File.separator);
		sb.append("src/main/java/com/acat/jfx/resources/");
		sb.append("MYANMAR3.TTF");
		
		//Get Font
		InputStream stream = new FileInputStream(sb.toString());
		Font font = Font.loadFont(stream, 14);
		
		//MyanmarUnicode
		String value = "အေးချမ်းအောင်သွင်";
		
		//Controls
		Label label = new Label();
		label.setFont(font);
		label.setText(MMUnicodeFixer.fix(value)); //font Fixed
		
		//Container
		StackPane root = new StackPane();
		root.getChildren().add(label);
		
		//Scene : Layout Container, Width, Height
		Scene scene = new Scene(root, 200, 100);
		primaryStage.setScene(scene); //Stage*/
		primaryStage.show();
	}

	public static void executeFx(String[] args) {
		launch(args);
	}
	
}
