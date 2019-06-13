package modelo.Jugador;


import modelo.Grilla.Grilla;
import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Grilla.Casilla;
import modelo.Material.Material;

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
    public Herramienta extraerHerramienta(int fila, int columna ){

        Casilla<Herramienta> elegida = this.ranuras.obtener(fila, columna);
        Herramienta extraida = null;

        if(!elegida.estaVacio()) {
            extraida = elegida.verElemento();
        }
        // TODO: THROW EXCEPTION

        return extraida;
    }
    
    public void agregarMaterial(Material material){

        Integer cantidad =  this.materiales.get(material);
        this.materiales.put(material,(cantidad +1));

    }

    public void agregarHerramienta(Herramienta herramienta){

        this.herramientas.add(herramienta);

    }


    public void eliminar(int fila, int columna){
        ranuras.eliminar(fila,columna);
    }

    public void dibujarInventario(){
        //FALTA IMPLEMENTAR
    }
}
