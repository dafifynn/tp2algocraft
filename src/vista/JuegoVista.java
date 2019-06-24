package vista;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;

public class JuegoVista {

    Stage escenario;

    Scene mundo;
    Scene inventario;

    Group elementosMundo;

    MapaVista mapa;
    JugadorVista jugador;

    public JuegoVista(Stage escenario) {

        this.escenario = escenario;

        this.elementosMundo = new Group();

        this.mapa = new MapaVista(elementosMundo);
        this.jugador = new JugadorVista(elementosMundo);

        mundo = new Scene(elementosMundo, 480, 480);

        escenario.setScene(mundo);
    }

    public void moverJugador(EstrategiaDeDireccion direccion) {
        jugador.moverJugador(elementosMundo,direccion);
    }

    public void rotarJugador(EstrategiaDeDireccion direccion) {
        jugador.rotarJugador(direccion);
    }

    public Scene mundo(){

        return this.mundo;
    }
}
