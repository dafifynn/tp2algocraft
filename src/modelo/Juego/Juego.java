package modelo.Juego;

import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Jugador.Jugador;
import modelo.Mapa.Mapa;


public class Juego {

    // Atributos
    private Mapa mapa;
    private Jugador jugador;


    // Constructor
    public Juego() {
        this.mapa = new Mapa();
        this.jugador = new Jugador();

    }

    public void moverJugador(EstrategiaDeDireccion direccion) {

        jugador.moverse(direccion,mapa);
    }

}
