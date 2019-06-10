package modelo.Jugador;

import modelo.Grilla.Casilla;
import modelo.Grilla.Grilla;
import modelo.Herramienta.Hacha;
import modelo.Constantes;

public class Inventario {

    // Atributos
    private Herrero herrero;
    private Grilla ranuras;
    private int capacidadUsadaDeInventario;


    //Constructor
    public Inventario(){

        this.herrero = new Herrero();
        this.ranuras = new Grilla(Constantes.FILAS_INVENTARIO,Constantes.COLUMNAS_INVENTARIO);
        this.capacidadUsadaDeInventario = Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO;

        Hacha hachaMadera = (Hacha) herrero.construirHerramienta(Constantes.HACHA_DE_MADERA);

        Casilla primera = this.ranuras.obtener(1,1);
        primera.asignar((Hacha) herrero.construirHerramienta(Constantes.HACHA_DE_MADERA));

        this.capacidadUsadaDeInventario++;
    }


    //Metodos
     public void guardar(Object elemento) {

        boolean seEncontroCasillaLibre = false;

        while(!seEncontroCasillaLibre) {

            int fila = 1;
            int columna = 1;

            if(columna < Constantes.COLUMNAS_INVENTARIO) {
                columna++;
            }
            else {
                if(fila < Constantes.FILAS_INVENTARIO) {
                    fila++;
                }
            }
            Casilla actual = ranuras.obtener(fila,columna);
            if(actual.estaVacio()) {
                actual.asignar(elemento);
                seEncontroCasillaLibre = true;
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
