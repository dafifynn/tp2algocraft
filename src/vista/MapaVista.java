package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modelo.Constantes;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;

import java.util.Observable;
import java.util.Observer;

public class MapaVista implements Observer {

    private Group materiales;

    public MapaVista(Group contenedor, Mapa modelo) {

        materiales = PintorVista.crearGrupoBasadoEnMapa(modelo);
        contenedor.getChildren().addAll(materiales);

        observar(modelo);
    }

    public void observar(Observable observable) {

        if(observable instanceof Mapa) {
            Mapa modelo = (Mapa) observable;
            modelo.agregarObservador(this);
        }
    }

    @Override
    public void update(Observable observable, Object arg) {

        if(observable instanceof Mapa) {
            Coordenada coordenada = (Coordenada) arg;
            this.actualizarCoordenadaMapa(coordenada);
        }
    }

    private void actualizarCoordenadaMapa (Coordenada coordenada) {
        Rectangle rectangle = new Rectangle(Constantes.PIXELES,Constantes.PIXELES);
        rectangle.setLayoutX(coordenada.obtenerColumna() * Constantes.PIXELES);
        rectangle.setLayoutY(coordenada.obtenerFila() * Constantes.PIXELES);
        rectangle.setFill(new ImagePattern(new Image("file:Resources/mapa/" + "pasto.png")));
        materiales.getChildren().add(rectangle);
    }
}
