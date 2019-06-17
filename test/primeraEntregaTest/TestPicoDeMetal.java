package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import modelo.PlantillasDeForja.PlantillaPicoMetal;
import org.junit.jupiter.api.Test;

public class TestPicoDeMetal {

    // Tests de integracion
    @Test
    public void seCreaPicoDeMetalPorDefecto() {

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(new PlantillaPicoMetal());

        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(new PlantillaPicoMetal());
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDeMetal.impactar(bloqueDeMadera);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(new PlantillaPicoMetal());
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDeMetal.impactar(bloqueDePiedra);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){
        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(new PlantillaPicoMetal());
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDeMetal.impactar(bloqueDeMetal);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(new PlantillaPicoMetal());
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }
}
