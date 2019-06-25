package vista;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Constantes;
import modelo.Juego.Artista;
import modelo.Jugador.Inventario;
import modelo.Mapa.Mapa;

import java.util.Observable;
import java.util.Observer;

public class InventarioVista implements Observer {

    private Scene vista;
    private Group elementos;

    public InventarioVista() {

        this.elementos = PintorVista.crearGrupoBasadoEnInventario(new Inventario());
        this.vista = new Scene(elementos,480,480);
    }

    @Override
    public void update(Observable observable, Object arg) {

        if(observable instanceof Inventario) {
            Inventario actualizado = (Inventario) observable;
            this.elementos.getChildren().removeAll(this.elementos.getChildren());
            //this.elementos.getChildren().addAll(PintorVista.crearGrupoBasadoEnInventario(actualizado));
            //TODO: optimizar
        }
    }

    public Scene visualizacion() {
        return this.vista;
    }

    public Group elementos() {
        return this.elementos;
    }

    private Group crearBotones(Inventario modelo) {

        Image casilla = new Image("slot2.png");

        Group botones = new Group();

        int filasHerramientas = Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS / 9;

        for(int i = 0; i < filasHerramientas; i++) {

            for(int j = 0; j < 9 ; j ++) {

                Button boton = new Button();
                boton.setLayoutX(24 + (j * 48));
                boton.setLayoutY( 240 + (i * 48));
                boton.setGraphic(new ImageView(casilla));
                boton.setOnAction(event -> {
                    //si el boton corresponde a una herramienta
                    //modelo.seleccionarHerramienta(posicion i j)
                    //si el boton corresponde a un material
                    //modelo.seleccionarMaterial
                });
                botones.getChildren().add(boton);
            }
        }
        return botones;
    }
}

