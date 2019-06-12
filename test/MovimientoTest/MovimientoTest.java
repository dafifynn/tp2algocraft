package MovimientoTest;

import modelo.Acciones.Movimiento;
import modelo.EstrategiaDeDireccion.*;
import modelo.Jugador.Jugador
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientoTest {

    @Test
    public void moverJugadorHaciaArriba(){
        Mapa mapa = new Mapa();
        Coordenada coordenada = mapa.ubicacionDelJugador();
        DireccionArriba direccionArriba = new DireccionArriba();
        Movimiento movimiento = new Movimiento(direccionArriba);
        mapa.moverJugador(movimiento);

        coordenada = direccionArriba.obtenerCoordenadaAdyacente(coordenada);
        Coordenada coordenadaActual = mapa.ubicacionDelJugador();

        assertEquals(coordenada == coordenadaActual, 1);
    }
}
