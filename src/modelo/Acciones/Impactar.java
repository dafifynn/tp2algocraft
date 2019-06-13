package modelo.Acciones;

import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Material.Material;

import java.util.HashMap;

public class Impactar extends Accion {

	public Impactar(EstrategiaDeDireccion direccion) {

		super(direccion);
	}

	// Metodos Privados
	public void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa) {

		jugador.impactar(this.direccion, materialesDelMapa);
	}
}
