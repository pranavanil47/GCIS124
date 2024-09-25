import javafx.application.Application;
import javafx.stage.Stage;



public class Firstgui extends Application {
    @Override
    public void start(Stage stage) throws Exception
    {
        Label label = new Label("muy first");
        label .setFont = new Font("Ariel", 10);
        label.setTextFill(Color, DARKOLIVEGREEN);

        Scene s = new Scene(label);
        stage.serScene(s);
        stage.setTitle("Fisrt GUI");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}