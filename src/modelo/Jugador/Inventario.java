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
        this.capacidadUsadaDeInventarioHerramientas = 1;
    }


    //Metodos
    private void inicializarHashMateriales() {

        this.materiales.put(new MaterialMadera(), 0);
        this.materiales.put(new MaterialPiedra(), 0);
        this.materiales.put(new MaterialMetal(), 0);
        this.materiales.put(new MaterialDiamante(), 0);
    }

    public Material obtenerMaterialSeleccionado(){ return this.materialSeleccionado; }

    private boolean hayMaterial (Material material) {
        return (this.materiales.get(material) > 0);
    }

    public Herramienta extraerHerramienta(int indice) {

        if (this.capacidadUsadaDeInventarioHerramientas == 0 || indice >= this.capacidadUsadaDeInventarioHerramientas ){ return null; }

        Herramienta herramienta = this.herramientas.get(indice);
        this.herramientas.remove(indice);
        this.capacidadUsadaDeInventarioHerramientas --;
        this.notificar();
        return herramienta;
    }

    public Herramienta obtenerHerramienta(int indice) {
        return indice < this.herramientas.size() ? this.herramientas.get(indice) : null;
    }

    public void agregarMaterial(Material material){

       if(capacidadUsadaDeInventarioMateriales <= Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_MATERIALES){
           Integer cantidad =  this.materiales.get(material);
           this.materiales.put(material,(cantidad +1));
           this.capacidadUsadaDeInventarioMateriales++;
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

    public void eliminarMaterial(Material material) throws NoHayMaterialParaEliminarException{

        Integer cantidad =  this.materiales.get(material);
        if(cantidad != 0) {
            this.materiales.put(material, (cantidad - 1));
            this.notificar();
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



    public void guardarSeleccionadoEnGrilla(int fila, int columna) {

        Material extraido = this.materialSeleccionado;
        this.materialSeleccionado = new MaterialVacio();
        plantilla.armarPlantillaEditable(fila,columna, extraido);
    }

 

    public void contruirHerramientaDeGrilla() {

        Forja forja = new Forja();

        try {
            Herramienta herramienta = forja.construirHerramienta(this.plantilla);
            this.agregarHerramienta(herramienta);
            this.capacidadUsadaDeInventarioMateriales -= this.plantilla.getCantDeElementosEnPlantilla();
            plantilla = new PlantillaEditable();

            this.notificar();
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

}
