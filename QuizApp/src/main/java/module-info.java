module com.php.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;

    opens com.php.quizapp to javafx.fxml;
    exports com.php.quizapp;
}
