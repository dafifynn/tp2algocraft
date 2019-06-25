package vista;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Juego.Artista;
import modelo.Jugador.Inventario;

import java.util.Observer;

public class JuegoVista {

    Stage escenario;

    Scene mundo;
    Scene inventario;

    Group elementosMundo;
    Group elementosInventario;

    MapaVista mapa;
    JugadorVista jugador;
    InventarioVista inventarioVista;

    public JuegoVista(Stage escenario) {

        this.escenario = escenario;

        this.elementosMundo = new Group();
        this.elementosInventario = new Group();

        this.mapa = new MapaVista(elementosMundo);
        this.jugador = new JugadorVista(elementosMundo);
        this.inventarioVista = new InventarioVista(elementosInventario);

        mundo = new Scene(elementosMundo, 480, 480);
        inventario = new Scene(elementosInventario,480,480);
        mundo.setFill(Color.DARKGRAY);

        escenario.setScene(mundo);
    }

    public void moverJugador(EstrategiaDeDireccion direccion) {
        jugador.moverJugador(elementosMundo,direccion);
    }

    public void rotarJugador(EstrategiaDeDireccion direccion) {
        jugador.rotarJugador(direccion);
    }

    public void mostrarInventario(){
        escenario.setScene(inventario);
    }

    public void cerrarInventario(){
        escenario.setScene(mundo);
    }


    public Scene mundo(){

        return this.mundo;
    }

    public Scene inventario() {

        return this.inventario;
    }

    public MapaVista obtenerMapaVista() {
        return this.mapa;
    }

    public JugadorVista obtenerJugadorVista() {
        return this.jugador;
    }
}
