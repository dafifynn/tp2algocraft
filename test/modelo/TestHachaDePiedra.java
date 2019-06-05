package tests;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Bloque.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;

class TestHachaDePiedra extends TestCase {

    // Tests de integracion
    @Test
    void seCreaHachaDePiedraPorDefecto() {

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();

        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    void hachaDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        hachaDePiedra.impactar(bloqueDeMadera);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }
}
