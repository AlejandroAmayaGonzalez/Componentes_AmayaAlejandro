package ieslosmontecillos.componentes_amayaalejandro;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

import java.io.IOException;

public class Temporizador extends HBox {
    @FXML
    private Label lb_countdown;
    SimpleIntegerProperty counter = new SimpleIntegerProperty(20);

    public Temporizador() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "temporizador.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        lb_countdown.textProperty().bind(counter.asString());
    }

    public int getCounter() {
        return counter.get();
    }

    public SimpleIntegerProperty counterProperty() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter.set(counter);
    }

    public void doCountdown() {

        final Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(counter.get()),
                new KeyValue (counter, 0)));
        timeline.play();
    }
}
