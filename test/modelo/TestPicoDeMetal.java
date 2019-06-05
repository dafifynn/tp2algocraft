package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Bloque.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;

class TestPicoDeMetal extends TestCase {

    // Tests de integracion
    @Test
    void seCreaPicoDeMetalPorDefecto() {

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();

        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    @Test
    void picoDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        picoDeMetal.impactar(bloqueDeMadera);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    void picoDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        picoDeMetal.impactar(bloqueDePiedra);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    void picoDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){
        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        picoDeMetal.impactar(bloqueDeMetal);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    void picoDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }
}
