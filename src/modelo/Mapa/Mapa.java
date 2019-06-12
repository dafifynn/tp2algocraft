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
        this.posicionarJugadorEnEstadoInicial();


    }


    // Metodos privados
    private void inicializarMapa() {

        for(int i = 0; i < this.cantidadFilas; i++) {

            for(int j = 0; j < this.cantidadColumnas; j++) {

                this.mapa[i][j] = new Casilla<>();
            }
        }
    }

    private void posicionarJugadorEnEstadoInicial() {

        this.posJugadorEnX = Constantes.JUGADOR_POSICION_X_DEFECTO;
        this.posJugadorEnY = Constantes.JUGADOR_POSICION_Y_DEFECTO;
    }

    private void guardarDimensionesDeMapa() {

        this.cantidadFilas = Constantes.MAPA_FILAS_DEFECTO;
        this.cantidadColumnas = Constantes.MAPA_COLUMNAS_DEFECTO;
    }


    // Metodos publicos
    public void mover(){


    }

    public void golpear(){


    }

}
