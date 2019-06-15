package primeraEntregaTest;

import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.MaterialDiamante;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHachaDeMadera {

    // Tests de integracion
    @Test
    public void seCreaHachaDeMaderaPorDefecto() {

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);

        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    public void hachaDeMaderaSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    public void hachaDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDeMadera.impactar(bloqueDePiedra);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    public void hachaDeMaderaSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDeMadera.impactar(bloqueDeMetal);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    public void hachaDeMaderaSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMadera = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);

        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDeMadera.impactar(bloqueDeDiamante);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }
}
