package ph.edu.dlsu.lbycpa2.vpms.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PatientPriorityQueueController {

    @FXML private TextField txtPatient;
    @FXML private TextField txtPriority;
    @FXML private Button btnAdd;
    @FXML private Button btnServe;
    @FXML private ListView<String> listQueue;

    private static class Patient {
        String name;
        int priority;

        Patient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    private PriorityQueue<Patient> pq = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.priority).reversed()
    );

    @FXML
    public void initialize() {
        btnAdd.setOnAction(e -> addPatient());
        btnServe.setOnAction(e -> servePatient());
    }

    private void addPatient() {
        String name = txtPatient.getText();
        int priority;

        try {
            priority = Integer.parseInt(txtPriority.getText());
        } catch (Exception e) {
            listQueue.getItems().add("Invalid priority.");
            return;
        }

        pq.add(new Patient(name, priority));
        listQueue.getItems().add("Added: " + name + " (P=" + priority + ")");

        txtPatient.clear();
        txtPriority.clear();
    }

    private void servePatient() {
        if (pq.isEmpty()) {
            listQueue.getItems().add("Queue empty.");
            return;
        }

        Patient p = pq.poll();
        listQueue.getItems().add("Served: " + p.name + " (P=" + p.priority + ")");
    }
}