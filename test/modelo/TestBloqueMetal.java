package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Constantes;
import modelo.Bloque.BloqueMetal;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

class TestBloqueMetal extends TestCase {

    // Tests de integracion de Bloque de Metal
    
    @Test
    void seGolpeaBloqueDeMetalConPicoDeMaderaImpactandoSoloLaHerramienta() {

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);
    }

}
