import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class UI extends Application {

 @Override
 public void start(Stage primaryStage) throws Exception {
 VBox root = new VBox();

 Label my_label=new Label("Name");
 root.getChildren().add(my_label);

 TextField name = new TextField();
 root.getChildren().add(name);

 ToggleGroup group = new ToggleGroup();
 RadioButton male = new RadioButton("Male");
 RadioButton female = new RadioButton("Female");
 male.setToggleGroup(group);
 female.setToggleGroup(group);
 root.getChildren().addAll(male,female);

 CheckBox java = new CheckBox("Java");
 CheckBox python = new CheckBox("Python");
 root.getChildren().addAll(java, python);

 Hyperlink hp = new Hyperlink("https://www.google.com");
 hp.setOnAction(e -> System.out.println("Link Clicked"));
 root.getChildren().add(hp);

 MenuBar menubar = new MenuBar();
 Menu FileMenu = new Menu("File");
 MenuItem filemenu1=new MenuItem("new");
 MenuItem filemenu2=new MenuItem("Save");
 MenuItem filemenu3=new MenuItem("Exit");
 FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3);
 menubar.getMenus().addAll(FileMenu);

 Tooltip tool=new Tooltip();
 tool.setText("Info - Submit the data");


 FileChooser file = new FileChooser();
 file.setTitle("Open File");
 file.showOpenDialog(primaryStage);

 Button btn=new Button("This is a button");
 root.getChildren().add(btn);
 btn.setTooltip(tool);

 Scene scene=new Scene(root,300,300);

 primaryStage.setScene(scene);
 primaryStage.setTitle("UI");
 primaryStage.show();

 }
 public static void main(String[] args) {
 launch(args);
 }
}