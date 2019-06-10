package modelo.Grilla;

public class Casilla {

    // Atributos
    private Object elemento;


    // Constructor
    public Casilla() {
        elemento = null;
    }

    public Casilla(Object nuevo) {
        elemento = nuevo;
    }


    // Metodos
    public void asignar(Object nuevo) {
        this.elemento = nuevo;
    }

    public void remover() {
        this.elemento = null;
    }

    public boolean estaVacio() {
        return this.elemento == null;
    }
}