package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import org.junit.*;

public class TestPicoFino {

    // Tests de integracion
    @Test
    public void seCreaPicoFinoPorDefecto() {

        Forja forja = new Forja();
        Herramienta picoFino = forja.construirHerramienta(Constantes.PICO_FINO);

        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoFino = forja.construirHerramienta(Constantes.PICO_FINO);
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoFino.impactar(bloqueDeMadera);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoFino = forja.construirHerramienta(Constantes.PICO_FINO);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoFino.impactar(bloqueDePiedra);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoFino = forja.construirHerramienta(Constantes.PICO_FINO);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoFino.impactar(bloqueDeMetal);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoFino = forja.construirHerramienta(Constantes.PICO_FINO);
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoFino.impactar(bloqueDeDiamante);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO -
                (Constantes.DURABILIDAD_INICIAL_PICO_FINO * 0.1 ) );
    }
}
