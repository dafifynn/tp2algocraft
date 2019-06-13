package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import org.junit.*;

public class TestPicoDeMadera {

    // Tests de integracion
    @Test
    public void seCreaPicoDeMaderaPorDefecto() {

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(Constantes.PICO_DE_MADERA);

        assertEquals(picoDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(Constantes.PICO_DE_MADERA);
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDeMadera.impactar(bloqueDeMadera);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(Constantes.PICO_DE_MADERA);
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDeMadera.impactar(bloqueDePiedra);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(Constantes.PICO_DE_MADERA);
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(Constantes.PICO_DE_MADERA);
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDeMadera.impactar(bloqueDeDiamante);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }
}
