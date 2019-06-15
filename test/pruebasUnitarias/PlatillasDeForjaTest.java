package pruebasUnitarias;

import modelo.Material.MaterialDiamante;
import modelo.PlantillasDeForja.PlantillaEditable;
import modelo.PlantillasDeForja.PlantillaHachaMadera;
import modelo.PlantillasDeForja.PlantillaHachaPiedra;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlatillasDeForjaTest {

    @Test
    public void creoDosPlantillasHachaMaderaYVerificoQueSonIguales(){

        PlantillaHachaMadera plantilla1 = new PlantillaHachaMadera();
        PlantillaHachaMadera plantilla2 = new PlantillaHachaMadera();

        assertEquals(plantilla1.equals(plantilla2), true);
    }

    @Test
    public void creoPlantillaHachaMaderaYPlantillaHachaPiedraYVerificoQueNoSonIguales(){

        PlantillaHachaMadera plantillaHachaMadera = new PlantillaHachaMadera();
        PlantillaHachaPiedra plantillaHachaPiedra = new PlantillaHachaPiedra();

        assertEquals(plantillaHachaMadera.equals(plantillaHachaPiedra), false);
    }

    @Test
    public void comparoPlantillaEditableConUnaPorDefecto(){

        PlantillaEditable plantillaEditable = new PlantillaEditable();
        PlantillaHachaMadera plantillaHachaMadera = new PlantillaHachaMadera();

        MaterialDiamante materialDiamante = new MaterialDiamante();
        plantillaEditable.armarPlantillaEditable(1, 2, materialDiamante.getClass());

        assertEquals(plantillaEditable.equals(plantillaHachaMadera), false);


    }

}
