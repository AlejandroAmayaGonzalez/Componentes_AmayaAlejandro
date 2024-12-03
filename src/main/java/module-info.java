module ieslosmontecillos.componentes_amayaalejandro {
    requires javafx.controls;
    requires javafx.fxml;


    opens ieslosmontecillos.componentes_amayaalejandro to javafx.fxml;
    exports ieslosmontecillos.componentes_amayaalejandro;
}