package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import modelo.Herramienta.Hacha;
import org.junit.jupiter.api.Test;

public class TestHachaDeMetal {

    // Tests de integracion
    @Test
    public void seCreaHachaDeMetalPorDefecto() {

        Forja forja = new Forja();
        Herramienta hachaDeMetal = forja.construirHerramienta(Constantes.HACHA_DE_METAL);

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
        assertEquals(hachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
    }

    @Test
    public void hachaDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMetal = forja.construirHerramienta(Constantes.HACHA_DE_METAL);
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDeMetal.impactar(bloqueDeMadera);

        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMetal = forja.construirHerramienta(Constantes.HACHA_DE_METAL);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMetal = forja.construirHerramienta(Constantes.HACHA_DE_METAL);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDeMetal.impactar(bloqueDeMetal);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }

    @Test
    public void hachaDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDeMetal = forja.construirHerramienta(Constantes.HACHA_DE_METAL);
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDeMetal.impactar(bloqueDeDiamante);

        assertEquals(hachaDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_METAL  -
                (Constantes.FUERZA_INICIAL_HACHA_METAL/2) );
    }
}
