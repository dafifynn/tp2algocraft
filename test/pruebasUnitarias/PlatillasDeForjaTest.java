package pruebasUnitarias;

import modelo.PlantillasDeForja.PlantillaHachaMadera;
import modelo.PlantillasDeForja.PlantillaHachaPiedra;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlatillasDeForjaTest {

    @Test
    public void creoDosPlantillasHachaMaderaYVerificoQueSonIguales(){

        PlantillaHachaMadera plantilla1 = new PlantillaHachaMadera();
        PlantillaHachaMadera plantilla2 = new PlantillaHachaMadera();

        assertEquals(plantilla1.compararPlantilla(plantilla2), true);
    }

    @Test
    public void creoPlantillaHachaMaderaYPlantillaHachaPiedraYVerificoQueNoSonIguales(){

        PlantillaHachaMadera plantillaHachaMadera = new PlantillaHachaMadera();
        PlantillaHachaPiedra plantillaHachaPiedra = new PlantillaHachaPiedra();

        assertEquals(plantillaHachaMadera.compararPlantilla(plantillaHachaPiedra), false);
    }

}
