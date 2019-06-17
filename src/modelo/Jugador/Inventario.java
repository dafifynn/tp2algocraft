package modelo.Jugador;


import modelo.Excepciones.InventarioHerramientasEstaLlenoException;
import modelo.Excepciones.InventarioMaterialesEstaLlenoException;
import modelo.Constantes;
import modelo.Excepciones.NoHayMaterialParaEliminarException;
import modelo.Herramienta.Herramienta;
import modelo.Material.Material;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;
import modelo.PlantillasDeForja.PlantillaEditable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventario {

    // Atributos

    private PlantillaEditable plantilla;
    private HashMap<Material ,Integer> materiales;
    private List<Herramienta> herramientas;
    private int capacidadUsadaDeInventarioMateriales;
    private int capacidadUsadaDeInventarioHerramientas;


    //Constructor
    public Inventario(){


        this.plantilla = new PlantillaEditable();
        this.materiales = new HashMap<>();
        this.herramientas = new ArrayList<Herramienta>();
        this.capacidadUsadaDeInventarioMateriales = 0;
        this.capacidadUsadaDeInventarioHerramientas = 0;


    }


    //Metodos
    public Herramienta extraerHerramienta(int indice ){

        Herramienta herramienta = this.herramientas.get(indice);
        this.herramientas.remove(indice);
        this.capacidadUsadaDeInventarioHerramientas --;

        return herramienta;
    }
    
    public void agregarMaterial(Material material){

       if(capacidadUsadaDeInventarioMateriales<= Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_MATERIALES){
           Integer cantidad =  this.materiales.get(material);
           this.materiales.put(material,(cantidad +1));
           this.capacidadUsadaDeInventarioMateriales ++;
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

    public void guardarPiedraEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, MaterialPiedra.class);
    }

    public void guardarMetalEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, MaterialMetal.class);
    }

    public void guardarMaderaEnGrilla(int fila, int columna){

        plantilla.armarPlantillaEditable(fila,columna, MaterialMadera.class);
    }

    public Herramienta obtenerHerramientaDeGrilla(){

        Forja forja = new Forja();
<<<<<<< HEAD
        Herramienta construida = forja.construirHerramienta(clave);
        this.agregarHerramienta(construida);
        return construida;
=======
        Herramienta herramienta = forja.construirHerramienta(this.plantilla);
        plantilla = new PlantillaEditable();
        return herramienta;
>>>>>>> master

    }

    public void dibujarInventario(){
        //FALTA IMPLEMENTAR
    }
}
