open module com.dlsc.showcasefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires java.logging;
    requires javafx.web;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;
    requires fr.brouillard.oss.cssfx;
    requires org.scenicview.scenicview;

    exports com.dlsc.showcase;
    exports com.dlsc.showcase.app;
}