package ph.edu.dlsu.lbycpa2.vpms.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.HashMap;

public class RecordRetrievalController {

    @FXML private TextField txtKey;
    @FXML private TextField txtRecord;
    @FXML private Button btnInsert;
    @FXML private Button btnRetrieve;
    @FXML private ListView<String> listRecords;

    private HashMap<String, String> table = new HashMap<>();

    @FXML
    public void initialize() {
        btnInsert.setOnAction(e -> insert());
        btnRetrieve.setOnAction(e -> retrieve());
    }

    private void insert() {
        String key = txtKey.getText();
        String record = txtRecord.getText();

        if (key.isEmpty() || record.isEmpty()) return;

        table.put(key, record);
        listRecords.getItems().add("Inserted [" + key + "]: " + record);

        txtKey.clear();
        txtRecord.clear();
    }

    private void retrieve() {
        String key = txtKey.getText();

        if (table.containsKey(key)) {
            listRecords.getItems().add("Record: " + table.get(key));
        } else {
            listRecords.getItems().add("Record not found.");
        }
    }
}