package vista;

import javafx.scene.Group;
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
            Mapa actualizado = (Mapa) observable;
            this.materiales.getChildren().removeAll(this.materiales.getChildren());
            materiales.getChildren().addAll(PintorVista.crearGrupoBasadoEnMapa(actualizado));
            //TODO: optimizar
        }
    }
}
