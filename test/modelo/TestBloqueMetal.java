package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.BloqueMetal;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

public class TestBloqueMetal {

    // Tests de integracion de Bloque de Metal

    @Test
    public void seGolpeaBloqueDeMetalConPicoDeMaderaImpactandoSoloLaHerramienta() {

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);
    }

}
