package Interfaz;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SeguimientoRaton {
    public SeguimientoRaton(Stage primaryStage) {
        // Creamos una etiqueta para mostrar las coordenadas del ratón
        Label coordenadasLabel = new Label("Coordenadas del ratón: ");

        // Creamos un contenedor StackPane para la escena
        StackPane root = new StackPane();
        root.getChildren().add(coordenadasLabel);

        // Creamos la escena
        Scene scene = new Scene(root, 400, 300);

        // Manejamos el evento de movimiento del ratón
        scene.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
            coordenadasLabel.setText("Coordenadas del ratón: X=" + x + ", Y=" + y);
        });

        // Configuramos el título de la ventana y mostramos la escena
        primaryStage.setTitle("Seguimiento del Ratón");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
