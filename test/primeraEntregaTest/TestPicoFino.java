package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.*;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestPicoFino {

    // Tests de integracion
    @Test
    public void seCreaPicoFinoPorDefecto() {

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();

        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoFino.impactar(bloqueDeMadera);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoFino.impactar(bloqueDePiedra);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoFino.impactar(bloqueDeMetal);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void picoFinoSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        PicoFino picoFino = jugador.crearPicoFino();
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoFino.impactar(bloqueDeDiamante);

        assertEquals(picoFino.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_FINO -
                (Constantes.DURABILIDAD_INICIAL_PICO_FINO * 0.1 ) );
    }
}
