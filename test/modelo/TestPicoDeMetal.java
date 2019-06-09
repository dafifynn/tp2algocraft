package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;

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
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        picoDeMetal.impactar(bloqueDeMadera);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        picoDeMetal.impactar(bloqueDePiedra);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){
        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        picoDeMetal.impactar(bloqueDeMetal);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void picoDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }
}
