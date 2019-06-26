package vista;

import controlador.ControladorDeInventario;
import controlador.ControladorDeJuego;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Juego.Juego;

public class JuegoVista {

    Stage escenario;

    Scene mundo;

    Group elementosMundo;

    MapaVista mapaVista;
    JugadorVista jugadorVista;
    InventarioVista inventarioVista;

    public JuegoVista(Stage escenario, Juego modelo) {

        this.escenario = escenario;

        this.elementosMundo = new Group();

        this.mapaVista = new MapaVista(this.elementosMundo,modelo.obtenerMapa());
        this.jugadorVista = new JugadorVista(this.elementosMundo);
        this.inventarioVista = new InventarioVista(modelo.obtenerJugador().obtenerInventario(), modelo.obtenerJugador());

        this.mundo = new Scene(this.elementosMundo, 480, 480);
        this.mundo.setFill(Color.DARKGRAY);

        this.escenario.setScene(this.mundo);

        new ControladorDeJuego(modelo,this);
        new ControladorDeInventario(modelo, this.inventarioVista, this);
    }

    public void moverJugador(EstrategiaDeDireccion direccion) {
        this.jugadorVista.moverJugador(this.elementosMundo,direccion);
    }

    public void rotarJugador(EstrategiaDeDireccion direccion) {
        this.jugadorVista.rotarJugador(direccion);
    }

    public void mostrarInventario(){
        this.escenario.setScene(this.inventarioVista.visualizacion());
    }

    public void cerrarInventario(){
        this.escenario.setScene(this.mundo);
    }

    public Scene mundo(){
        return this.mundo;
    }
}
