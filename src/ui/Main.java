package ui;

import controllers.ControllerMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fl = new FXMLLoader(getClass().getResource("../windows/main.fxml"));
        fl.setController(new ControllerMain());
        Parent p = fl.load();
        primaryStage.setScene(new Scene(p));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
