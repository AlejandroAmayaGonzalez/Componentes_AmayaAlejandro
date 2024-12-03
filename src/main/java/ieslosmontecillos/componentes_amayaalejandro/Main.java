package ieslosmontecillos.componentes_amayaalejandro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        VBox vb1 = new VBox();
        Label lb = new Label("Probando componente");

        // CampoTextoBoton y CampotextoNumerico implementación
        OriginalCampoTextoBoton octb = new OriginalCampoTextoBoton();
        CampoTextoNumerico ctn = new CampoTextoNumerico();

        vb1.getChildren().addAll(lb, octb, ctn);

        // UseSelector implementación
        VBox vb2 = new VBox();
        Label res = new Label();
        UseSelector us1 = new UseSelector();
        UseSelector us2 = new UseSelector();

        us1.setOnAction(actionEvent -> res.setText("Se ha pulsado el selector de arriba."));
        us2.setOnAction(actionEvent -> res.setText("Se ha pulsado el selector de abajo."));

        vb2.getChildren().addAll(us1, us2, res);

        // Implementación CampoTextoBoton
        VBox vb3 = new VBox();
        Label lb_grabado = new Label();
        CampoTextoBoton ctb2 = new CampoTextoBoton();
        CampoTextoBoton ctb3 = new CampoTextoBoton();

        ctb2.setOnAction(actionEvent -> lb_grabado.setText("Grabado: " + ctb2.getText()));
        ctb3.setOnAction(actionEvent -> lb_grabado.setText("Grabado: " + ctb3.getText()));

        vb3.getChildren().addAll(ctb2, ctb3, lb_grabado);

        // Implementación del timer

        root.setSpacing(10);
        root.getChildren().addAll(vb1, vb2, vb3);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Probar Componente");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}