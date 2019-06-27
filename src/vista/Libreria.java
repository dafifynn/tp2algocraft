package vista;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import modelo.Constantes;
import modelo.EstrategiaDeDireccion.*;
import modelo.Material.*;

public final class Libreria {

    public static ImagePattern PASTO = new ImagePattern(new Image(Constantes.URL_VACIO_DEL_MAPA));
    public static ImagePattern MADERA = new ImagePattern(new Image(Constantes.URL_MATERIALES_DEL_MAPA + "MaterialMadera.png"));
    public static ImagePattern PIEDRA = new ImagePattern(new Image(Constantes.URL_MATERIALES_DEL_MAPA + "MaterialPiedra.png"));
    public static ImagePattern METAL = new ImagePattern(new Image(Constantes.URL_MATERIALES_DEL_MAPA + "MaterialMetal.png"));
    public static ImagePattern DIAMANTE = new ImagePattern(new Image(Constantes.URL_MATERIALES_DEL_MAPA + "MaterialDiamante.png"));

    public static ImagePattern ARRIBA = new ImagePattern(new Image(Constantes.URL_ROTAR_JUGADOR + "jugadorDireccionArriba.png"));
    public static ImagePattern ABAJO = new ImagePattern(new Image(Constantes.URL_ROTAR_JUGADOR + "jugadorDireccionAbajo.png"));
    public static ImagePattern IZQUIERDA = new ImagePattern(new Image(Constantes.URL_ROTAR_JUGADOR + "jugadorDireccionIzquierda.png"));
    public static ImagePattern DERECHA = new ImagePattern(new Image(Constantes.URL_ROTAR_JUGADOR + "jugadorDireccionDerecha.png"));

    //Metodo para buscar imagen correspondiente a un material
    public static ImagePattern buscar(Material modelo) {

        if(modelo instanceof MaterialMadera) {
            return MADERA;
        }
        else if(modelo instanceof MaterialPiedra) {
            return PIEDRA;
        }
        else if(modelo instanceof MaterialMetal) {
            return METAL;
        }
        else if(modelo instanceof MaterialDiamante) {
            return DIAMANTE;
        }
        else return PASTO;
    }

    //Metodo para buscar imagen correspondiente a rotacion
    public static ImagePattern buscar(EstrategiaDeDireccion direccion) {

        if(direccion instanceof DireccionArriba) {
            return ARRIBA;
        }
        else if(direccion instanceof DireccionAbajo) {
            return ABAJO;
        }
        else if(direccion instanceof DireccionIzquierda) {
            return IZQUIERDA;
        }
        else if(direccion instanceof DireccionDerecha) {
            return DERECHA;
        }
        else return ABAJO;
    }

}
