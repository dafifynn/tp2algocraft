package modelo.Jugador;

import modelo.Constantes;
import modelo.EstrategiaDeDireccion.DireccionAbajo;
import modelo.EstrategiaDeDireccion.EstrategiaDeDireccion;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Excepciones.SinHerramientaEquipadaException;
import modelo.Herramienta.Herramienta;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class Jugador extends Observable {

    // Atributo
    private Inventario inventario;
    private Herramienta herramientaEquipada;
    private Coordenada coordenada;
    private EstrategiaDeDireccion direccion;

    private List<Observer> observadores;


    // Constructor
    public Jugador(){

        this.coordenada = new Coordenada(Constantes.JUGADOR_COORDENADA_FILA_DEFECTO,
                                         Constantes.JUGADOR_COORDENADA_COLUMNA_DEFECTO);
        this.direccion = new DireccionAbajo();
        this.inventario = new Inventario();
        this.herramientaEquipada = inventario.extraerHerramienta(0);

        this.observadores = new ArrayList<>();
    }


    // Getters
    public Herramienta obtenerHerramienta(){
        return this.herramientaEquipada;
    }


    // Metodos Privados
    private void guardarEnInventario(){

        this.inventario.agregarHerramienta(this.herramientaEquipada);
    }

    private boolean tengoHerramientaEquipada(){

        return this.herramientaEquipada != null;
    }


    // Metodos Publicos
    public void moverse (EstrategiaDeDireccion direccion, Mapa mapa) throws MovimientoInvalidoException {

        Coordenada coordenadaSiguiente = direccion.crearCoordenadaSiguiente(this.coordenada);
        this.direccion = direccion;
        if (mapa.hayMaterialEnCoordenada(coordenadaSiguiente)) {
            throw new MovimientoInvalidoException();
        }

        this.coordenada = coordenadaSiguiente;
    }

    private void procesarMaterial (Mapa mapa) {

        Coordenada coordenadaSiguiente = this.direccion.crearCoordenadaSiguiente(this.coordenada);
        Material material = mapa.obtenerMaterial(coordenadaSiguiente);

        this.herramientaEquipada.impactar(material);

        if (material.estaRoto()) {
            mapa.removerMaterialDelMapa(coordenadaSiguiente);
            this.inventario.agregarMaterial(material);
        }
    }

    public void impactar (Mapa mapa) throws SinHerramientaEquipadaException {

        if (herramientaEquipada == null) {
            throw new SinHerramientaEquipadaException();
        }

        procesarMaterial(mapa);

        if (herramientaEquipada.estaRota()) {

            this.herramientaEquipada = null;
            this.notificar();
        }
    }

    public Inventario obtenerInventario() {
        return this.inventario;
    }

    public void equipar(int posicion){

        Herramienta herramientaAEquipar = this.inventario.extraerHerramienta(posicion);

        if (this.tengoHerramientaEquipada()){
            this.guardarEnInventario();
        }

        this.herramientaEquipada = herramientaAEquipar;
    }

    public void agregarObservador(Observer nuevo) {

        this.observadores.add(nuevo);
    }

    public Coordenada obtenerCoordenada(){

        return this.coordenada;
    }

    public void notificar() {

        for(Observer observador : this.observadores) {
            observador.update(this,null);
        }
    }

}
