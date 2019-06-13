package modelo.Grilla;


import modelo.Constantes;

public class Grilla<Object>{

    // Atributo
    private int cantidadFilas;
    private int cantidadColumnas;


    private int[][] elementos;


    // Constructor
    public Grilla(int cantidadFilas, int cantidadColumnas) {

        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.elementos = new int[cantidadFilas][cantidadColumnas];

        for(int i = 0; i < cantidadFilas; i++) {
            for(int j = 0; j < cantidadColumnas; j++) {
                elementos[i][j] = Constantes.VACIO;
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

    public void agregar(int elemento, int x, int y) {

        elementos[x-1][y-1] = elemento;
    }

    public int obtener(int x, int y) {
        return this.elementos[x-1][y-1];
    }

    public void eliminar(int x, int y) {
        elementos[x-1][y-1] = Constantes.VACIO;
    }
    public String obtenerClave() {

        String clave = new String();
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                clave = clave + Integer.toString(elementos[i][j]);
            }
        }
        return clave;
    }
}