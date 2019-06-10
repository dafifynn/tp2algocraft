package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;
import org.junit.Test;

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
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDeMetal.impactar(bloqueDeMadera);

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDeMetal.impactar(bloqueDeMetal);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDeMetal.impactar(bloqueDeDiamante);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }
}
