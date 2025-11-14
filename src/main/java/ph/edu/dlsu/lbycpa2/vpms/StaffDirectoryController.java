package ph.edu.dlsu.lbycpa2.vpms;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.TreeSet;

public class StaffDirectoryController {

    @FXML private TextField txtName;
    @FXML private Button btnInsert;
    @FXML private Button btnSearch;
    @FXML private Button btnInorder;
    @FXML private Button btnPreorder;
    @FXML private Button btnPostorder;
    @FXML private ListView<String> listOutput;

    private TreeSet<String> bst = new TreeSet<>();

    @FXML
    public void initialize() {
        btnInsert.setOnAction(e -> insertStaff());
        btnSearch.setOnAction(e -> searchStaff());
        btnInorder.setOnAction(e -> showInorder());
        btnPreorder.setOnAction(e -> showPreorder());
        btnPostorder.setOnAction(e -> showPostorder());
    }

    private void insertStaff() {
        String name = txtName.getText();
        if (!name.isEmpty()) {
            bst.add(name);
            listOutput.getItems().add("Inserted: " + name);
            txtName.clear();
        }
    }

    private void searchStaff() {
        String name = txtName.getText();
        if (bst.contains(name))
            listOutput.getItems().add("Found: " + name);
        else
            listOutput.getItems().add("Not found: " + name);
    }

    private void showInorder() {
        listOutput.getItems().setAll(bst);
    }

    private void showPreorder() {
        listOutput.getItems().setAll("Preorder traversal not implemented.");
    }

    private void showPostorder() {
        listOutput.getItems().setAll("Postorder traversal not implemented.");
    }
}