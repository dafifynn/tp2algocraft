package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Jugador.Forja;
import modelo.Material.MaterialPiedra;
import modelo.Constantes;
import modelo.Herramienta.*;
import org.junit.jupiter.api.Test;

public class TestMaterialPiedra {

    // Tests de integracion de Material de Piedra
    @Test
    public void seGolpeaBloqueDePiedraConHachaDeMetalImpactandoSoloLaHerramienta() {

        Forja forja = new Forja();
        Herramienta hachaDeMetal = forja.construirHerramienta(Constantes.HACHA_DE_METAL);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);
    }
}
