package modelo.Juego;

import modelo.Grilla.Grilla;

public class Artista {

    public static void dibujarMundo(Grilla<Object> mapa) {

        int filas = mapa.filas();
        int columnas = mapa.columnas();

        for(int y = filas; y >= 1; y--) {

            System.out.print("|");
            for(int x = 1; x <= columnas; x++) {

                if(mapa.obtener(x,y).estaVacio()) {
                    System.out.print("O|");
                }
                else {
                    System.out.print("X|");
                }
            }
            System.out.println();
        }
    }
}
