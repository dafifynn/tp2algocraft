package modelo.Mapa;


import modelo.Constantes;

public class Mapa<Material>{

    // Atributo
    private int cantidadFilas;
    private int cantidadColumnas;

    private int posJugadorEnX;
    private int posJugadorEnY;

    private Casilla<Material>[][] mapa;


    // Constructor
    public Mapa() {

        this.guardarDimensionesDeMapa();

        this.mapa = new Casilla[Constantes.MAPA_FILAS_DEFECTO][Constantes.MAPA_COLUMNAS_DEFECTO];

        this.inicializarMapa();
        this.posicionarJugador(Constantes.JUGADOR_POSICION_X_DEFECTO, Constantes.JUGADOR_POSICION_Y_DEFECTO);


    }


    // Metodos privados
    private void inicializarMapa() {

        for(int i = 0; i < this.cantidadFilas; i++) {

            for(int j = 0; j < this.cantidadColumnas; j++) {

                this.mapa[i][j] = new Casilla<>();
            }
        }
    }

    private void posicionarJugador(int posEnX, int posEnY) {

        this.posJugadorEnX = posEnX;
        this.posJugadorEnY = posEnY;
    }

    private void guardarDimensionesDeMapa() {

        this.cantidadFilas = Constantes.MAPA_FILAS_DEFECTO;
        this.cantidadColumnas = Constantes.MAPA_COLUMNAS_DEFECTO;
    }


    private boolean movimientoValido(int nuevoPosX, int nuevoPosY) {

        return this.mapa[nuevoPosX][nuevoPosY].verElemento() == null;
    }

    private boolean estaAfueraDeMapa(int nuevoPosX, int nuevoPosY) {

        boolean estaAfuera = false;

        if(nuevoPosX < 0 || nuevoPosX >= this.cantidadFilas){ estaAfuera = true; }

        if(nuevoPosY < 0 || nuevoPosY >= this.cantidadColumnas){ estaAfuera = true; }

        return estaAfuera;
    }

    // Metodos publicos
    public void mover(int direccionEnX, int direccionEnY){
        
        int nuevoPosX = this.posJugadorEnX + direccionEnX;
        int nuevoPosY = this.posJugadorEnY + direccionEnY;

        if(this.estaAfueraDeMapa(nuevoPosX, nuevoPosY)){ return; }

        if(this.movimientoValido(nuevoPosX, nuevoPosY)){

            this.posicionarJugador(nuevoPosX, nuevoPosY);
        }
    }

    public void golpear(){


    }

}
