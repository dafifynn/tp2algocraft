package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.*;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;

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
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        hachaDePiedra.impactar(bloqueDeMadera);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        hachaDePiedra.impactar(bloqueDePiedra);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        hachaDePiedra.impactar(bloqueDeMetal);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }

    @Test
    public void hachaDePiedraSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDePiedra = jugador.crearHachaDePiedra();

        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        hachaDePiedra.impactar(bloqueDeDiamante);

        assertEquals(hachaDePiedra.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA -
                Constantes.FUERZA_INICIAL_HACHA_PIEDRA );
    }
}
