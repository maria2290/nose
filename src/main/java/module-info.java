module com.leidy.heroes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.leidy.heroes to javafx.fxml;
    exports com.leidy.heroes;
}