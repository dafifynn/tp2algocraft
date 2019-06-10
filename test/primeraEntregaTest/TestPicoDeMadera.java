package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.*;
import modelo.Herramienta.Pico;
import modelo.Jugador.Jugador;
import org.junit.Test;

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
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        picoDeMadera.impactar(bloqueDeMadera);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        picoDeMadera.impactar(bloqueDePiedra);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA);
    }

    @Test
    public void picoDeMaderaSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        picoDeMadera.impactar(bloqueDeMetal);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }

    @Test
    public void picoDeMaderaSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Pico picoDeMadera = jugador.crearPicoDeMadera();
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        picoDeMadera.impactar(bloqueDeDiamante);

        assertEquals(picoDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_PICO_MADERA -
                Constantes.FUERZA_INICIAL_PICO_MADERA );
    }
}
