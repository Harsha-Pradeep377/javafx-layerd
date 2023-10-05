package lk.ijse.javafxlayerd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Item Form");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }
}
