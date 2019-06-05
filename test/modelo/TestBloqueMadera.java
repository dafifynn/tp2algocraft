package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Constantes;
import modelo.Bloque.BloqueMadera;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

class TestBloqueMadera extends TestCase {

// Tests de integracion

    @Test
    void seGolpeaBloqueDeMaderaConHachaDeMaderaImpactandoAmbos() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        assertEquals(bloqueDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA);

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(bloqueDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA - hachaDeMadera.obtenerFuerza());
    }
