package modelo.Juego;

import modelo.Constantes;
import modelo.Grilla.Grilla;
import modelo.Jugador.Jugador;

public class Juego {

    private Grilla<Object> mapa;

    private int xJugador;

    private int yJugador;

    public Juego() {
        this.mapa = new Grilla(Constantes.GRILLA_FILAS_DEFECTO, Constantes.GRILLA_COLUMNAS_DEFECTO);
        this.crearJugador();
    }

    public Juego(int x,int y) {
        this.mapa = new Grilla(x,y);
    }

    private void crearJugador() {

        Jugador jugador = new Jugador();
        xJugador = Constantes.JUGADOR_POSICION_X_DEFECTO;
        yJugador = Constantes.JUGADOR_POSICION_Y_DEFECTO;

        mapa.agregar(jugador,xJugador,yJugador);
    }

//    public void moverJugador(String direccion) {
//
//        int xActualizada = this.xJugador;
//        int yActualizada = this.xJugador;
//
//        switch (direccion) {
//            case Constantes.NORTE: yActualizada--;
//            break;
//            case Constantes.SUR: yActualizada++;
//            break;
//            case Constantes.OESTE: xActualizada--;
//            break;
//            case Constantes.ESTE: xActualizada++;
//        }
//
//        if(mapa.desplazar(this.xJugador, this.yJugador, xActualizada, yActualizada)) {
//            this.xJugador = xActualizada;
//        }
//    }

    public void dibujar() {
        Artista.dibujarMundo(this.mapa);
    }
}
