package modelo.Mapa;

import modelo.Jugador.Jugador;
import modelo.Constantes;
import modelo.Material.Material;
import modelo.Acciones.Movimiento;

import java.util.HashMap;

public class Mapa {

    // Atributo
    private HashMap<Coordenada, Material> materialesDelMapa;
    private Jugador jugador;


    // Constructor
    public Mapa() {

        this.materialesDelMapa = new HashMap<>();
       this.jugador = new Jugador();
    }


    // Setter
    public void agregarMaterial (Coordenada unaCoordenada, Material unMaterial) {
        materialesDelMapa.put(unaCoordenada, unMaterial);
    }


    // Metodos publicos
    public void moverJugador (Movimiento movimiento) {

        movimiento.accion(this.jugador, this.materialesDelMapa);
    }


    public void golpear(){


    }

}
