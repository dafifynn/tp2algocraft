package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Bloque.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;

class TestHachaDeMetal extends TestCase {

    // Tests de integracion
    @Test
    void seCreaHachaDeMetalPorDefecto() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
        assertEquals(hachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
    }

    @Test
    void hachaDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        hachaDeMetal.impactar(bloqueDeMadera);

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    void hachaDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    void hachaDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        hachaDeMetal.impactar(bloqueDeMetal);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    void hachaDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        hachaDeMetal.impactar(bloqueDeDiamante);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }
}
