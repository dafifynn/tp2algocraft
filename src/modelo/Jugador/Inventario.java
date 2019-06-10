package modelo.Jugador;

import modelo.Bloque.Material;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Constantes;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Inventario {

    // Atributos

    private Herrero herrero;
    private Grilla grillaInventario;
    private int capacidadUsadaDeInventario;

    //Constructor

    public Inventario(){
        this.herrero = new Herrero();
        this.grillaInventario = new Grilla(FILAS_INVENTARIO,COLUMNAS_INVENTARIO);
        Hacha hachaMadera = herrero.crearHachaDeMadera();
        Celda actual = this.grillaInventario.obtener(1,1);
        actual.asignar(hachaMadera);

    }
    //Metodos

    public Inventario(){
        this.herrero = new Herrero();
        this.grillaInventario = new Grilla(Constantes.FILAS_INVENTARIO,Constantes.COLUMNAS_INVENTARIO);
        Hacha hachaMadera = herrero.crearHachaDeMadera();
        Celda actual = this.grillaInventario.obtener(1,1);
        actual.asignar(hachaMadera);
        this.capacidadUsadaDeInventario = 1;

    }
     public void guardar(Herramienta herramienta){
        if(capacidadUsadaDeInventario <= Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO) {
            int indice = grillaInventario.indiceDe(herramienta);
            int fila = indice / FILAS_INVENTARIO;
            int columna = indice % FILAS_INVENTARIO;
            Celda actual = this.grillaInventario.obtener(fila, columna);
            List<Herramienta> herramientas = actual.obtener();
            herramientas.add(herramienta);
            capacidadUsadaDeInventario++;
        }


    }
    public void guardar(Material material){
        if(capacidadUsadaDeInventario <= Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO) {
            int indice = grillaInventario.indiceDe(material);
            int fila = indice / FILAS_INVENTARIO;
            int columna = indice % FILAS_INVENTARIO;
            Celda actual = this.grillaInventario.obtener(fila, columna);
            List<Material> materiales = actual.obtener();
            materiales.add(material);
            capacidadUsadaDeInventario++;
        }

    }
    public void dibujarInventario(){

        for(i=0 ; i<Constantes.FILAS_INVENTARIO ; i++) {
            for(j=0 ; j<Constantes.COLUMNAS_INVENTARIO ; j++)
                System.out.println("A");
        }
    }
}
