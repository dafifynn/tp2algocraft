package pruebasUnitarias;

import modelo.Constantes;
import modelo.Excepciones.PlantillaDeForjaInexistenteException;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Forja;

import modelo.Material.MaterialMadera;
import modelo.PlantillasDeForja.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForjaTest {

    @Test
    public void forjaCreaHachaDeMaderaCorrectamente(){
        Forja forja = new Forja();

        Herramienta hachaDeMadera = forja.construirHerramienta(new PlantillaHachaMadera());

        assertEquals(hachaDeMadera.getClass(), Hacha.class);
        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    public void forjaCreaHachaDePiedraCorrectamente(){
        Forja forja = new Forja();

        Hacha hachaDePiedra = (Hacha) forja.construirHerramienta(new PlantillaHachaPiedra());

        assertEquals(hachaDePiedra.getClass(), Hacha.class);
        assertEquals(hachaDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void forjaCreaHachaDeMetalCorrectamente(){
        Forja forja = new Forja();

        Hacha hachaDeMetal = (Hacha) forja.construirHerramienta(new PlantillaHachaMetal());

        assertEquals(hachaDeMetal.getClass(), Hacha.class);
        assertEquals(hachaDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_METAL);
        assertEquals(hachaDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_METAL);
    }

    @Test
    public void forjaCreaPicoDeMaderaCorrectamente(){
        Forja forja = new Forja();

        Pico picoDeMadera = (Pico) forja.construirHerramienta(new PlantillaPicoMadera());

        assertEquals(picoDeMadera.getClass(), Pico.class);
        assertEquals(picoDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
        assertEquals(picoDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
    }

    @Test
    public void forjaCreaPicoDePiedraCorrectamente(){
        Forja forja = new Forja();

        Pico picoDePiedra = (Pico) forja.construirHerramienta(new PlantillaPicoPiedra());

        assertEquals(picoDePiedra.getClass(), Pico.class);
        assertEquals(picoDePiedra.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_PIEDRA);
        assertEquals(picoDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA);
    }

    @Test
    public void forjaCreaPicoDeMetalCorrectamente(){
        Forja forja = new Forja();

        Pico picoDeMetal = (Pico) forja.construirHerramienta(new PlantillaPicoMetal());

        assertEquals(picoDeMetal.getClass(), Pico.class);
        assertEquals(picoDeMetal.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_METAL);
        assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
    }

    @Test
    public void forjaCreaPicoFinoCorrectamente(){
        Forja forja = new Forja();

        PicoFino picoFino = (PicoFino) forja.construirHerramienta(new PlantillaPicoFino());

        assertEquals(picoFino.getClass(), PicoFino.class);
        assertEquals(picoFino.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_FINO);
        assertEquals(picoFino.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_FINO);
    }

    @Test
    public void forjaCreaHachaMaderaConPlantillaEditable(){
        Forja forja = new Forja();

        PlantillaEditable plantillaEditable = new PlantillaEditable();
        plantillaEditable.armarPlantillaEditable(0,0, new MaterialMadera());
        plantillaEditable.armarPlantillaEditable(0,1, new MaterialMadera());
        plantillaEditable.armarPlantillaEditable(1,0, new MaterialMadera());
        plantillaEditable.armarPlantillaEditable(1,1, new MaterialMadera());
        plantillaEditable.armarPlantillaEditable(2,1, new MaterialMadera());

        Herramienta hachaDeMadera = forja.construirHerramienta(plantillaEditable);

        assertEquals(hachaDeMadera.getClass(), Hacha.class);
        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
    }

    @Test
    public void forjaIntentaCrearHerramientaConPlantillaInexistenteYFalla(){
        Forja forja = new Forja();

        PlantillaEditable plantillaEditable = new PlantillaEditable();
        plantillaEditable.armarPlantillaEditable(0,0, new MaterialMadera());

        try {
            Herramienta herramienta = forja.construirHerramienta(plantillaEditable);
        }catch (PlantillaDeForjaInexistenteException e){ }

    }
}