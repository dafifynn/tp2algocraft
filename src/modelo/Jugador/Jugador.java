package modelo.Jugador;

import modelo.Constantes;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Excepciones.SinHerramientaEquipadaException;
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


    // Metodos Publicos
    public void moverse (EstrategiaDeDireccion direccion, Mapa mapa) throws MovimientoInvalidoException {

        Coordenada coordenadaSiguiente = direccion.crearCoordenadaSiguiente(this.coordenada);

        if (mapa.hayMaterialEnCoordenada(coordenadaSiguiente)) {
            throw new MovimientoInvalidoException();
        }

        this.coordenada = coordenadaSiguiente;
    }

    private void procesarMaterial (EstrategiaDeDireccion direccion, Mapa mapa) {

        Coordenada coordenadaSiguiente = direccion.crearCoordenadaSiguiente(this.coordenada);
        Material material = mapa.obtenerMaterial(coordenadaSiguiente);
        this.herramientaEquipada.impactar(material);

        if (material.estaRoto()) {
            mapa.removerMaterialDelMapa(coordenadaSiguiente);
            this.inventario.agregarMaterial(material);
        }
    }

    public void impactar (EstrategiaDeDireccion direccion, Mapa mapa) throws SinHerramientaEquipadaException {

        if (herramientaEquipada == null) {
            throw new SinHerramientaEquipadaException();
        }

        procesarMaterial(direccion, mapa);

        if (herramientaEquipada.estaRota()) {
            this.inventario.eliminarHerramienta(this.herramientaEquipada);
            this.herramientaEquipada = null;
        }
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
