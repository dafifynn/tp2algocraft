package modelo.Grilla;

public class Grilla {

    //atributo
    private int cantidadFilas;
    private int cantidadColumnas;
    private Casilla[][] casillas;

    //metodos
    public Grilla(int cantidadFilas, int cantidadColumnas) {

        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        casillas = new Casilla[cantidadFilas][cantidadColumnas];

        for(int x = 0; x < cantidadFilas; x++) {
            for (int y = 0; y < cantidadColumnas; y++) {
                casillas[x][y] = new Casilla();
            }
        }
    }

    public void dibujar() {

        for(int y = 0; y < cantidadFilas; y++) {

            System.out.print("|");
            for(int x = 0; x < cantidadColumnas; x++) {

                Casilla actual = casillas[x][y];

                if(actual.estaVacio()) {
                    System.out.print("O|");
                }
                else {
                    System.out.print("X|");
                }
            }
            System.out.println();
        }
    }

    public void agregar(Object elemento, int x, int y) {
        
        Casilla obtenida = casillas[x-1][y-1];
        obtenida.asignar(elemento);
    }

    public Casilla obtener(int x, int y) {
        return this.casillas[x-1][y-1];
    }

    public void eliminar(int x, int y) {
        casillas[x-1][y-1].remover();
    }

    public boolean desplazar(int x, int y, int xActualizada, int yActualizada) {

        boolean seDesplazo = false;
        Casilla colisionada = casillas[xActualizada-1][yActualizada-1];

        if(colisionada.estaVacio()) {

            casillas[xActualizada-1][yActualizada-1] = casillas[x-1][y-1];
            casillas[x-1][y-1] = new Casilla();
            seDesplazo = true;
        }

        return seDesplazo;
    }

}
