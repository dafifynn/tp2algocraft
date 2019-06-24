package vista;

import javafx.scene.Group;

public class InventarioVista {

    private Group elementos;

    public InventarioVista(Group contenedor) {

        elementos = PintorVista.crearGrupoInventario();
        contenedor.getChildren().addAll(elementos);
    }
}

