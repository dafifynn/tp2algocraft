package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;

public class TestHachaDeMetal {

    // Tests de integracion
    @Test
    public void seCreaHachaDeMetalPorDefecto() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
        assertEquals(hachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
    }

    @Test
    public void hachaDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        hachaDeMetal.impactar(bloqueDeMadera);

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        hachaDeMetal.impactar(bloqueDeMetal);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        hachaDeMetal.impactar(bloqueDeDiamante);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }
}
