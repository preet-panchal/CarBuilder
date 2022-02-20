module csci2020u.assignmentone.carbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens csci2020u.assignmentone.carbuilder to javafx.fxml;
    exports csci2020u.assignmentone.carbuilder;
}