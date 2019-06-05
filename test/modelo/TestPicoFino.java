package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Constantes;
import modelo.Bloque.*;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Jugador;

class TestPicoFino extends TestCase {

    // Tests de integracion
    @Test
    void seCreaPicoFinoPorDefecto() {

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();

        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
    }

    @Test
    void picoFinoSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        picoFino.impactar(bloqueDeMadera);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    void picoFinoSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        picoFino.impactar(bloqueDePiedra);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    void picoFinoSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        picoFino.impactar(bloqueDeMetal);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    void picoFinoSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        picoFino.impactar(bloqueDeDiamante);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO -
                (Constantes.DURABILIDAD_INICIAL_PICO_FINO * 0.1 ) );
    }
}
