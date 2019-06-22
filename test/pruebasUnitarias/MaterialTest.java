package pruebasUnitarias;

import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.Material;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.PlantillasDeForja.PlantillaHachaMadera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaterialTest {
    @Test
    public void compararConMetodoEqualsDosMaterialesDeMaderaDaTrue () {
        MaterialMadera madera1 = new MaterialMadera();
        MaterialMadera madera2 = new MaterialMadera();

        assertEquals(true, madera1.equals(madera2));
    }

    @Test
    public void compararConMetodoEqualsDosMaterialesDeMaderaDaTrue2 () {
        Material madera1 = new MaterialMadera();
        MaterialMadera madera2 = new MaterialMadera();

        assertEquals(true, madera1.equals(madera2));
    }

    @Test
    public void compararConMetodoEqualsDosMaterialesDistintosDaFalse () {
        MaterialMadera madera = new MaterialMadera();
        MaterialMetal metal = new MaterialMetal();

        assertEquals(false, madera.equals(metal));
    }

    @Test
    public void compararConMetodoEqualsDosMaterialesDeMaderaUnoDesgastadoYOtroIntactoDaTrue () {
        MaterialMadera madera1 = new MaterialMadera();
        MaterialMadera madera2 = new MaterialMadera();

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(new PlantillaHachaMadera());
        hachaDeMadera.impactar(madera1);

        assertEquals(true, madera1.equals(madera2));
    }

    @Test
    public void compararHashCodeDeUnMismoMaterialDaTrue () {
        MaterialMadera madera1 = new MaterialMadera();
        MaterialMadera madera2 = new MaterialMadera();

        assertEquals(true, madera1.hashCode() == madera2.hashCode());
    }

    @Test
    public void compararHashCodeDeDistintosMaterialesDaFalse () {
        MaterialMadera madera = new MaterialMadera();
        MaterialMetal metal = new MaterialMetal();

        assertEquals(false, madera.hashCode() == metal.hashCode());
    }
}
