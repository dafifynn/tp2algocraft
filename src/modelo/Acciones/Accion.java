package modelo.Acciones;

import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Jugador.Jugador

import java.util.HashMap;

public abstract class Accion {
    // Atributos
	private EstrategiaDeDireccion direccion;


    // Constructor
    public Accion (EstrategiaDeDireccion direccion) {

        this.direccion = direccion;
    }

    // Metodos
    public abstract void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa);
}
