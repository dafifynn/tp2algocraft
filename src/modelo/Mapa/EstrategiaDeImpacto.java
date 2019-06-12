package modelo.Mapa;

public abstract class EstrategiaDeImpacto {

    // Atributos
	protected int impactarEnFila;
	protected int impactarEnColumna;

    private boolean hayMaterialEnLaCoordenada(Coordenada coordenada, HashMap<Coordenada, Material> materialesDelMapa) {
		return materialesDelMapa.containsKey(coordenada);
	}

    // Metodos
	public void impactar(Coordenada coordenada, Herramienta herramienta, HashMap<Coordenada, Material> materialesDelMapa) {

		Coordenada coordenadaAdyacente = coordenada.obtenerCoordenadaAdyacente(this.impactarEnFila, this.impactarEnColumna);
        if (!hayMaterialEnLaCoordenada(coordenadaAdyacente, materialesDelMapa)) {
            throw new MaterialInexistenteException;
        }
        herramienta.impactar(materialesDelMapa.get(coordenadaAdyacente));
	}

    private void procesarMaterial(Jugador jugador, coordenanda) {
        if (jugador.seProcesoMaterial(materialesDelMapa.get(coordenada))) {
            materialesDelMapa.remove(coordenada);
        }
    }
}
