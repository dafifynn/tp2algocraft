package modelo.Jugador;


import modelo.Grilla.Grilla;
import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Grilla.Casilla;

public class Inventario {

    // Atributos

    private Grilla<Herramienta> ranuras;
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
    
     public void guardar(Object elemento) {

        boolean seEncontroCasillaLibre = false;
        int fila = 1;
        int columna = 1;

        while(!seEncontroCasillaLibre) {

            Casilla actual = this.ranuras.obtener(fila,columna);
            if(actual.estaVacio()) {
                actual.asignarElemento(elemento);
                seEncontroCasillaLibre = true;
            }
            if(columna < Constantes.COLUMNAS_INVENTARIO) {
                columna++;
            }
            else {
                if(fila < Constantes.FILAS_INVENTARIO) {
                    fila++;
                    columna = 1;
                }
            }


        }
    }

    public void eliminar(int fila, int columna){
        ranuras.eliminar(fila,columna);
    }

    public void dibujarInventario(){
        //FALTA IMPLEMENTAR
    }
}
