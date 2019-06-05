import modelo.Herramienta.Hacha;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;

public class Jugador {

    // Hacha
    public Hacha crearHachaDeMadera() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_HACHA_MADERA, Constantes.VALOR_DE_DESGASTE_DE_HACHA_MADERA);

        return (new Hacha(Constantes.FUERZA_INICIAL_HACHA_MADERA, estrategiaDurabilidad));

    }

    public Hacha crearHachaDePiedra() {

        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA, Constantes.VALOR_DE_DESGASTE_DE_HACHA_PIEDRA);

        return (new Hacha(Constantes.FUERZA_INICIAL_HACHA_PIEDRA, estrategiaDurabilidad));
    }

    public Hacha crearHachaDeMetal() {
        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_HACHA_METAL, Constantes.VALOR_DE_DESGASTE_DE_HACHA_METAL);

        return (new Hacha(Constantes.FUERZA_INICIAL_HACHA_METAL,estrategiaDurabilidad));
    }


    // Pico
    public Pico crearPicoDeMadera() {
        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_PICO_MADERA, Constantes.VALOR_DE_DESGASTE_DE_PICO_MADERA);

        return new Pico(Constantes.FUERZA_INICIAL_PICO_MADERA, estrategiaDurabilidad);
    }

    public Pico crearPicoDePiedra() {
        Lineal estrategiaDurabilidad = new Lineal(Constantes.DURABILIDAD_INICIAL_PICO_PIEDRA, Constantes.VALOR_DE_DESGASTE_DE_PICO_PIEDRA);

        return new Pico(Constantes.FUERZA_INICIAL_PICO_PIEDRA, estrategiaDurabilidad);
    }

    public Pico crearPicoDeMetal() {
        NUsos estrategiaDurabilidad = new NUsos(Constantes.DURABILIDAD_INICIAL_PICO_METAL, Constantes.VALOR_DE_DESGASTE_DE_PICO_METAL, Constantes.CANTIDAD_DE_USOS_DE_PICO_METAL);

        return new Pico(Constantes.FUERZA_INICIAL_PICO_METAL, estrategiaDurabilidad);
    }


    // Pico Fino
    public PicoFino crearPicoFino() {
        Dinamica estrategiaDurabilidad = new Dinamica(Constantes.DURABILIDAD_INICIAL_PICO_FINO, Constantes.VALOR_DE_DESGASTE_DE_PICO_FINO);

        return new PicoFino(Constantes.FUERZA_INICIAL_PICO_FINO, estrategiaDurabilidad);
    }
}
