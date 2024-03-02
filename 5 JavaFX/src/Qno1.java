import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Ellipse;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.Rectangle;
import javafx.scene.*;
import javafx.stage.Stage;

public class Qno1 extends Application{

	    @Override
	    public void start(Stage primaryStage) {
	        Pane root = new Pane();

	        // Create a line
	        Line line = new Line(50, 50, 200, 50);
	        line.setStroke(Color.BLUE);

	        // Create a rectangle
	        Rectangle rectangle = new Rectangle(50, 100, 150, 80);
	        rectangle.setFill(Color.GREEN);

	        // Create a circle
	        Circle circle = new Circle(350, 150, 30);
	        circle.setFill(Color.RED);

	        // Create an ellipse
	        Ellipse ellipse = new Ellipse(500, 150, 40, 20);
	        ellipse.setFill(Color.ORANGE);

	        // Add shapes to the pane
	        root.getChildren().addAll(line, rectangle, circle, ellipse);

	        Scene scene = new Scene(root, 600, 300);
	        primaryStage.setTitle("JavaFX Shapes Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}


