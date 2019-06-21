package segundaEntregaTest;

import modelo.EstrategiaDeDireccion.*;
import modelo.Excepciones.CoordenadaFueraDelLimiteException;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.Material;
import modelo.Material.MaterialMadera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

    // MOVIMIENTO DEL JUGADOR
    @Test
    public void JugadorPorDefectoTieneCoordenadasXY() {
        Juego juego = new Juego();
        Jugador jugador = juego.obtenerJugador();
        Coordenada coordenada = new Coordenada(Constantes.JUGADOR_COORDENADA_X_DEFECTO,Constantes.JUGADOR_COORDENADA_Y_DEFECTO);

        assertTrue(coordenada.equals(jugador.obtenerCoordenada()));
    }

    @Test
    public void JugadorEnXYSeMueveHaciaArribaSiEstaVacio () {
        Juego juego = new Juego();
        Jugador jugador = juego.obtenerJugador();
        Mapa mapa = juego.obtenerMapa();
        EstrategiaDeDireccion direccion = new DireccionArriba();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();
        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = new Coordenada(coordenadaInicial.obtenerFila()
                ,coordenadaInicial.obtenerColumna()+1);
        if(!mapa.hayMaterialEnCoordenada(coordenadaEsperada)){
            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        }

    }

    @Test
    public void JugadorEnXYSeMueveHaciaLaDerechaSiEstaVacio () {
        Juego juego = new Juego();
        Jugador jugador = juego.obtenerJugador();
        Mapa mapa = juego.obtenerMapa();
        EstrategiaDeDireccion direccion = new DireccionDerecha();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();
        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = new Coordenada(coordenadaInicial.obtenerFila()+1
                ,coordenadaInicial.obtenerColumna());
        if(!mapa.hayMaterialEnCoordenada(coordenadaEsperada)){
            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        }else{
            assertThrows(MovimientoInvalidoException.class, () -> {jugador.moverse(direccion,mapa);});
        }
    }


    @Test
    public void JugadorEnXYSeMueveHaciaAbajoSiEstaVacio () {
        Juego juego = new Juego();
        Jugador jugador = juego.obtenerJugador();
        Mapa mapa = juego.obtenerMapa();
        EstrategiaDeDireccion direccion = new DireccionAbajo();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();
        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = new Coordenada(coordenadaInicial.obtenerFila()
                , coordenadaInicial.obtenerColumna()-1);
        if (!mapa.hayMaterialEnCoordenada(coordenadaEsperada)) {
            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        } else {
            assertThrows(MovimientoInvalidoException.class, () -> {
                jugador.moverse(direccion, mapa);
            });
        }
    }


    @Test
    public void JugadorEnX0Y0SeMueveHaciaLaIzquierdaSiEstaVacio () {
        Juego juego = new Juego();
        Jugador jugador = juego.obtenerJugador();
        Mapa mapa = juego.obtenerMapa();
        EstrategiaDeDireccion direccion = new DireccionIzquierda();

        Coordenada coordenadaInicial = jugador.obtenerCoordenada();
        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = new Coordenada(coordenadaInicial.obtenerFila() - 1
                , coordenadaInicial.obtenerColumna());
        if (!mapa.hayMaterialEnCoordenada(coordenadaEsperada)) {
            assertTrue(coordenadaEsperada.equals(jugador.obtenerCoordenada()));
        } else {
            assertThrows(MovimientoInvalidoException.class, () -> {
                jugador.moverse(direccion, mapa);
            });
        }
    }
}

