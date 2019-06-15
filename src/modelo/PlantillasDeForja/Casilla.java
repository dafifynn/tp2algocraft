package modelo.PlantillasDeForja;

public class Casilla{

    // Atributos
    private Class elemento;


    // Constructor
    public Casilla() {

        this.elemento = null;
    }

    public Casilla(Class nuevo) {

        this.elemento = nuevo;
    }


    // Metodos
    public void asignarElemento(Class nuevo) {
        this.elemento = nuevo;
    }

    public Class verElemento() {
        return this.elemento;
    }

    public void removerElemento() {
        this.elemento = null;
    }

    public boolean estaVacio() {
        return this.elemento == null;
    }

}