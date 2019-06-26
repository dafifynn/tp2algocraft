package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modelo.Constantes;
import modelo.EstrategiaDeDireccion.*;

public class JugadorVista {

    private Rectangle figura;

    private static final ImagePattern modeloArriba = new ImagePattern(new Image("jugador/jugadorArriba.png"));

    private static final ImagePattern modeloAbajo = new ImagePattern(new Image("jugador/jugadorAbajo.png"));

    private static final ImagePattern modeloIzquierda = new ImagePattern(new Image("jugador/jugadorIzquierda.png"));

    private static final ImagePattern modeloDerecha = new ImagePattern(new Image("jugador/jugadorDerecha.png"));

    JugadorVista(Group contenedor) {

        int jugadorX = Constantes.JUGADOR_COORDENADA_COLUMNA_DEFECTO * Constantes.PIXELES;
        int jugadorY = Constantes.JUGADOR_COORDENADA_FILA_DEFECTO * Constantes.PIXELES;

        this.figura = new Rectangle(Constantes.PIXELES,Constantes.PIXELES,this.modeloAbajo);
        this.figura.setLayoutX(jugadorX);
        this.figura.setLayoutY(jugadorY);

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

        if(direccion.getClass().isAssignableFrom(DireccionArriba.class)) {
            this.figura.setFill(this.modeloArriba);
        }
        else if(direccion.getClass().isAssignableFrom(DireccionAbajo.class)) {
            this.figura.setFill(this.modeloAbajo);
        }
        else if(direccion.getClass().isAssignableFrom(DireccionIzquierda.class)) {
            this.figura.setFill(this.modeloIzquierda);
        }
        else if(direccion.getClass().isAssignableFrom(DireccionDerecha.class)) {
            this.figura.setFill(this.modeloDerecha);
        }
    }

    private void actualizarFigura(double nuevoX, double nuevoY) {

        this.figura = new Rectangle(Constantes.PIXELES,Constantes.PIXELES,this.figura.getFill());
        this.figura.setLayoutX(nuevoX);
        this.figura.setLayoutY(nuevoY);
    }
}
