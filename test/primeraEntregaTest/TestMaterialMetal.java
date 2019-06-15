package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Jugador.Forja;
import modelo.Material.MaterialMetal;
import modelo.Constantes;
import modelo.Herramienta.*;
import org.junit.jupiter.api.Test;

public class TestMaterialMetal {

    // Tests de integracion de Material de Metal

    @Test
    public void seGolpeaBloqueDeMetalConPicoDeMaderaImpactandoSoloLaHerramienta() {

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(Constantes.PICO_DE_MADERA);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(bloqueDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL);
    }

}
