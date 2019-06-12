package primeraEntregaTest;

import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Jugador;
import modelo.Material.MaterialDiamante;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHachaDeMadera {

    // Tests de integracion
    @Test
    public void seCreaHachaDeMaderaPorDefecto() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();

        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    public void hachaDeMaderaSeUsaContraMaderaYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    public void hachaDeMaderaSeUsaContraPiedraYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        hachaDeMadera.impactar(bloqueDePiedra);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    public void hachaDeMaderaSeUsaContraMetalYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        MaterialMetal bloqueDeMetal = new MaterialMetal();

        hachaDeMadera.impactar(bloqueDeMetal);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }

    @Test
    public void hachaDeMaderaSeUsaContraDiamanteYSeReduceSuDurabilidadDeFormaCorrespondiente(){

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();

        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        hachaDeMadera.impactar(bloqueDeDiamante);

        assertEquals(hachaDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_HACHA_MADERA -
                Constantes.FUERZA_INICIAL_HACHA_MADERA );
    }
}
