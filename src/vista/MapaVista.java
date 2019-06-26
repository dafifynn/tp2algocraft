package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modelo.Constantes;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.Material;

import java.util.Observable;
import java.util.Observer;

public class MapaVista implements Observer {

    private Group materiales;

    public MapaVista(Group contenedor, Mapa modelo) {

        this.materiales = new Group();

        this.inicializarGrupoBasadoEnMapa(modelo);
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
            Mapa mapa = (Mapa) observable;
            Coordenada coordenada = (Coordenada) arg;
            this.aniadirMaterialAlGrupoDelMapa(mapa, coordenada.obtenerColumna(), coordenada.obtenerFila());
        }
    }


    private void aniadirMaterialAlGrupoDelMapa (Mapa mapa, int i, int j) {
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

        this.materiales.getChildren().add(rectangle);
    }

    private void  inicializarGrupoBasadoEnMapa(Mapa mapa) {

        for(int i = 0; i <= Constantes.MAPA_COLUMNAS_DEFECTO; i++) {

            for(int j = 0; j <= Constantes.MAPA_FILAS_DEFECTO; j++) {

                aniadirMaterialAlGrupoDelMapa(mapa, i, j);
            }
        }
    }
}
