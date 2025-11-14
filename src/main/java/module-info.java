module ph.edu.dlsu.lbycpa2.vpms {
    requires javafx.controls;
    requires javafx.fxml;


    opens ph.edu.dlsu.lbycpa2.vpms to javafx.fxml;
    exports ph.edu.dlsu.lbycpa2.vpms;
}