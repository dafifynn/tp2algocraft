package segundaEntregaTest;

import modelo.Constantes;
import modelo.EstrategiaDeDireccion.*;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

    // MOVIMIENTO DEL JUGADOR
    @Test
    public void JugadorPorDefectoTieneCoordenadasXY() {

        Jugador jugador = new Jugador();
        Coordenada coordenada = new Coordenada(Constantes.JUGADOR_COORDENADA_FILA_DEFECTO, Constantes.JUGADOR_COORDENADA_COLUMNA_DEFECTO);

        assertTrue(coordenada.equals(jugador.obtenerCoordenada()));
    }

    @Test
    public void JugadorEnXYSeMueveHaciaArribaSiEstaVacio () {

        Jugador jugador = new Jugador();
        Mapa mapa = new Mapa();
        EstrategiaDeDireccion direccion = new DireccionArriba();

        assertThrows(MovimientoInvalidoException.class, () -> {jugador.moverse(direccion,mapa);});
    }

    @Test
    public void JugadorEnXYSeMueveHaciaLaDerechaSiEstaVacio () {

        Jugador jugador = new Jugador();
        Mapa mapa = new Mapa();
        EstrategiaDeDireccion direccion = new DireccionDerecha();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();

        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = direccion.crearCoordenadaSiguiente(coordenadaInicial);

        if(!mapa.hayMaterialEnCoordenada(coordenadaEsperada)){

            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        }
        else{
            assertThrows(MovimientoInvalidoException.class, () -> {jugador.moverse(direccion,mapa);});
        }
    }


    @Test
    public void JugadorEnXYSeMueveHaciaAbajoSiEstaVacio () {

        Jugador jugador = new Jugador();
        Mapa mapa = new Mapa();
        EstrategiaDeDireccion direccion = new DireccionAbajo();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();

        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = direccion.crearCoordenadaSiguiente(coordenadaInicial);

        if (!mapa.hayMaterialEnCoordenada(coordenadaEsperada)) {

            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        }
        else {
            assertThrows(MovimientoInvalidoException.class, () -> {jugador.moverse(direccion, mapa);});
        }
    }


    @Test
    public void JugadorEnXYSeMueveHaciaLaIzquierdaSiEstaVacio () {

        Jugador jugador = new Jugador();
        Mapa mapa = new Mapa();
        EstrategiaDeDireccion direccion = new DireccionIzquierda();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();

        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = direccion.crearCoordenadaSiguiente(coordenadaInicial);

        if (!mapa.hayMaterialEnCoordenada(coordenadaEsperada)) {

            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        }
        else {
            assertThrows(MovimientoInvalidoException.class, () -> {jugador.moverse(direccion, mapa);});
        }
    }

}

