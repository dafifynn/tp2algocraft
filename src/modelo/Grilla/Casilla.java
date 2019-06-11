package modelo.Grilla;

public class Casilla<T> {

    // Atributos
    private T elemento;


    // Constructor
    public Casilla() {
        elemento = null;
    }

    public Casilla(T nuevo) {
        elemento = nuevo;
    }


    // Metodos
    public void asignar(T nuevo) {
        this.elemento = nuevo;
    }

    public T elemento() {
        return this.elemento;
    }

    public void remover() {
        this.elemento = null;
    }

    public boolean estaVacio() {
        return this.elemento == null;
    }
}