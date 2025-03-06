module edu.farmingdale.module_03individual_assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens edu.farmingdale.module_03individual_assignment to javafx.fxml;
    exports edu.farmingdale.module_03individual_assignment;
}