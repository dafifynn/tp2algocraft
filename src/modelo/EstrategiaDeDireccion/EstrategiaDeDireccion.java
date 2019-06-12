package modelo.EstrategiaDeDireccion;

import modelo.Mapa.Coordenada;

public abstract class EstrategiaDeDireccion {

    // Atributos
	protected int avanceFila;
	protected int avanceColumna;

    // Metodos
	public Coordenada crearCoordenadaAdyacente (Coordenada coordenada) {
		return coordenada.crearCoordenadaAdyacente(this.avanceFila, this.avanceColumna);
	}
}
