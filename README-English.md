# JavaFX (Myanmar Unicode Font Fixed)
## Abstract
> You can directly use MMUnicodeFixer if you already know what JFX does.

## About
- [X] What is JavaFX? 
- [X] How it works!
- [X] Why I didn't launch JavaFX directly
- [X] Fixed Myanmar Unicode Font for the text view components
- [X] FYI

## What is JavaFX?
- We also called it JFX. To create design, debug, deploy for client-side applications. (Especially Desktop Apps)

## How it works!
- Components stay inside the Layout Containers. The Layout Containers can also have more containers that holds components(Let's say nested containers). The root layout container must put to the Scene. The Scene is the physical contents of JavaFX. When the application launches, we're seeing the window frame. It's called the Stage. Just like a concert, We put a Scene on the Stage.

## Why I didn't launch JavaFX directly
- When we launch directly through the main method that inherits ```javafx.application.Application```, it gives you components missing error at runtime.
- That error comes from ```sun.launcher.LauncherHelper``` in ```java.base``` module. In this case, the LauncherHelper will check for the ```javafx.graphics``` module to be present as a named module. If the module is not present, the launcher is aborted.
- The solution is that run from the main class that doesn't extends Application.
- I didn't fix this issue! Check this post -> https://stackoverflow.com/a/52571719
- But I fixed something. In Java, any class that has main method can run its main method. For his code, the application will become ambiguous which main method to run.
- I put this in pom.xml. To let the app to know what to run.
```
<plugin>
	<groupId>org.openjfx</groupId>
	<artifactId>javafx-maven-plugin</artifactId>
	<version>0.0.5</version>
	<configuration>
        	<mainClass>com.acat.jfx.application.App</mainClass>
	</configuration>
</plugin>
```
- Also I didn't create another 2 main methods inside an application. Just made a static method with the String Array Arguments in paramenters and call it from the App's main method.

- This is JavaFX.
```
public class JavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//statements
		primaryStage.show();
	}

	public static void executeFx(String[] args) {
		launch(args);
	}
	
}
```
- This is the main method that will run the JavaFX.
```
public class App {
	
    public static void main( String[] args ) {
        JavaFX.executeFx(args);
    }
}
```

## Fixed Myanmar Unicode Font for the text view components
- Also, I didn't fix this issue :3. I found the issue fix from the following links.
- https://www.facebook.com/groups/javakits.ths/permalink/3288607697898151/ 
- Similar on android issue here.  https://www.facebook.com/groups/javakits.ths/permalink/3594138190678432/

## FYI
- I recommend you all to use JavaFX with the SceneBuilder for UI designs. But there are some cases that the whole stage must be created from Java.

# Diagrams
- How JavaFX works!
<img src="images/JavaFX.png" alt="How JavaFX works">

## Electronics Engineer-cum-J2EE Backend Developer ##
-  Created by - Aye Chan Aung Thwin
