package modelo.Jugador;

import modelo.Acciones.Accion;
import modelo.Constantes;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Mapa.Coordenada;
import modelo.Material.Material;

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
        this.herramientaEquipada = forja.construirHerramienta(Constantes.HACHA_DE_MADERA);
        
    }


    // Getters
    public Coordenada obtenerCoordenada() {
        return this.coordenada;
    }


    // Metodos Privados
    private void guardarEnInventario(){

        this.inventario.guardar(this.herramientaEquipada);
    }

    private boolean tengoHerramientaEquipada(){

        return this.herramientaEquipada.getClass().isAssignableFrom(Herramienta.class);
    }

    private boolean hayMaterialEnLaCoordenada(Coordenada coordenada, HashMap<Coordenada, Material> materialesDelMapa) {

		return materialesDelMapa.containsKey(coordenada);
	}


    private Coordenada crearCoordenadaAdyacente (EstrategiaDeDireccion direccion) {
        return direccion.crearCoordenadaAdyacente(this.coordenada);
    }


    // Metodos Publicos
    public void cambiarUbicacion (EstrategiaDeDireccion direccion, HashMap<Coordenada, Material> materialesDelMapa) throws MovimientoInvalidoException {
        Coordenada nuevaCoordenada = this.crearCoordenadaAdyacente(direccion);
        if (this.hayMaterialEnLaCoordenada(nuevaCoordenada, materialesDelMapa)) {
            throw new MovimientoInvalidoException();
        }
        this.coordenada = nuevaCoordenada;
    }

    public void accion (Accion accion, HashMap<Coordenada, Material> materialesDelMapa) {

        accion.accion(this, materialesDelMapa);
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
