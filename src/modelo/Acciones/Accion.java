public abstract class Accion {
    // Atributos
	private EstrategiaDeDireccion direccion;


    // Constructor
    public Movimiento (EstrategiaDeDireccion direccion) {

        this.direccion = direccion;
    }

    // Metodos
    public abstract void accion (Jugador jugador, HashMap<Coordenada, Material> materialesDelMapa);
}
