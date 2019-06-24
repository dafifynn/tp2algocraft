import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;


import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Mapa.Mapa;
import vista.MenuVista;
import vista.PintorVista;

import java.awt.*;

public class AplicacionAlgoCraft extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Stage principal = primaryStage;

        MenuVista menuPrincial = new MenuVista(principal);

/*

        menu.getChildren().add(botonDeInicio);

        ventana.setScene(visualizacion);
        ventana.show();
*/
    }
}
