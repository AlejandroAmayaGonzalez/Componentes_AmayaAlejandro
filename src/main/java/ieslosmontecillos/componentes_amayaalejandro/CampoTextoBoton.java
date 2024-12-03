package ieslosmontecillos.componentes_amayaalejandro;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class CampoTextoBoton extends HBox {
    @FXML
    private TextField tf;

    public CampoTextoBoton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "campoTextoBoton.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return tf.textProperty();
    }

    public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
        return onAction;
    }

    public final void setOnAction(EventHandler<ActionEvent> value) {
        onActionProperty().set(value);
    }

    private ObjectProperty<EventHandler<ActionEvent>> onAction = new
            ObjectPropertyBase<EventHandler<ActionEvent>>() {
                @Override
                protected void invalidated() {
                    setEventHandler(ActionEvent.ACTION, get());
                }
                @Override
                public Object getBean() {
                    return CampoTextoBoton.this;
                }
                @Override
                public String getName() {
                    return "onAction";
                }
            };

    @FXML
    protected void doSomething() {
        System.out.println("The button was clicked");
    }
}
