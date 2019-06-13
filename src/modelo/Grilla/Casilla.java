package modelo.Grilla;

public class Casilla<Object> {

    // Atributos
    private Object elemento;


    // Constructor
    public Casilla() {

        this.elemento = null;
    }

    public Casilla(Object nuevo) {

        this.elemento = nuevo;
    }


    // Metodos
    public void asignarElemento(Object nuevo) {
        this.elemento = nuevo;
    }

    public Object verElemento() {
        return this.elemento;
    }

    public void removerElemento() {
        this.elemento = null;
    }

    public boolean estaVacio() {
        return this.elemento == null;
    }

}