package controlador;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import modelo.Juego.Juego;
import vista.CajaMusical;
import vista.InventarioVista;
import vista.JuegoVista;

public class ControladorDeInventario {

    InventarioVista vista;

    public ControladorDeInventario(Juego modelo, InventarioVista inventarioVista, JuegoVista vistaDeRetorno) {

        this.vista = inventarioVista;

        inventarioVista.observar(modelo.obtenerJugador().obtenerInventario());
        inventarioVista.observar(modelo.obtenerJugador());
        //teclado
        inventarioVista.visualizacion().addEventHandler(KeyEvent.KEY_PRESSED,
                evento -> cerrarInventario(evento,vistaDeRetorno));

        //botones de inventario
        //modelo.moverElementoDeInventarioAPlantilla(posicion inventario, posicion plantilla);
    }

    private void cerrarInventario(KeyEvent evento, JuegoVista vistaDeRetorno) {

        if(evento.getCode().equals(KeyCode.E)) {
            CajaMusical.reproducir(CajaMusical.cerrar);
            vistaDeRetorno.cerrarInventario();
        }
    }
}
