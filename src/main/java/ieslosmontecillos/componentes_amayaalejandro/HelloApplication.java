package ieslosmontecillos.componentes_amayaalejandro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        StackPane sp = new StackPane();
        VBox vb = new VBox();
        Label lb = new Label("Probando componente");
        CampoTextoBoton ctb = new CampoTextoBoton();

        vb.getChildren().addAll(lb, ctb);
        sp.getChildren().add(vb);

        Pane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Probar Componente");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}