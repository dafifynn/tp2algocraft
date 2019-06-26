package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modelo.Constantes;
import modelo.EstrategiaDeDireccion.*;

public class JugadorVista {

    private Rectangle figura;

    JugadorVista(Group contenedor) {

        int jugadorX = Constantes.JUGADOR_COORDENADA_COLUMNA_DEFECTO * Constantes.PIXELES;
        int jugadorY = Constantes.JUGADOR_COORDENADA_FILA_DEFECTO * Constantes.PIXELES;

        this.figura = new Rectangle(Constantes.PIXELES,Constantes.PIXELES);
        this.figura.setLayoutX(jugadorX);
        this.figura.setLayoutY(jugadorY);

        this.rotarJugador(new DireccionAbajo());

        contenedor.getChildren().add(figura);
    }

    public void moverJugador(Group elementos, EstrategiaDeDireccion direccion) {

        double anteriorX = this.figura.getLayoutX();
        double anteriorY = this.figura.getLayoutY();

        //remuevo la figura anterior
        elementos.getChildren().remove(this.figura);

        //actualizo
        if(direccion.getClass().isAssignableFrom(DireccionArriba.class)) {
            actualizarFigura(anteriorX, anteriorY - Constantes.PIXELES);
        }
        else if (direccion.getClass().isAssignableFrom(DireccionAbajo.class)) {
            actualizarFigura(anteriorX, anteriorY + Constantes.PIXELES);
        }
        else if (direccion.getClass().isAssignableFrom(DireccionIzquierda.class)) {
            actualizarFigura(anteriorX - Constantes.PIXELES, anteriorY);
        }
        else if (direccion.getClass().isAssignableFrom(DireccionDerecha.class)) {
            actualizarFigura(anteriorX + Constantes.PIXELES, anteriorY);
        }
        //agrego la nueva figura
        elementos.getChildren().add(this.figura);
    }

    public void rotarJugador(EstrategiaDeDireccion direccion) {

        Image imagen = new Image(Constantes.URL_ROTAR_JUGADOR + direccion.getClass().getSimpleName() + ".png");
        this.figura.setFill(new ImagePattern(imagen));

    }

    private void actualizarFigura(double nuevoX, double nuevoY) {

        this.figura = new Rectangle(Constantes.PIXELES,Constantes.PIXELES,this.figura.getFill());
        this.figura.setLayoutX(nuevoX);
        this.figura.setLayoutY(nuevoY);
    }
}
