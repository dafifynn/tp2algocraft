package modelo.Jugador;


import modelo.Excepciones.InventarioHerramientasEstaLlenoException;
import modelo.Excepciones.InventarioMaterialesEstaLlenoException;
import modelo.Constantes;
import modelo.Excepciones.NoHayMaterialParaEliminarException;
import modelo.Excepciones.PlantillaDeForjaInexistenteException;
import modelo.Herramienta.Herramienta;
import modelo.Material.*;
import modelo.PlantillasDeForja.PlantillaEditable;
import modelo.PlantillasDeForja.PlantillaHachaMadera;

import java.util.*;

public class Inventario extends Observable {

    // Atributos
    private List<Observer> observadores;

    private PlantillaEditable plantilla;
    private HashMap<Material, Integer> materiales;
    private ArrayList<Herramienta> herramientas;
    private Material materialSeleccionado;
    private int capacidadUsadaDeInventarioMateriales;
    private int capacidadUsadaDeInventarioHerramientas;


    //Constructor
    public Inventario(){


        this.plantilla = new PlantillaEditable();

        this.materiales = new HashMap<>();
        this.inicializarHashMateriales();

        this.observadores = new ArrayList<>();

        this.herramientas = new ArrayList<>();


        Forja forja = new Forja();
        this.agregarHerramienta(forja.construirHerramienta(new PlantillaHachaMadera()));

        this.materialSeleccionado = new MaterialVacio();

        this.capacidadUsadaDeInventarioMateriales = 0;
        this.capacidadUsadaDeInventarioHerramientas = 0;
    }


    //Metodos
    private void inicializarHashMateriales() {

        this.materiales.put(new MaterialMadera(), 0);
        this.materiales.put(new MaterialPiedra(), 0);
        this.materiales.put(new MaterialMetal(), 0);
        this.materiales.put(new MaterialDiamante(), 0);
    }

    public Herramienta extraerHerramienta(int indice ){

        Herramienta herramienta = this.herramientas.get(indice);
        this.herramientas.remove(indice);
        this.capacidadUsadaDeInventarioHerramientas --;

        return herramienta;
    }

    public Herramienta obtenerHerramienta(int indice) {
        return indice < this.herramientas.size() ? this.herramientas.get(indice) : null;
    }

    public void agregarMaterial(Material material){

       if(capacidadUsadaDeInventarioMateriales <= Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_MATERIALES){
           Integer cantidad =  this.materiales.get(material);
           this.materiales.put(material,(cantidad +1));
           this.capacidadUsadaDeInventarioMateriales ++;
           this.notificar();
       }else{
           throw new InventarioMaterialesEstaLlenoException();
       }

    }

    public void agregarHerramienta(Herramienta herramienta){

        if(capacidadUsadaDeInventarioHerramientas<= Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS){
            this.herramientas.add(herramienta);
            this.capacidadUsadaDeInventarioHerramientas++;
        }else{
            throw new InventarioHerramientasEstaLlenoException();
        }
        this.notificar();
    }

    public void eliminarHerramienta(Herramienta herramienta){

        this.herramientas.remove(herramienta);
        this.capacidadUsadaDeInventarioHerramientas--;

    }

    public void eliminarMaterial(Material material){

        Integer cantidad =  this.materiales.get(material);
        if(cantidad != 0) {
            this.materiales.put(material, (cantidad - 1));
        }else{
            throw new NoHayMaterialParaEliminarException();
        }
    }

    public int cantidadDeMadera(){ return this.materiales.get(new MaterialMadera()); }

    public int cantidadDeDiamante(){ return this.materiales.get(new MaterialDiamante()); }

    public int cantidadDePiedra(){ return this.materiales.get(new MaterialPiedra()); }

    public int cantidadDeMetal(){ return this.materiales.get(new MaterialMetal()); }

    public void seleccionarMadera(){

        this.materialSeleccionado = new MaterialMadera();

    }

    public void seleccionarPiedra(){

        this.materialSeleccionado = new MaterialPiedra();

    }

    public void seleccionarMetal(){

        this.materialSeleccionado = new MaterialMetal();

    }

    public void seleccionarDiamante() {

        this.materialSeleccionado = new MaterialDiamante();
    }


    public void guardarPiedraEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, new MaterialPiedra());
        this.materialSeleccionado = new MaterialVacio();

    }

    public void guardarMetalEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, new MaterialMetal());
        this.materialSeleccionado = new MaterialVacio();
    }

    public void guardarMaderaEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, new MaterialMadera());
        this.materialSeleccionado = new MaterialVacio();
    }
    public void guardarDiamanteEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, new MaterialDiamante());
        this.materialSeleccionado = new MaterialVacio();
    }
    public void guardarSeleccionadoEnGrilla(int fila, int columna) {


        Material extraido = this.materialSeleccionado;
        this.materialSeleccionado = null;
        plantilla.armarPlantillaEditable(fila,columna, extraido);
    }

    public Herramienta obtenerHerramientaDeGrilla(){

        Forja forja = new Forja();
        Herramienta herramienta = forja.construirHerramienta(this.plantilla);
        plantilla = new PlantillaEditable();
        return herramienta;

    }

    public void contruirHerramientaDeGrilla() {

        Forja forja = new Forja();

        try {
            Herramienta herramienta = forja.construirHerramienta(this.plantilla);
            this.agregarHerramienta(herramienta);
            plantilla = new PlantillaEditable();
        }
        catch (PlantillaDeForjaInexistenteException e) {

        }
    }

    public void agregarObservador(Observer nuevo) {
        this.observadores.add(nuevo);
    }

    public void notificar() {
        for(Observer observador : this.observadores) {
            observador.update(this,null);
        }
    }

    public PlantillaEditable obtenerPlantilla() {
        return this.plantilla;
    }

    public void interactuarConPlantilla(int fila, int columna) {

        //TODO:
        this.notificar();
    }

    public void dibujarInventario(){
        //FALTA IMPLEMENTAR
    }
}
