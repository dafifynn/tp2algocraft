package modelo.Acciones;

import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Material.Material;

import java.util.HashMap;

public abstract class Accion {

    // Atributos
	protected EstrategiaDeDireccion direccion;


    // Constructor
    public Accion (EstrategiaDeDireccion direccion) {

        this.direccion = direccion;
    }


    // Metodos
    public abstract void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa);
}
