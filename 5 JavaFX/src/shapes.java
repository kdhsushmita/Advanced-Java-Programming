import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
public class Shapes extends Application{
public void start(Stage primaryStage) {
 primaryStage.setTitle("Shapes");
 Group group = new Group();

 Circle circle = new Circle();
 circle.setCenterX(300);
 circle.setCenterY(100);
 circle.setRadius(50);
 circle.setFill(Color.BLUE);
 group.getChildren().addAll(circle);

 Line line = new Line();
 line.setStartX(10);
 line.setStartY(10);
 line.setEndX(200);
 line.setEndY(10);
 group.getChildren().add(line);

 Rectangle rect=new Rectangle();
 rect.setX(20);
 rect.setY(20);
 rect.setWidth(100);
 rect.setHeight(100);
 group.getChildren().addAll(rect);

 Ellipse elipse = new Ellipse();
 elipse.setCenterX(200);
 elipse.setCenterY(200);
 elipse.setRadiusX(50);
 elipse.setRadiusY(80);
 group.getChildren().addAll(elipse);

 Scene scene = new Scene(group,400,500,Color.WHITE);
 primaryStage.setScene(scene);
 primaryStage.show();
}
public static void main(String[] args) {
 launch(args);
}
}