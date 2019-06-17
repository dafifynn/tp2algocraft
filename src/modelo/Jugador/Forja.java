package modelo.Jugador;

import modelo.Constantes;
import modelo.EstrategiaDeDurabilidad.*;
import modelo.Excepciones.PlantillaDeForjaInexistenteException;
import modelo.Herramienta.*;
import modelo.PlantillasDeForja.*;

import java.util.HashMap;


public class Forja {

    private HashMap<PlantillaDeForja, Herramienta> herramientasPosiblesDeConstruir;

    public Forja() {

        herramientasPosiblesDeConstruir = new HashMap<>();
        this.inicializarHashDeCombinacionesPosiblesDeHerramientas();
    }


    // Metodos Publico
    public Herramienta construirHerramienta(PlantillaDeForja plantillaDeForja) throws PlantillaDeForjaInexistenteException {

        if (!this.esPlantillaValida(plantillaDeForja)) { throw new PlantillaDeForjaInexistenteException(); }

        return herramientasPosiblesDeConstruir.get(plantillaDeForja);
    }


    // Metedo Privado
    private void inicializarHashDeCombinacionesPosiblesDeHerramientas(){

        herramientasPosiblesDeConstruir.put(new PlantillaHachaMadera(), this.crearHachaDeMadera());
        herramientasPosiblesDeConstruir.put(new PlantillaHachaPiedra(), this.crearHachaDePiedra());
        herramientasPosiblesDeConstruir.put(new PlantillaHachaMetal(), this.crearHachaDeMetal());
        herramientasPosiblesDeConstruir.put(new PlantillaPicoMadera(), this.crearPicoDeMadera());
        herramientasPosiblesDeConstruir.put(new PlantillaPicoPiedra(), this.crearPicoDePiedra());
        herramientasPosiblesDeConstruir.put(new PlantillaPicoMetal(), this.crearPicoDeMetal());
        herramientasPosiblesDeConstruir.put(new PlantillaPicoFino(), this.crearPicoFino());
    }

    private boolean esPlantillaValida(PlantillaDeForja plantillaDeForja) {

        return this.herramientasPosiblesDeConstruir.containsKey(plantillaDeForja);
    }


    // Metodos de Construccion
    // Hacha
    private Hacha crearHachaDeMadera() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_HACHA_MADERA,
                                                    Constantes.VALOR_DE_DESGASTE_DE_HACHA_MADERA);

        return (new Hacha(Constantes.FUERZA_INICIAL_HACHA_MADERA, estrategiaDurabilidad));
    }

    private Hacha crearHachaDePiedra() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA,
                                                    Constantes.VALOR_DE_DESGASTE_DE_HACHA_PIEDRA);

        return (new Hacha(Constantes.FUERZA_INICIAL_HACHA_PIEDRA, estrategiaDurabilidad));
    }

    private Hacha crearHachaDeMetal() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_HACHA_METAL,
                                                    Constantes.VALOR_DE_DESGASTE_DE_HACHA_METAL);

        return (new Hacha(Constantes.FUERZA_INICIAL_HACHA_METAL,estrategiaDurabilidad));
    }


    // Pico
    private Pico crearPicoDeMadera() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_PICO_MADERA,
                                                    Constantes.VALOR_DE_DESGASTE_DE_PICO_MADERA);

        return new Pico(Constantes.FUERZA_INICIAL_PICO_MADERA, estrategiaDurabilidad);
    }

    private Pico crearPicoDePiedra() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA,
                                                    Constantes.VALOR_DE_DESGASTE_DE_PICO_PIEDRA);

        return new Pico(Constantes.FUERZA_INICIAL_PICO_PIEDRA, estrategiaDurabilidad);
    }

    private Pico crearPicoDeMetal() {

        NUsos estrategiaDurabilidad = new NUsos(Constantes.DURABILIDAD_INICIAL_PICO_METAL,
                            Constantes.VALOR_DE_DESGASTE_DE_PICO_METAL, Constantes.CANTIDAD_DE_USOS_DE_PICO_METAL);

        return new Pico(Constantes.FUERZA_INICIAL_PICO_METAL, estrategiaDurabilidad);
    }


    // Pico Fino
    private PicoFino crearPicoFino() {

        Dinamica estrategiaDurabilidad = new Dinamica(Constantes.DURABILIDAD_INICIAL_PICO_FINO,
                                                    Constantes.VALOR_DE_DESGASTE_DE_PICO_FINO);

        return new PicoFino(Constantes.FUERZA_INICIAL_PICO_FINO, estrategiaDurabilidad);
    }

}
