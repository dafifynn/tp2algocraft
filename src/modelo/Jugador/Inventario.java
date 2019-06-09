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
    private Grilla grillaInventario  ;

    //Constructor

    public Inventario(){
        this.herrero = new Herrero();
        this.grillaInventario = new Grilla(FILAS_INVENTARIO,COLUMNAS_INVENTARIO);
        Hacha hachaMadera = herrero.crearHachaDeMadera();
        Celda actual = this.grillaInventario.obtener(1,1);
        actual.asignar(hachaMadera);

    }
    //Metodos

    public Herramienta extraerHerramienta(int fila, int columna ){
        Celda actual = this.grillaInventario.obtener(fila, columna);
        Herramienta herramienta = actual.obtener();
        return herramienta;
    }
    public void guardar(Herramienta herramienta){
        int indice = grillaInventario.indiceDe(herramienta);
        int fila = indice / FILAS_INVENTARIO;
        int columna = indice % FILAS_INVENTARIO;
        Celda actual = this.grillaInventario.obtener(fila,columna);
        List<Herramienta> herramientas = actual.obtener();
        herramientas.add(herramienta);



    }
    public void guardar(Material material){
        int indice = grillaInventario.indiceDe(material);
        int fila = indice / FILAS_INVENTARIO;
        int columna = indice % FILAS_INVENTARIO;
        Celda actual = this.grillaInventario.obtener(fila,columna);
        List<Material> materiales = actual.obtener();
        materiales.add(material);



    }
    public void dibujarInventario(){

        for(Object elemento : elementos) {
            System.out.println("A");
        }
    }
}
