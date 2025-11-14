package ph.edu.dlsu.lbycpa2.vpms;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClosestRoomAssignmentController {

    @FXML private TextField txtStart;
    @FXML private TextField txtEnd;
    @FXML private Button btnFind;
    @FXML private ListView<String> listPath;

    @FXML
    public void initialize() {
        btnFind.setOnAction(e -> findPath());
    }

    private void findPath() {
        listPath.getItems().clear();
        String start = txtStart.getText();
        String end = txtEnd.getText();

        if (start.isEmpty() || end.isEmpty()) {
            listPath.getItems().add("Please enter both rooms.");
            return;
        }

        // Placeholder output
        listPath.getItems().add("Shortest path from " + start + " to " + end + ":");
        listPath.getItems().add("→ SampleRoom1");
        listPath.getItems().add("→ SampleRoom2");
        listPath.getItems().add("→ " + end);
    }
}