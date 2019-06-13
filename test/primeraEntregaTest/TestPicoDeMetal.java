package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import org.junit.*;

public class TestPicoDeMetal {

    // Tests de integracion
    @Test
    public void seCreaPicoDeMetalPorDefecto() {

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(Constantes.PICO_DE_METAL);

        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(Constantes.PICO_DE_METAL);
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDeMetal.impactar(bloqueDeMadera);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(Constantes.PICO_DE_METAL);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDeMetal.impactar(bloqueDePiedra);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){
        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(Constantes.PICO_DE_METAL);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDeMetal.impactar(bloqueDeMetal);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(Constantes.PICO_DE_METAL);
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }
}
