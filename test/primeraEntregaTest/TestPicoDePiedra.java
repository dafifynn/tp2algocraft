package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import modelo.PlantillasDeForja.PlantillaPicoPiedra;
import org.junit.jupiter.api.Test;

public class TestPicoDePiedra {

    // Tests de integracion
    @Test
    public void seCreaPicoDePiedraPorDefecto() {

        Forja forja = new Forja();
        Herramienta picoDePiedra = forja.construirHerramienta(new PlantillaPicoPiedra());

        assertEquals(picoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
        assertEquals(picoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void picoDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDePiedra = forja.construirHerramienta(new PlantillaPicoPiedra());
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDePiedra.impactar(bloqueDeMadera);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    public void picoDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDePiedra = forja.construirHerramienta(new PlantillaPicoPiedra());
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDePiedra.impactar(bloqueDePiedra);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    public void picoDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDePiedra = forja.construirHerramienta(new PlantillaPicoPiedra());
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDePiedra.impactar(bloqueDeMetal);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    public void picoDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDePiedra = forja.construirHerramienta(new PlantillaPicoPiedra());
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDePiedra.impactar(bloqueDeDiamante);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }
}
