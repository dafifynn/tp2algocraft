package modelo.Mapa;

public class Impactar extends Accion{

    // Metodos Privados
	public void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa) {
		jugador.impactar(this.direccion, materialesDelMapa);
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
