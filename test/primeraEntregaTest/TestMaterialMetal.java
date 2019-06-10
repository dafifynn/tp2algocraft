package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Material.MaterialMetal;
import modelo.Constantes;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestMaterialMetal {

    // Tests de integracion de Material de Metal

    @Test
    public void seGolpeaBloqueDeMetalConPicoDeMaderaImpactandoSoloLaHerramienta() {

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);
    }

}
