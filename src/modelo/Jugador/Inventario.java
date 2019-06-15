package modelo.Jugador;


import modelo.Grilla.Grilla;
import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Material.Material;
import modelo.PlantillasDeForja.PlantillaHachaMadera;

import java.util.HashMap;
import java.util.List;

public class Inventario {

    // Atributos

    private Grilla<Herramienta> ranuras;
    private HashMap<Material ,Integer> materiales;
    private List<Herramienta> herramientas;
    private int capacidadUsadaDeInventario;


    //Constructor
    public Inventario(){


        this.ranuras = new Grilla<>(Constantes.FILAS_INVENTARIO,Constantes.COLUMNAS_INVENTARIO);
        this.capacidadUsadaDeInventario = Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO;

    }


    //Metodos
    public Herramienta extraerHerramienta(int indice ){

        return herramientas.get(indice);
    }
    
    public void agregarMaterial(Material material){

        Integer cantidad =  this.materiales.get(material);
        this.materiales.put(material,(cantidad +1));

    }

    public void agregarHerramienta(Herramienta herramienta){

        this.herramientas.add(herramienta);

    }

    public void guardarPiedraEnGrilla(int fila, int columna){

        ranuras.agregar(Constantes.PIEDRA,fila,columna);
    }

    public void guardarMetalEnGrilla(int fila, int columna){

        ranuras.agregar(Constantes.METAL,fila,columna);
    }

    public void guardarMaderaEnGrilla(int fila, int columna){

        ranuras.agregar(Constantes.MADERA,fila,columna);
    }
    public Herramienta obtenerHerramientaDeGrilla(){

        String clave = this.ranuras.obtenerClave();
        Forja forja = new Forja();
        return forja.construirHerramienta(new PlantillaHachaMadera());

    }
    public void eliminar(int fila, int columna){
        ranuras.eliminar(fila,columna);
    }

    public void dibujarInventario(){
        //FALTA IMPLEMENTAR
    }
}
