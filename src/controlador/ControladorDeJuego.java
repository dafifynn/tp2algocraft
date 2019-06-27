package controlador;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import modelo.EstrategiaDeDireccion.*;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Excepciones.SinHerramientaEquipadaException;
import modelo.Juego.Juego;
import modelo.Jugador.Inventario;
import vista.CajaMusical;
import vista.InventarioVista;
import vista.JuegoVista;

import java.io.File;
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
    }

    private void movimientoSegunDireccion (EstrategiaDeDireccion direccion) {
        try {
            juego.moverJugador(direccion);
            juegoVista.moverJugador(direccion);

            CajaMusical.reproducir(CajaMusical.caminar);
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
            try {
                juego.obtenerJugador().impactar(juego.obtenerMapa());
                CajaMusical.reproducir(CajaMusical.impacto);
            }
            catch (MaterialInexistenteException e) {

            }
            catch (SinHerramientaEquipadaException e) {
                CajaMusical.reproducir(CajaMusical.sinHerramienta);
            }

        }
    }

    private void abrirInventario(KeyEvent evento) {

        if(evento.getCode().equals(KeyCode.E)) {
            CajaMusical.reproducir(CajaMusical.abrir);
            this.juegoVista.mostrarInventario();
        }

    }
}
