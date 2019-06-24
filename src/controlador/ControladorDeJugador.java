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
import vista.InventarioVista;
import vista.JuegoVista;

import java.util.HashMap;
import java.util.Scanner;


public class ControladorDeJugador {

    JuegoVista juegoVista;
    Juego juego;
    Boolean inventarioAbierto;

    public ControladorDeJugador(Juego juego, JuegoVista juegoVista) {

        this.juegoVista = juegoVista;
        this.juego = juego;
        this.inventarioAbierto = false;

        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> movimiento(evento));
        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> impacto(evento));
        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> abrirOCerrarInventario(evento));

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

    private void abrirOCerrarInventario(KeyEvent evento){

        if((evento.getCode().equals(KeyCode.I))&&( inventarioAbierto == false )){

            this.juegoVista.mostrarInventario();
            this.inventarioAbierto = true;

        }else if ((evento.getCode().equals(KeyCode.I))&&( inventarioAbierto == true )){

            this.juegoVista.cerrarInventario();
            this.inventarioAbierto = false;

        }
    }
}
