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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JugadorTest {
    @Test
    public void JugadorPorDefectoTieneCoordenadasX0Y0() {
        Jugador jugador = new Jugador();
        Coordenada coordenada = new Coordenada(0,0);

        assertEquals(true, coordenada.equals(jugador.obtenerCoordenada()));
    }

    @Test
    public void JugadorEnX0Y0SeMueveHaciaArriba () {
        Mapa mapa = new Mapa();
        Jugador jugador = new Jugador();
        EstrategiaDeDireccion direccion = new DireccionArriba();

        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = new Coordenada(0,1);

        assertEquals(true, coordenadaEsperada.equals(jugador.obtenerCoordenada()));
    }

    @Test
    public void JugadorEnX0Y0SeMueveHaciaLaDerecha () {
        Mapa mapa = new Mapa();
        Jugador jugador = new Jugador();
        EstrategiaDeDireccion direccion = new DireccionDerecha();

        jugador.moverse(direccion, mapa);

        Coordenada coordenadaEsperada = new Coordenada(1,0);

        assertEquals(true, coordenadaEsperada.equals(jugador.obtenerCoordenada()));
    }

    @Test
    public void JugadorEnX0Y0SeMueveHaciaAbajoErrorCoordenadasFueraDeLimite() {
        Mapa mapa = new Mapa();
        Jugador jugador = new Jugador();
        EstrategiaDeDireccion direccion = new DireccionAbajo();

        assertThrows(CoordenadaFueraDelLimiteException.class, () -> {jugador.moverse(direccion,mapa);});
    }

    @Test
    public void  JugadorEnX0Y0SeMueveHaciaIzquieraErrorCoordenadasFueraDelLimie() {
        Mapa mapa = new Mapa();
        Jugador jugador = new Jugador();
        EstrategiaDeDireccion direccion = new DireccionIzquierda();

        assertThrows(CoordenadaFueraDelLimiteException.class, () -> {jugador.moverse(direccion,mapa);});
    }

    @Test
    public void JugadorEnX0Y0MaderaEnX0Y1MoverJugadorHaciaArribaErrorMovimientoInvalido() {
        Mapa mapa = new Mapa();
        Material madera = new MaterialMadera();
        Coordenada coordenadaDelMaterial = new Coordenada(0,1);
        mapa.agregarMaterial(coordenadaDelMaterial, madera);

        assertEquals(true, mapa.hayMaterialEnCoordenada(coordenadaDelMaterial));

        Jugador jugador = new Jugador();
        EstrategiaDeDireccion direccion = new DireccionArriba();

        assertThrows(MovimientoInvalidoException.class, () -> {jugador.moverse(direccion,mapa);});
    }
}
