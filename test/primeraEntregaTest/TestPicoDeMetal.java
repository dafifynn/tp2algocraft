package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestPicoDeMetal {

    // Tests de integracion
    @Test
    public void seCreaPicoDeMetalPorDefecto() {

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();

        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDeMetal.impactar(bloqueDeMadera);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDeMetal.impactar(bloqueDePiedra);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){
        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDeMetal.impactar(bloqueDeMetal);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }
}
