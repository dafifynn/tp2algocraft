package modelo.Acciones;

import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Mapa.Coordenada;
import modelo.Material.Material;
import modelo.Excepciones.MovimientoInvalidoException;

import java.util.HashMap;


public class Movimiento extends Accion {

    // Metodos Publicos
	public void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa) {
		jugador.cambiarUbicacion(this.direccion, materialesDelMapa);
	}
}
