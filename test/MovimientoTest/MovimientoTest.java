package MovimientoTest;

import modelo.Acciones.Movimiento;
import modelo.EstrategiaDeDireccion.*;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientoTest {


    @Test
    public void moverJugadorHaciaArriba(){

        Mapa mapa = new Mapa();
        Coordenada coordenada = mapa.obtenerCoordenadaDeJugador();

        DireccionArriba direccionArriba = new DireccionArriba();
        Movimiento movimiento = new Movimiento(direccionArriba);

        mapa.moverJugador(movimiento);

        coordenada = coordenada.crearCoordenadaAdyacente(0, 1);
        Coordenada coordenadaActual = mapa.obtenerCoordenadaDeJugador();

        assertEquals( coordenada.equals(coordenadaActual), true);
    }
}
