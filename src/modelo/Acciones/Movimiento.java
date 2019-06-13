package modelo.Acciones;

import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Material.Material;

import java.util.HashMap;


public class Movimiento extends Accion {

	public Movimiento(EstrategiaDeDireccion direccion) {

		super(direccion);
	}

	// Metodos Publicos
	public void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa) {

		jugador.cambiarUbicacion(this.direccion, materialesDelMapa);
	}
}
