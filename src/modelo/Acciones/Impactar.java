package modelo.Mapa;

public class Impactar extends Accion{

    // Metodos Privados
	public void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa) {
		jugador.impactar(this.direccion, materialesDelMapa);
	}
}
