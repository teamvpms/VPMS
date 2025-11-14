package ph.edu.dlsu.lbycpa2.vpms;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Stack;

public class UserActionTrackingController {

    @FXML private TextField txtAction;
    @FXML private Button btnPush;
    @FXML private Button btnUndo;
    @FXML private ListView<String> listStack;

    private Stack<String> stack = new Stack<>();

    @FXML
    public void initialize() {
        btnPush.setOnAction(e -> pushAction());
        btnUndo.setOnAction(e -> undoAction());
    }

    private void pushAction() {
        String action = txtAction.getText();
        if (action.isEmpty()) return;

        stack.push(action);
        listStack.getItems().add("Pushed: " + action);
        txtAction.clear();
    }

    private void undoAction() {
        if (stack.isEmpty()) {
            listStack.getItems().add("Stack empty.");
            return;
        }

        String undone = stack.pop();
        listStack.getItems().add("Undo: " + undone);
    }
}