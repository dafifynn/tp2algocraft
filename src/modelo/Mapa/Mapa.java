package modelo.Mapa;

import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Constantes;
import modelo.Jugador.Jugador;
import modelo.Material.Material;
import modelo.Acciones.Movimiento;

import java.util.HashMap;

public class Mapa {

    // Atributo
    private HashMap<Coordenada, Material> materialesDelMapa;
    private Coordenada coordenadaDelJugador;
    private Jugador jugador;

    // Constructor
    public Mapa() {

        this.materialesDelMapa = new HashMap<>();
        this.coordenadaDelJugador = new Coordenada(Constantes.JUGADOR_COORDENADA_X_DEFECTO, Constantes.JUGADOR_COORDENADA_Y_DEFECTO);
        this.jugador = new Jugador();
    }


    // Setter
    public void agregarMaterial (Coordenada unaCoordenada, Material unMaterial) {
        materialesDelMapa.put(unaCoordenada, unMaterial);
    }

    // Getter
    public Coordenada ubicacionDelJugador(){
        return this.jugador.obtenerCoordenada();
    }

    // Metodos publicos
    public void moverJugador (Movimiento movimiento) {
        Jugador.moverse(movimiento, this.materialesDelMapa);
    }

    public void golpear(){


    }

}
