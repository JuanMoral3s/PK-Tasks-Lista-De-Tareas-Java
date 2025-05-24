module org.example.pktaskslistadetareasjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.pktaskslistadetareasjava to javafx.fxml;
    opens org.example.pktaskslistadetareasjava.controller to javafx.fxml;
    exports org.example.pktaskslistadetareasjava;
}

