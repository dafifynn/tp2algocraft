package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Forja;
import modelo.Material.*;
import modelo.PlantillasDeForja.PlantillaPicoMadera;
import org.junit.jupiter.api.Test;

public class TestPicoDeMadera {

    // Tests de integracion
    @Test
    public void seCreaPicoDeMaderaPorDefecto() {

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(new PlantillaPicoMadera());

        assertEquals(picoDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(new PlantillaPicoMadera());
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDeMadera.impactar(bloqueDeMadera);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(new PlantillaPicoMadera());
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDeMadera.impactar(bloqueDePiedra);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(new PlantillaPicoMadera());
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Forja forja = new Forja();
        Herramienta picoDeMadera = forja.construirHerramienta(new PlantillaPicoMadera());
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDeMadera.impactar(bloqueDeDiamante);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }
}
