package vista;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import modelo.Constantes;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Jugador.Inventario;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.*;

public class PintorVista {

    public static Canvas crearBienvenida() {

        Canvas bienvenida = new Canvas(1000,500);

        GraphicsContext contenidoBienvenida = bienvenida.getGraphicsContext2D();

        contenidoBienvenida.setFill(Color.GREEN);
        contenidoBienvenida.setStroke(Color.BLACK);
        contenidoBienvenida.setLineWidth(2);
        contenidoBienvenida.setFont(Font.font("Verdana", FontWeight.BOLD, 100));
        contenidoBienvenida.fillText("ALGOCRAFT", 140,130);
        contenidoBienvenida.strokeText("ALGOCRAFT",140,130);

        Image creeper = new Image("creeper.png");
        contenidoBienvenida.drawImage(creeper,220,200);

        return bienvenida;
    }

    public static Group crearGrupoInventario(){

        Group grupo = new Group();

        for(int i = 0; i <= Constantes.FILAS_INVENTARIO; i ++){
            for(int j = 0; j <= Constantes.COLUMNAS_INVENTARIO; j++){

                Rectangle rectangle = new Rectangle(Constantes.PIXELES,Constantes.PIXELES);
                rectangle.setFill(Color.BLUE);
                rectangle.setLayoutX(i * Constantes.PIXELES);
                rectangle.setLayoutY(j * Constantes.PIXELES);
                grupo.getChildren().add(rectangle);

            }
        }
        return grupo;

    }

    private static void aniadirMaterialAlGrupoDelMapa (Mapa mapa, int i, int j, Group grupo) {
        Rectangle rectangle = new Rectangle(Constantes.PIXELES,Constantes.PIXELES);
        rectangle.setLayoutX(i * Constantes.PIXELES);
        rectangle.setLayoutY(j * Constantes.PIXELES);

        try {
            Material material = mapa.obtenerMaterial(new Coordenada(j,i));
            rectangle.setFill(new ImagePattern(new Image(Constantes.URL_MATERIALES_DEL_MAPA + material.getClass().getSimpleName() + ".png")));
        }
        catch (MaterialInexistenteException e) {
            rectangle.setFill(new ImagePattern(new Image(Constantes.URL_VACIO_DEL_MAPA)));
        }

        grupo.getChildren().add(rectangle);
    }

    public static Group crearGrupoBasadoEnMapa(Mapa mapa) {

        Group grupo = new Group();

        for(int i = 0; i <= Constantes.MAPA_COLUMNAS_DEFECTO; i++) {

            for(int j = 0; j <= Constantes.MAPA_FILAS_DEFECTO; j++) {

                aniadirMaterialAlGrupoDelMapa(mapa, i, j, grupo);
            }
        }

        return grupo;
    }

    public static Group crearGrupoBasadoEnInventario(Inventario inventario) {

        Image casilla = new Image("slot2.png");

        Group elementos = new Group();

        int filasHerramientas = Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS / 9;

        for(int i = 0; i < filasHerramientas; i++) {

            for(int j = 0; j < 9 ; j ++) {

                Button boton = new Button();
                boton.setLayoutX(24 + (j * 48));
                boton.setLayoutY( 240 + (i * 48));
                boton.setGraphic(new ImageView(casilla));

                elementos.getChildren().add(boton);
            }
        }
        return elementos;
    }


    public static Rectangle crearFiguraJugador(Jugador modelo) {

        Image jugador = new Image("jugador/jugadorAbajo.png");

        Rectangle vista = new Rectangle(Constantes.PIXELES,Constantes.PIXELES);
        vista.setFill(new ImagePattern(jugador));
        vista.setLayoutX(Constantes.JUGADOR_COORDENADA_COLUMNA_DEFECTO * Constantes.PIXELES);
        vista.setLayoutY(Constantes.JUGADOR_COORDENADA_FILA_DEFECTO * Constantes.PIXELES);

        return vista;
    }
}
