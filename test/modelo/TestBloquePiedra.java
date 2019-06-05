package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Constantes;
import modelo.Bloque.BloquePiedra;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

class TestBloquePiedra extends TestCase {

    // Tests de integracion de Bloque de Piedra
    
    @Test
    void seGolpeaBloqueDePiedraConHachaDeMetalImpactandoSoloLaHerramienta() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);
    }
}
