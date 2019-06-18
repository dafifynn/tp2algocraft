package segundaEntregaTest;


import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Inventario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionDeHerramientas {

    @Test
    public void construirHachaDeMadera (){

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(0,0);
        inventario.guardarMaderaEnGrilla(0,1);
        inventario.guardarMaderaEnGrilla(1,0);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        Hacha hachaMadera = (Hacha) inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaMadera.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
        assertEquals(hachaMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
    }

    @Test
    public void construirPicoDeMadera (){

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(0,0);
        inventario.guardarMaderaEnGrilla(0,1);
        inventario.guardarMaderaEnGrilla(0,2);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        Pico picoMadera = (Pico) inventario.obtenerHerramientaDeGrilla();

        assertEquals(picoMadera.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(picoMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }


    @Test
    public void construirHachaDePiedra(){

        Inventario inventario = new Inventario();
        inventario.guardarPiedraEnGrilla(0,0);
        inventario.guardarPiedraEnGrilla(0,1);
        inventario.guardarPiedraEnGrilla(1,0);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        Hacha hachaDePiedra = (Hacha)inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaDePiedra.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void construirPicoDePiedra(){

        Inventario inventario = new Inventario();
        inventario.guardarPiedraEnGrilla(0,0);
        inventario.guardarPiedraEnGrilla(0,1);
        inventario.guardarPiedraEnGrilla(0,2);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        Pico PicoDePiedra = (Pico)inventario.obtenerHerramientaDeGrilla();

        assertEquals(PicoDePiedra.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
        assertEquals(PicoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void contruirHachaDeMetal() {

        Inventario inventario = new Inventario();
        inventario.guardarMetalEnGrilla(0,0);
        inventario.guardarMetalEnGrilla(0,1);
        inventario.guardarMetalEnGrilla(1,0);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        Hacha HachaDeMetal = (Hacha)inventario.obtenerHerramientaDeGrilla();

        assertEquals(HachaDeMetal.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(HachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
        assertEquals(HachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
    }

    @Test
    public void construirPicoDeMetal() {

        Inventario inventario = new Inventario();
        inventario.guardarMetalEnGrilla(0,0);
        inventario.guardarMetalEnGrilla(0,1);
        inventario.guardarMetalEnGrilla(0,2);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        Pico PicoDeMetal = (Pico)inventario.obtenerHerramientaDeGrilla();

        assertEquals(PicoDeMetal.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(PicoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    @Test
    public void construirPicoFino() {

        Inventario inventario = new Inventario();
        inventario.guardarMetalEnGrilla(0,0);
        inventario.guardarMetalEnGrilla(0,1);
        inventario.guardarMetalEnGrilla(0,2);
        inventario.guardarPiedraEnGrilla(1,0);
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(2,1);

        PicoFino picoFino = (PicoFino)inventario.obtenerHerramientaDeGrilla();

        assertEquals(picoFino.getClass().isAssignableFrom(PicoFino.class),true);
        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
    }
}
