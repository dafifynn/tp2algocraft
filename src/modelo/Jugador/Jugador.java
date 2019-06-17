package modelo.Jugador;

import modelo.Constantes;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Herramienta.Herramienta;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.Material;
import modelo.PlantillasDeForja.PlantillaHachaMadera;

import java.util.HashMap;


public class Jugador {

    // Atributo
    private Inventario inventario;
    private Forja forja;
    private Herramienta herramientaEquipada;
    private Coordenada coordenada;


    // Constructor
    public Jugador(){

        this.coordenada = new Coordenada(Constantes.JUGADOR_COORDENADA_X_DEFECTO, Constantes.JUGADOR_COORDENADA_Y_DEFECTO);
        this.inventario = new Inventario();
        this.forja = new Forja();
        this.herramientaEquipada = forja.construirHerramienta(new PlantillaHachaMadera());
        
    }


    // Getters
    public Coordenada obtenerCoordenada() {
        return this.coordenada;
    }


    // Metodos Privados
    private void guardarEnInventario(){

        this.inventario.agregarHerramienta(this.herramientaEquipada);
    }

    private boolean tengoHerramientaEquipada(){

        return this.herramientaEquipada.getClass().isAssignableFrom(Herramienta.class);
    }

    private boolean hayMaterialEnLaCoordenada(Coordenada coordenada, HashMap<Coordenada, Material> materialesDelMapa) {

		return materialesDelMapa.containsKey(coordenada);
	}


    private Coordenada crearCoordenadaAdyacente (EstrategiaDeDireccion direccion) {
        return direccion.crearCoordenadaSiguiente(this.coordenada);
    }


    // Metodos Publicos
    public void moverse (EstrategiaDeDireccion direccion, Mapa mapa) throws MovimientoInvalidoException {

        Coordenada coordenadaSiguiente = direccion.crearCoordenadaSiguiente(this.coordenada);

        if (mapa.hayMaterialEnCoordenada(coordenadaSiguiente)) {
            throw new MovimientoInvalidoException();
        }

        this.coordenada = coordenadaSiguiente;
    }

    public void impactar(EstrategiaDeDireccion direccion, HashMap<Coordenada, Material> materialesDelMapa) {
        Coordenada coordenadaAdyacente = this.crearCoordenadaAdyacente(direccion);
        if (!this.hayMaterialEnLaCoordenada(coordenadaAdyacente, materialesDelMapa)) {
            throw new MaterialInexistenteException();
        }
        this.herramientaEquipada.impactar(materialesDelMapa.get(coordenadaAdyacente));
        // falta agregar material al inventario y ver que pasa cuando se rompe el material
    }

    public void equipar(int posicion){

        if (this.tengoHerramientaEquipada()){
            this.guardarEnInventario();
        }

        //this.herramientaEquipada = this.inventario.extraerHerramienta(posicion);
    }

    public void abrirInventario(){

        //this.inventario.dibujar();
    }

}
