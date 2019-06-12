package modelo.Juego;

import modelo.Jugador.Jugador;
import modelo.Mapa.Mapa;
import modelo.Material.Material;


public class Juego {

    // Atributos
    private Mapa<Material> mapa;
    private Jugador jugador;


    // Constructor
    public Juego() {
        this.mapa = new Mapa<>();
        this.jugador = new Jugador();

    }

}
