package modelo.Mapa;

import modelo.Excepciones.MaterialInexistenteException;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Jugador;
import modelo.Material.Material;

import java.util.HashMap;

public abstract class EstrategiaDeImpacto {

    // Atributos
	protected int impactarEnFila;
	protected int impactarEnColumna;

    private boolean hayMaterialEnLaCoordenada(Coordenada coordenada, HashMap<Coordenada, Material> materialesDelMapa) {
		return materialesDelMapa.containsKey(coordenada);
	}

    // Metodos
	public void impactar(Coordenada coordenada, Herramienta herramienta, HashMap<Coordenada, Material> materialesDelMapa) {

		Coordenada coordenadaAdyacente = coordenada.crearCoordenadaAdyacente(this.impactarEnFila, this.impactarEnColumna);
        if (!hayMaterialEnLaCoordenada(coordenadaAdyacente, materialesDelMapa)) {
            throw new MaterialInexistenteException();
        }
        herramienta.impactar(materialesDelMapa.get(coordenadaAdyacente));
	}
/*
    private void procesarMaterial(Jugador jugador, Coordenada coordenada, HashMap<Coordenada, Material> materialesDelMapa) {
        if (jugador.seProcesoMaterial(materialesDelMapa.get(coordenada))) {
            materialesDelMapa.remove(coordenada);
        }
    }
 */
}
