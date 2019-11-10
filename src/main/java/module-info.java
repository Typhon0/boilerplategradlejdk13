module boilerplategradlejdk13 {
    requires javafx.controls;
    requires javafx.fxml;
    opens boilerplategradlejdk13 to javafx.fxml;
    opens boilerplategradlejdk13.controller to javafx.fxml;

    exports boilerplategradlejdk13;
}