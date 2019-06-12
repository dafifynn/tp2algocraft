package modelo.Mapa;

public class Casilla<Material> {

    // Atributos
    private Material elemento;


    // Constructor
    public Casilla() {

        this.elemento = null;
    }

    public Casilla(Material nuevo) {

        this.elemento = nuevo;
    }


    // Metodos
    public void asignarElemento(Material nuevo) {
        this.elemento = nuevo;
    }

    public Material verElemento() {
        return this.elemento;
    }

    public void removerElemento() {
        this.elemento = null;
    }

    public boolean estaVacio() {
        return this.elemento == null;
    }

}