package pruebasUnitarias;

import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Forja;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForjaTest {

    @Test
    public void herreroCreaHachaDeMaderaCorrectamente(){
        Forja forja = new Forja();

        Herramienta hachaDeMadera = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);

        assertEquals(hachaDeMadera.getClass(), Hacha.class);
        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    public void herreroCreaHachaDePiedraCorrectamente(){
        Forja forja = new Forja();

        Hacha hachaDePiedra = (Hacha) forja.construirHerramienta(Constantes.HACHA_DE_PIEDRA);

        assertEquals(hachaDePiedra.getClass(), Hacha.class);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void herreroCreaHachaDeMetalCorrectamente(){
        Forja forja = new Forja();

        Hacha hachaDeMetal = (Hacha) forja.construirHerramienta(Constantes.HACHA_DE_METAL);

        assertEquals(hachaDeMetal.getClass(), Hacha.class);
        assertEquals(hachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
    }

    @Test
    public void herreroCreaPicoDeMaderaCorrectamente(){
        Forja forja = new Forja();

        Pico picoDeMadera = (Pico) forja.construirHerramienta(Constantes.PICO_DE_MADERA);

        assertEquals(picoDeMadera.getClass(), Pico.class);
        assertEquals(picoDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
        assertEquals(picoDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
    }

    @Test
    public void herreroCreaPicoDePiedraCorrectamente(){
        Forja forja = new Forja();

        Pico picoDePiedra = (Pico) forja.construirHerramienta(Constantes.PICO_DE_PIEDRA);

        assertEquals(picoDePiedra.getClass(), Pico.class);
        assertEquals(picoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
        assertEquals(picoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void herreroCreaPicoDeMetalCorrectamente(){
        Forja forja = new Forja();

        Pico picoDeMetal = (Pico) forja.construirHerramienta(Constantes.PICO_DE_METAL);

        assertEquals(picoDeMetal.getClass(), Pico.class);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void herreroCreaPicoFinoCorrectamente(){
        Forja forja = new Forja();

        PicoFino picoFino = (PicoFino) forja.construirHerramienta(Constantes.PICO_FINO);

        assertEquals(picoFino.getClass(), PicoFino.class);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

}