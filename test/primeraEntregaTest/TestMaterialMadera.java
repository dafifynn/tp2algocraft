package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Jugador.Forja;
import modelo.Material.MaterialMadera;
import modelo.Constantes;
import modelo.Herramienta.*;
import modelo.PlantillasDeForja.PlantillaHachaMadera;
import org.junit.jupiter.api.Test;

public class TestMaterialMadera {

    // Tests de integracion
    @Test
    public void seGolpeaBloqueDeMaderaConHachaDeMaderaImpactandoAmbos() {

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(new PlantillaHachaMadera());
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        assertEquals(bloqueDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA);

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(bloqueDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA - hachaDeMadera.obtenerFuerza());
    }
}
