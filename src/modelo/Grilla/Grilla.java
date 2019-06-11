package modelo.Grilla;

import java.util.function.Supplier;

public class Grilla<T>{

    // Atributo
    private int cantidadFilas;
    private int cantidadColumnas;


    private Casilla<T>[][] elementos;


    // Constructor
    public Grilla(int cantidadFilas, int cantidadColumnas) {

        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.elementos = new Casilla[cantidadFilas][cantidadColumnas];

        for(int i = 0; i < cantidadFilas; i++) {
            for(int j = 0; j < cantidadColumnas; j++) {
                elementos[i][j] = new Casilla<>();
            }
        }
    }


    // Metodos
    public int filas() {
        return this.cantidadFilas;
    }

    public int columnas() {
        return this.cantidadColumnas;
    }

    public void agregar(T elemento, int x, int y) {

        elementos[x-1][y-1].asignar(elemento);
    }

    public Casilla<T> obtener(int x, int y) {
        return this.elementos[x-1][y-1];
    }

    public void eliminar(int x, int y) {
        elementos[x-1][y-1].remover();
    }
}
