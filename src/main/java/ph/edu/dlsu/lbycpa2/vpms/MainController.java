package ph.edu.dlsu.lbycpa2.vpms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.net.URL;

public class MainController {

    @FXML private Button btnDynamic;
    @FXML private Button btnAction;
    @FXML private Button btnDirectory;
    @FXML private Button btnRoom;
    @FXML private Button btnRecord;
    @FXML private Button btnQueue;

    @FXML
    public void initialize() {
        btnDynamic.setOnAction(e -> open("/ph/edu/dlsu/lbycpa2/vpms/DRA-View.fxml"));
        btnAction.setOnAction(e -> open("/ph/edu/dlsu/lbycpa2/vpms/UAT-View.fxml"));
        btnDirectory.setOnAction(e -> open("/ph/edu/dlsu/lbycpa2/vpms/SD-View.fxml"));
        btnRoom.setOnAction(e -> open("/ph/edu/dlsu/lbycpa2/vpms/CRA-View.fxml"));
        btnRecord.setOnAction(e -> open("/ph/edu/dlsu/lbycpa2/vpms/RR-View.fxml"));
        btnQueue.setOnAction(e -> open("/ph/edu/dlsu/lbycpa2/vpms/PPQ-View.fxml"));
    }

    private void open(String path) {
        try {
            URL url = getClass().getResource(path);

            if (url == null) {
                System.err.println("FXML NOT FOUND: " + path);
                return;
            }

            FXMLLoader loader = new FXMLLoader(url);
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}