package vista;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import modelo.Constantes;

import java.io.File;

public final class CajaMusical {

    public static final Media principal = new Media(
            new File(Constantes.URL_AUDIO + Constantes.MUSICA_PRINCIPAL).toURI().toString());


    public static final Media caminar = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_CAMINAR).toURI().toString());

    public static final Media explosion = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_EXPLOSION).toURI().toString());

    public static final Media click = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_CLICK).toURI().toString());

    public static final Media abrir = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_ABRIR).toURI().toString());

    public static final Media cerrar = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_CERRAR).toURI().toString());

    public static final Media impacto = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_IMPACTO).toURI().toString());

    public static final Media sinHerramienta = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_SIN_HERRAMIENTA).toURI().toString());

    public static final Media vidrio = new Media(
            new File(Constantes.URL_AUDIO + Constantes.SONIDO_VIDRIO).toURI().toString());


    public static void reproducir(Media audio) {
        new MediaPlayer(audio).play();
    }

}
