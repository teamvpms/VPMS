package ph.edu.dlsu.lbycpa2.vpms.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class DynamicResourceAllocationController {

    @FXML private TextField txtStaff;
    @FXML private TextField txtRoom;
    @FXML private Button btnAssign;
    @FXML private ListView<String> listAssignments;

    @FXML
    public void initialize() {
        btnAssign.setOnAction(e -> assignResource());
    }

    private void assignResource() {
        String staff = txtStaff.getText();
        String room = txtRoom.getText();

        if (staff.isEmpty() || room.isEmpty()) {
            listAssignments.getItems().add("Please fill both fields.");
            return;
        }

        listAssignments.getItems().add(staff + " → Room " + room);
        txtStaff.clear();
        txtRoom.clear();
    }
}