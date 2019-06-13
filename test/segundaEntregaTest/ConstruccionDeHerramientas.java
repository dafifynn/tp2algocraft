package segundaEntregaTest;


import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Inventario;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionDeHerramientas {

    @Test
    public void construirHachaDeMadera (){

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(1,2);
        inventario.guardarMaderaEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Hacha hachaMadera = (Hacha) inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaMadera.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
        assertEquals(hachaMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
    }

    @Test
    public void construirPicoDeMadera (){

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(1,2);
        inventario.guardarMaderaEnGrilla(1,3);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Pico picoMadera = (Pico) inventario.obtenerHerramientaDeGrilla();

        assertEquals(picoMadera.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(picoMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }


    @Test
    public void construirHachaDePiedra(){

        Inventario inventario = new Inventario();
        inventario.guardarPiedraEnGrilla(1,1);
        inventario.guardarPiedraEnGrilla(1,2);
        inventario.guardarPiedraEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Hacha hachaDePiedra = (Hacha)inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaDePiedra.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void construirPicoDePiedra(){

        Inventario inventario = new Inventario();
        inventario.guardarPiedraEnGrilla(1,1);
        inventario.guardarPiedraEnGrilla(1,2);
        inventario.guardarPiedraEnGrilla(1,3);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Pico PicoDePiedra = (Pico)inventario.obtenerHerramientaDeGrilla();

        assertEquals(PicoDePiedra.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
        assertEquals(PicoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void contruirHachaDeMetal() {

        Inventario inventario = new Inventario();
        inventario.guardarMetalEnGrilla(1,1);
        inventario.guardarMetalEnGrilla(1,2);
        inventario.guardarMetalEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Hacha HachaDeMetal = (Hacha)inventario.obtenerHerramientaDeGrilla();

        assertEquals(HachaDeMetal.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(HachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
        assertEquals(HachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
    }

    public void construirPicoDeMetal() {

        Inventario inventario = new Inventario();
        inventario.guardarMetalEnGrilla(1,1);
        inventario.guardarMetalEnGrilla(1,2);
        inventario.guardarMetalEnGrilla(1,3);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Pico PicoDeMetal = (Pico)inventario.obtenerHerramientaDeGrilla();

        assertEquals(PicoDeMetal.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        assertEquals(PicoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
    }

    public void construirPicoFino() {

        Inventario inventario = new Inventario();
        inventario.guardarMetalEnGrilla(1,1);
        inventario.guardarMetalEnGrilla(1,2);
        inventario.guardarMetalEnGrilla(1,3);
        inventario.guardarPiedraEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        PicoFino PicoFino = (PicoFino)inventario.obtenerHerramientaDeGrilla();

        assertEquals(PicoFino.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(PicoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
        assertEquals(PicoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
    }
}
