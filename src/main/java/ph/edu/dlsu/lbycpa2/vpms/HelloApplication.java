package ph.edu.dlsu.lbycpa2.vpms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ph/edu/dlsu/lbycpa2/vpms/Main-View.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("Velasco Patient Management System");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
