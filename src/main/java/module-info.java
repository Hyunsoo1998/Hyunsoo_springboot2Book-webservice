module com.jolodu.book.freelecspringboot2webservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jolodu.book.freelecspringboot2webservice to javafx.fxml;
    exports com.jolodu.book.freelecspringboot2webservice;
}