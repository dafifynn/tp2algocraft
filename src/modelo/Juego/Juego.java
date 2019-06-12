package modelo.Juego;

import modelo.Jugador.Jugador;
import modelo.Mapa.Mapa;


public class Juego {

    // Atributos
    private Mapa  mapa;
    private Jugador jugador;


    // Constructor
    public Juego() {
        this.mapa = new Mapa();
        this.jugador = new Jugador();

    }

}
