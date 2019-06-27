package segundaEntregaTest;


import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Inventario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConstruccionDeHerramientas {

    @Test
    public void construirHachaDeMadera (){

        Inventario inventario = new Inventario();

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 0);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.contruirHerramientaDeGrilla();

        Hacha hachaMadera = (Hacha) inventario.extraerHerramienta(0);

        assertTrue(hachaMadera.getClass().isAssignableFrom(Hacha.class));
        assertEquals(hachaMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
        assertEquals(hachaMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
    }

    @Test
    public void construirPicoDeMadera (){

        Inventario inventario = new Inventario();

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(0, 2);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.contruirHerramientaDeGrilla();

        Pico picoMadera = (Pico) inventario.extraerHerramienta(1);

        assertTrue(picoMadera.getClass().isAssignableFrom(Pico.class));
        assertEquals(picoMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }


    @Test
    public void construirHachaDePiedra(){

        Inventario inventario = new Inventario();

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(1, 0);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.contruirHerramientaDeGrilla();

        Hacha hachaDePiedra = (Hacha)inventario.extraerHerramienta(1);

        assertEquals(hachaDePiedra.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void construirPicoDePiedra(){

        Inventario inventario = new Inventario();

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(0, 2);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.contruirHerramientaDeGrilla();

        Pico PicoDePiedra = (Pico)inventario.extraerHerramienta(1);

        assertEquals(PicoDePiedra.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
        assertEquals(PicoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void contruirHachaDeMetal() {

        Inventario inventario = new Inventario();

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(1, 0);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.contruirHerramientaDeGrilla();

        Hacha HachaDeMetal = (Hacha)inventario.extraerHerramienta(1);

        assertEquals(HachaDeMetal.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(HachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
        assertEquals(HachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
    }

    @Test
    public void construirPicoDeMetal() {

        Inventario inventario = new Inventario();

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 2);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.contruirHerramientaDeGrilla();

        Pico PicoDeMetal = (Pico)inventario.extraerHerramienta(1);

        assertEquals(PicoDeMetal.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(PicoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    @Test
    public void construirPicoFino() {

        Inventario inventario = new Inventario();

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 0);

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 1);

        inventario.seleccionarMetal();
        inventario.guardarSeleccionadoEnGrilla(0, 2);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(1, 1);

        inventario.seleccionarMadera();
        inventario.guardarSeleccionadoEnGrilla(2, 1);

        inventario.seleccionarPiedra();
        inventario.guardarSeleccionadoEnGrilla(1, 0);

        inventario.contruirHerramientaDeGrilla();

        PicoFino picoFino = (PicoFino)inventario.extraerHerramienta(1);

        assertEquals(picoFino.getClass().isAssignableFrom(PicoFino.class),true);
        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
    }

}
