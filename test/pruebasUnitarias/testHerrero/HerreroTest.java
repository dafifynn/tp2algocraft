package testHerrero;

import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Herrero;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HerreroTest {

    @Test
    public void herreroCreaHachaDeMaderaCorrectamente(){
        Herrero herrero = new Herrero();

        Hacha hachaDeMadera = (Hacha) herrero.construirHerramienta(Constantes.HACHA_DE_MADERA);

        assertEquals(hachaDeMadera.getClass(), Hacha.class);
        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    public void herreroCreaHachaDePiedraCorrectamente(){
        Herrero herrero = new Herrero();

        Hacha hachaDePiedra = (Hacha) herrero.construirHerramienta(Constantes.HACHA_DE_PIEDRA);

        assertEquals(hachaDePiedra.getClass(), Hacha.class);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void herreroCreaHachaDeMetalCorrectamente(){
        Herrero herrero = new Herrero();

        Hacha hachaDeMetal = (Hacha) herrero.construirHerramienta(Constantes.HACHA_DE_METAL);

        assertEquals(hachaDeMetal.getClass(), Hacha.class);
        assertEquals(hachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
    }

    @Test
    public void herreroCreaPicoDeMaderaCorrectamente(){
        Herrero herrero = new Herrero();

        Pico picoDeMadera = (Pico) herrero.construirHerramienta(Constantes.PICO_DE_MADERA);

        assertEquals(picoDeMadera.getClass(), Pico.class);
        assertEquals(picoDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
        assertEquals(picoDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
    }

    @Test
    public void herreroCreaPicoDePiedraCorrectamente(){
        Herrero herrero = new Herrero();

        Pico picoDePiedra = (Pico) herrero.construirHerramienta(Constantes.PICO_DE_PIEDRA);

        assertEquals(picoDePiedra.getClass(), Pico.class);
        assertEquals(picoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
        assertEquals(picoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void herreroCreaPicoDeMetalCorrectamente(){
        Herrero herrero = new Herrero();

        Pico picoDeMetal = (Pico) herrero.construirHerramienta(Constantes.PICO_DE_METAL);

        assertEquals(picoDeMetal.getClass(), Pico.class);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void herreroCreaPicoFinoCorrectamente(){
        Herrero herrero = new Herrero();

        PicoFino picoFino = (PicoFino) herrero.construirHerramienta(Constantes.PICO_FINO);

        assertEquals(picoFino.getClass(), PicoFino.class);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

}