package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestHachaDePiedra {

    // Tests de integracion
    @Test
    public void seCreaHachaDePiedraPorDefecto() {

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();

        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void hachaDePiedraSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDePiedra.impactar(bloqueDeMadera);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDePiedra.impactar(bloqueDePiedra);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDePiedra.impactar(bloqueDeMetal);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();

        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDePiedra.impactar(bloqueDeDiamante);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }
}
