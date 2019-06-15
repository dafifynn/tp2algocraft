package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import org.junit.jupiter.api.Test;

public class TestHachaDePiedra {

    // Tests de integracion
    @Test
    public void seCreaHachaDePiedraPorDefecto() {

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(Constantes.HACHA_DE_PIEDRA);

        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void hachaDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(Constantes.HACHA_DE_PIEDRA);
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDePiedra.impactar(bloqueDeMadera);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(Constantes.HACHA_DE_PIEDRA);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDePiedra.impactar(bloqueDePiedra);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(Constantes.HACHA_DE_PIEDRA);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDePiedra.impactar(bloqueDeMetal);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta hachaDePiedra = forja.construirHerramienta(Constantes.HACHA_DE_PIEDRA);

        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDePiedra.impactar(bloqueDeDiamante);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }
}
