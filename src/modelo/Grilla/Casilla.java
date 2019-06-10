package modelo.Grilla;

public class Casilla {

    private Object elemento;

    public Casilla() {
        elemento = null;
    }

    public Casilla(Object nuevo) {
        elemento = nuevo;
    }

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