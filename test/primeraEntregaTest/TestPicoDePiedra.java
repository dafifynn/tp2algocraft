package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestPicoDePiedra {

    // Tests de integracion
    @Test
    public void seCreaPicoDePiedraPorDefecto() {

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();

        assertEquals(picoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
        assertEquals(picoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void picoDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDePiedra.impactar(bloqueDeMadera);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    public void picoDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDePiedra.impactar(bloqueDePiedra);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    public void picoDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDePiedra.impactar(bloqueDeMetal);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }

    @Test
    public void picoDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDePiedra = jugador.crearPicoDePiedra();
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDePiedra.impactar(bloqueDeDiamante);

        assertEquals(picoDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA -
                (Constantes.FUERZA_INICIAL_PICO_PIEDRA / 1.5));
    }
}
