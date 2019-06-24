package vista;

import javafx.scene.Group;
import modelo.Mapa.Mapa;

public class MapaVista {

    private Group materiales;

    public MapaVista(Group contenedor) {

        materiales = PintorVista.crearGrupoBasadoEnMapa(new Mapa());
        contenedor.getChildren().addAll(materiales);
    }
}
