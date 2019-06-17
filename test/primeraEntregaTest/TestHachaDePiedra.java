package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import modelo.PlantillasDeForja.PlantillaHachaPiedra;
import org.junit.jupiter.api.Test;

public class TestHachaDePiedra {

    // Tests de integracion
    @Test
    public void seCreaHachaDePiedraPorDefecto() {

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(new PlantillaHachaPiedra());

        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void hachaDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(new PlantillaHachaPiedra());
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDePiedra.impactar(bloqueDeMadera);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(new PlantillaHachaPiedra());
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDePiedra.impactar(bloqueDePiedra);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(new PlantillaHachaPiedra());
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDePiedra.impactar(bloqueDeMetal);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(new PlantillaHachaPiedra());

        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDePiedra.impactar(bloqueDeDiamante);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }
}
