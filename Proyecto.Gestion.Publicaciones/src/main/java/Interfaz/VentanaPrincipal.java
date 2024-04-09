package Interfaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaPrincipal extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creamos botones para cada módulo
        Button editorButton = new Button("Editor de Texto");
        Button comparadorButton = new Button("Comparador y Contador de Contenido");
        Button busquedaButton = new Button("Búsqueda de Palabras y Gestión de Contactos");
        Button interfazButton = new Button("Interfaz Gráfica Avanzada");
        Button validacionButton = new Button("Validación de Email y Diseño Gráfico");

        // Manejamos los eventos de clic en los botones
        editorButton.setOnAction(event -> {
            // Aquí puedes abrir la funcionalidad del editor de texto
            System.out.println("Abriendo el Editor de Texto...");
        });

        comparadorButton.setOnAction(event -> {
            // Aquí puedes abrir la funcionalidad del comparador y contador de contenido
            System.out.println("Abriendo el Comparador y Contador de Contenido...");
        });

        busquedaButton.setOnAction(event -> {
            // Aquí puedes abrir la funcionalidad de búsqueda de palabras y gestión de contactos
            System.out.println("Abriendo la Búsqueda de Palabras y Gestión de Contactos...");
        });

        interfazButton.setOnAction(event -> {
            // Aquí puedes abrir la funcionalidad de la interfaz gráfica avanzada
            System.out.println("Abriendo la Interfaz Gráfica Avanzada...");
        });

        validacionButton.setOnAction(event -> {
            // Aquí puedes abrir la funcionalidad de validación de email y diseño gráfico
            System.out.println("Abriendo la Validación de Email y Diseño Gráfico...");
        });

        // Creamos un contenedor VBox para los botones
        VBox vbox = new VBox(editorButton, comparadorButton, busquedaButton, interfazButton, validacionButton);

        // Creamos la escena
        Scene scene = new Scene(vbox, 300, 250);

        // Configuramos el título de la ventana y mostramos la escena
        primaryStage.setTitle("Ventana Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
