package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import modelo.Constantes;
import modelo.EstrategiaDeDireccion.*;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
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

    public static Image HACHA_MADERA = new Image(Constantes.URL_HERRAMIENTA + "HachaMadera.png");
    public static Image HACHA_PIEDRA = (new Image(Constantes.URL_HERRAMIENTA + "HachaPiedra.png"));
    public static Image HACHA_METAL = (new Image(Constantes.URL_HERRAMIENTA + "HachaMetal.png"));
    public static Image PICO_MADERA = (new Image(Constantes.URL_HERRAMIENTA + "PicoMadera.png"));
    public static Image PICO_PIEDRA = (new Image(Constantes.URL_HERRAMIENTA + "PicoPiedra.png"));
    public static Image PICO_METAL = (new Image(Constantes.URL_HERRAMIENTA + "PicoMetal.png"));
    public static Image PICO_FINO = (new Image(Constantes.URL_HERRAMIENTA + "PicoFino.png"));

    public static Image BLOQUE_MADERA = (new Image("bloqueMaterial/BloqueMadera.png"));
    public static Image BLOQUE_PIEDRA = (new Image("bloqueMaterial/BloquePiedra.png"));
    public static Image BLOQUE_METAL = (new Image("bloqueMaterial/BloqueMetal.png"));
    public static Image BLOQUE_DIAMANTE = (new Image("bloqueMaterial/BloqueDiamante.png"));

    public static Image HACHA_MADERA_ACTUAL = new Image(Constantes.URL_HERRAMIENTA + "HachaMaderaActual.png");
    public static Image HACHA_PIEDRA_ACTUAL = (new Image(Constantes.URL_HERRAMIENTA + "HachaPiedraActual.png"));
    public static Image HACHA_METAL_ACTUAL = (new Image(Constantes.URL_HERRAMIENTA + "HachaMetalActual.png"));
    public static Image PICO_MADERA_ACTUAL = (new Image(Constantes.URL_HERRAMIENTA + "PicoMaderaActual.png"));
    public static Image PICO_PIEDRA_ACTUAL = (new Image(Constantes.URL_HERRAMIENTA + "PicoPiedraActual.png"));
    public static Image PICO_METAL_ACTUAL = (new Image(Constantes.URL_HERRAMIENTA + "PicoMetalActual.png"));
    public static Image PICO_FINO_ACTUAL = (new Image(Constantes.URL_HERRAMIENTA + "PicoFinoActual.png"));


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

    public static ImageView buscarHerramientaInventario (Herramienta herramienta) {
        if (herramienta == null) {
            return new ImageView("slot2.png");
        }
        if((herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_MADERA) && (herramienta.getClass().isAssignableFrom(Hacha.class))){
            return new ImageView(HACHA_MADERA);
        }
        else if((herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_PIEDRA) && (herramienta.getClass().isAssignableFrom(Hacha.class))) {
            return new ImageView(HACHA_PIEDRA);
        }
        else if((herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_METAL) && (herramienta.getClass().isAssignableFrom(Hacha.class))) {
            return new ImageView(HACHA_METAL);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_MADERA && (herramienta.getClass().isAssignableFrom(Pico.class))) {
            return new ImageView(PICO_MADERA);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_PIEDRA && (herramienta.getClass().isAssignableFrom(Pico.class))) {
            return new ImageView(PICO_PIEDRA);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_METAL && (herramienta.getClass().isAssignableFrom(Pico.class))) {
            return new ImageView(PICO_METAL);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_FINO && (herramienta.getClass().isAssignableFrom(PicoFino.class))) {
            return new ImageView(PICO_FINO);
        }
        else {
            return new ImageView("slot2.png");
        }
    }

    public static ImageView buscarUnidadDeMaterial (Material material) {
        if(material.getClass().isAssignableFrom(MaterialMadera.class)){
            return new ImageView(BLOQUE_MADERA);

        }else if (material.getClass().isAssignableFrom(MaterialPiedra.class)){
            return new ImageView(BLOQUE_PIEDRA);

        }else if(material.getClass().isAssignableFrom(MaterialMetal.class)){
            return new ImageView(BLOQUE_METAL);
        }
        return new ImageView(BLOQUE_DIAMANTE);
    }

    public static ImageView buscarHerrammientaEquipada (Herramienta herramienta) {
        if (herramienta == null) {
            return new ImageView("slot3.png");
        }
        if((herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_MADERA) && (herramienta.getClass().isAssignableFrom(Hacha.class))){
            return new ImageView(HACHA_MADERA_ACTUAL);
        }
        else if((herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_PIEDRA) && (herramienta.getClass().isAssignableFrom(Hacha.class))) {
            return new ImageView(HACHA_PIEDRA_ACTUAL);
        }
        else if((herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_METAL) && (herramienta.getClass().isAssignableFrom(Hacha.class))) {
            return new ImageView(HACHA_METAL_ACTUAL);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_MADERA && (herramienta.getClass().isAssignableFrom(Pico.class))) {
            return new ImageView(PICO_MADERA_ACTUAL);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_PIEDRA && (herramienta.getClass().isAssignableFrom(Pico.class))) {
            return new ImageView(PICO_PIEDRA_ACTUAL);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_METAL && (herramienta.getClass().isAssignableFrom(Pico.class))) {
            return new ImageView(PICO_METAL_ACTUAL);
        }
        else if(herramienta.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_FINO && (herramienta.getClass().isAssignableFrom(PicoFino.class))) {
            return new ImageView(PICO_FINO_ACTUAL);
        }
        else {
            return new ImageView("slot3.png");
        }
    }

}
