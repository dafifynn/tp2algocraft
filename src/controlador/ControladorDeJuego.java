package controlador;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import modelo.EstrategiaDeDireccion.*;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Juego.Juego;
import modelo.Jugador.Inventario;
import vista.InventarioVista;
import vista.JuegoVista;

import java.util.HashMap;
import java.util.Scanner;


public class ControladorDeJuego {

    JuegoVista juegoVista;
    Juego juego;

    public ControladorDeJuego(Juego juego, JuegoVista juegoVista) {

        this.juegoVista = juegoVista;
        this.juego = juego;

        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> movimiento(evento));
        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> impacto(evento));
        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> abrirInventario(evento));
        juegoVista.inventario().addEventHandler(KeyEvent.KEY_PRESSED, evento -> cerrarInventario(evento));

    }

    private void movimientoSegunDireccion (EstrategiaDeDireccion direccion) {
        try {
            juego.moverJugador(direccion);
            juegoVista.moverJugador(direccion);
        }
        catch (Exception e) {

        }
        finally {
            juegoVista.rotarJugador(direccion);
        }
    }

    private void movimiento(KeyEvent evento) {

        if(evento.getCode().equals(KeyCode.W)) {

            this.movimientoSegunDireccion(new DireccionArriba());

        } else if(evento.getCode().equals(KeyCode.S)) {

            this.movimientoSegunDireccion(new DireccionAbajo());

        } else if(evento.getCode().equals(KeyCode.A)) {

            this.movimientoSegunDireccion(new DireccionIzquierda());

        } else if(evento.getCode().equals(KeyCode.D)) {

            this.movimientoSegunDireccion(new DireccionDerecha());
        }
    }

    private void impacto(KeyEvent evento) {

        if(evento.getCode().equals(KeyCode.SPACE)) {

            juego.obtenerJugador().impactar(juego.obtenerMapa());

        }
    }

    private void abrirInventario(KeyEvent evento) {

        if(evento.getCode().equals(KeyCode.E)) {
            this.juegoVista.mostrarInventario();
        }

    }

    private void cerrarInventario(KeyEvent evento) {

        if(evento.getCode().equals(KeyCode.E)) {
            this.juegoVista.cerrarInventario();
        }
    }


}
