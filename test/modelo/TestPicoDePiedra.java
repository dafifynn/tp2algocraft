package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Constantes;
import modelo.Bloque.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;

class TestPicoDePiedra extends TestCase {

    // Tests de integracion
    @Test
    void seCreaPicoDePiedraPorDefecto() {

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();

        assertEquals(picoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
        assertEquals(picoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
    }

    @Test
    void picoDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        picoDePiedra.impactar(bloqueDeMadera);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    void picoDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        picoDePiedra.impactar(bloqueDePiedra);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    void picoDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        picoDePiedra.impactar(bloqueDeMetal);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    void picoDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        picoDePiedra.impactar(bloqueDeDiamante);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }
}
