package Interfaz;

import javafx.scene.control.ScrollBar;
import javafx.geometry.Orientation;


public class BarraDesplazamiento extends ScrollBar {
    public BarraDesplazamiento() {
        super();
        // Configurar la orientación de la barra de desplazamiento
        setOrientation(Orientation.VERTICAL);
        // Configurar el rango y la unidad de la barra de desplazamiento
        setMin(0);
        setMax(100);
        setUnitIncrement(10);
        // Manejar los eventos de cambio de valor
        valueProperty().addListener((observable, oldValue, newValue) -> {
            // Actualizar la posición del documento según el valor de la barra de desplazamiento
            // Por ejemplo, puedes usar este valor para desplazar un área de texto o un contenido similar
            double scrollValue = newValue.doubleValue();
            System.out.println("Valor de la barra de desplazamiento: " + scrollValue);
            // Aquí puedes realizar las acciones necesarias para actualizar la posición del documento
        });
    }
}
