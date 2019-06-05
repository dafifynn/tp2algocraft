package tests;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Bloque.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;

class TestHachaDeMadera extends TestCase {

    // Tests de integracion
    @Test
    public void seCreaHachaDeMaderaPorDefecto() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();

        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    void hachaDeMaderaSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    void hachaDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        hachaDeMadera.impactar(bloqueDePiedra);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }
}
