package pruebasUnitarias;

import modelo.Herramienta.Hacha;
import modelo.Jugador.Forja;
import modelo.Material.MaterialMetal;
import modelo.PlantillasDeForja.PlantillaHachaMadera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HerramientaTest {

    @Test
    public void comparacionDeHerramientasTest() {

        Forja forja = new Forja();
        MaterialMetal metal = new MaterialMetal();
        PlantillaHachaMadera plantilla = new PlantillaHachaMadera();
        Hacha hachaMadera1 = (Hacha)forja.construirHerramienta(plantilla);
        Hacha hachaMadera2 = (Hacha)forja.construirHerramienta(plantilla);
        hachaMadera1.impactar(metal);
        hachaMadera2.impactar(metal);
        assertEquals((hachaMadera1 == hachaMadera2), true);
    }
}
