package controlador;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import modelo.EstrategiaDeDireccion.DireccionAbajo;
import modelo.EstrategiaDeDireccion.DireccionArriba;
import modelo.EstrategiaDeDireccion.DireccionDerecha;
import modelo.EstrategiaDeDireccion.DireccionIzquierda;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Juego.Juego;
import vista.JuegoVista;

import java.util.HashMap;
import java.util.Scanner;


public class ControladorDeJugador {

    JuegoVista juegoVista;
    Juego juego;

    public ControladorDeJugador(Juego juego, JuegoVista juegoVista) {

        this.juegoVista = juegoVista;
        this.juego = juego;

        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> movimiento(evento));
        juegoVista.mundo().addEventHandler(KeyEvent.KEY_PRESSED, evento -> impacto(evento));

    }

    private void movimiento(KeyEvent evento) {

        boolean actualizarPosicion = true;

        if(evento.getCode().equals(KeyCode.W)) {

            try {
                juego.moverJugador(new DireccionArriba());
            }
            catch (Exception e) {
                actualizarPosicion = false;
            }

            juegoVista.rotarJugador(new DireccionArriba());
            if(actualizarPosicion) {
                juegoVista.moverJugador(new DireccionArriba());
            }

        } else if(evento.getCode().equals(KeyCode.S)) {

            try {
                juego.moverJugador(new DireccionAbajo());
            }
            catch (Exception e) {
                actualizarPosicion = false;
            }

            juegoVista.rotarJugador(new DireccionAbajo());
            if(actualizarPosicion) {
                juegoVista.moverJugador(new DireccionAbajo());
            }

        } else if(evento.getCode().equals(KeyCode.A)) {

            try {
                juego.moverJugador(new DireccionIzquierda());
            }
            catch (Exception e) {
                actualizarPosicion = false;
            }

            juegoVista.rotarJugador(new DireccionIzquierda());
            if(actualizarPosicion) {
                juegoVista.moverJugador(new DireccionIzquierda());
            }

        } else if(evento.getCode().equals(KeyCode.D)) {

            try {
                juego.moverJugador(new DireccionDerecha());
            }
            catch (Exception e) {
                actualizarPosicion = false;
            }

            juegoVista.rotarJugador(new DireccionDerecha());
            if(actualizarPosicion) {
                juegoVista.moverJugador(new DireccionDerecha());
            }
        }
    }

    private void impacto(KeyEvent evento) {

        if(evento.getCode().equals(KeyCode.SPACE)) {


        }
    }
}
