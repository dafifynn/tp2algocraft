package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;

public class TestPicoDeMadera {

    // Tests de integracion
    @Test
    public void seCreaPicoDeMaderaPorDefecto() {

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();

        assertEquals(picoDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        picoDeMadera.impactar(bloqueDeMadera);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        picoDeMadera.impactar(bloqueDePiedra);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        BloqueMetal bloqueDeMetal = new BloqueMetal();

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        picoDeMadera.impactar(bloqueDeDiamante);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }
}
