package modelo.Jugador;

import modelo.Constantes;
import modelo.EstrategiaDeDurabilidad.*;
import modelo.Herramienta.*;

import java.util.HashMap;
import java.util.Map;


public class Herrero {

    private static Map<String, Herramienta> herramientasPosiblesDeConstruir;

    public Herrero(){

        herramientasPosiblesDeConstruir = new HashMap();
        this.inicializarHashDeCombinacionesPosiblesDeHerramientas();
    }


    // Metodos
    public Herramienta construirHerramienta(String combinacionDeMateriales){

        return (herramientasPosiblesDeConstruir.get(combinacionDeMateriales));
    }

    private void inicializarHashDeCombinacionesPosiblesDeHerramientas(){

        herramientasPosiblesDeConstruir.put(Constantes.HACHA_DE_MADERA, this.crearHachaDeMadera());
        herramientasPosiblesDeConstruir.put(Constantes.HACHA_DE_PIEDRA, this.crearHachaDePiedra());
        herramientasPosiblesDeConstruir.put(Constantes.HACHA_DE_METAL, this.crearHachaDeMetal());
        herramientasPosiblesDeConstruir.put(Constantes.PICO_DE_MADERA, this.crearPicoDeMadera());
        herramientasPosiblesDeConstruir.put(Constantes.PICO_DE_PIEDRA, this.crearPicoDePiedra());
        herramientasPosiblesDeConstruir.put(Constantes.PICO_DE_METAL, this.crearPicoDeMetal());
        herramientasPosiblesDeConstruir.put(Constantes.PICO_FINO, this.crearPicoFino());
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
