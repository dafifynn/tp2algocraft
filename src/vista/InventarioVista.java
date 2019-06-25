package vista;

import javafx.scene.Group;
import modelo.Juego.Artista;
import modelo.Jugador.Inventario;
import modelo.Mapa.Mapa;

import java.util.Observable;
import java.util.Observer;

public class InventarioVista implements Observer {

    private Group elementos;

    public InventarioVista(Group contenedor) {

//        elementos = PintorVista.crearGrupoInventario();
//        contenedor.getChildren().addAll(elementos);
        contenedor.getChildren().addAll(PintorVista.crearGrupoBasadoEnInventario(new Inventario()));
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
}

