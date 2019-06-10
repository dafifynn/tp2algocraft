package modelo.Jugador;

import modelo.Bloque.Material;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Constantes;

import java.util.List;

public class Inventario {

    // Atributos

    private Herrero herrero;
    private Grilla grillaInventario ;
    private int capacidadUsadaDeInventario;

    //Constructor

    public Inventario(){
        this.herrero = new Herrero();
        this.grillaInventario = new Grilla(Constantes.FILAS_INVENTARIO,Constantes.COLUMNAS_INVENTARIO);
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
    public void eliminar(int fila, int columna){
        Celda actual = this.grillaInventario.obtener(fila, columna);
        List<Material> materiales = actual.obtener();
        if(materiales.size()>0) {
            materiales.remove(0);
            capacidadUsadaDeInventario--;
        }
    }
    public void dibujarInventario(){

        for(i=0 ; i<Constantes.FILAS_INVENTARIO ; i++) {
            for(j=0 ; j<Constantes.COLUMNAS_INVENTARIO ; j++)
                System.out.println("A");
        }
    }
}
