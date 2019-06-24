package modelo.Juego;

import modelo.Grilla.Grilla;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.MaterialDiamante;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;

public class Artista {

//    public static void dibujarMundo(Grilla<Object> mapa) {
//
//        int filas = mapa.filas();
//        int columnas = mapa.columnas();
//
//        for(int y = filas; y >= 1; y--) {
//
//            System.out.print("|");
//            for(int x = 1; x <= columnas; x++) {
//
//                if(mapa.obtener(x,y).estaVacio()) {
//                    System.out.print("O|");
//                }
//                else {
//                    System.out.print("X|");
//                }
//            }
//            System.out.println();
//        }
//    }

    public void crearTerreno(Mapa mapa) {

        crearMaderaEnTerreno(mapa);
        crearPiedraEnTerreno(mapa);
        crearMetalEnTerreno(mapa);
        crearDiamanteEnTerreno(mapa);

    }

    private void crearMaderaEnTerreno(Mapa mapa){

        for (int j = 24; j < 29; j ++){
            for (int i = 0; i < 4; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }


        for (int j = 23; j < 29; j++){
            for(int i = 7; i < 13; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for (int j = 23; j < 25; j++){
            for (int i = 4; i < 7; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for (int j = 3; j < 12; j ++){
            for (int i = 26; i < 30; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for (int j = 3; j < 8; j ++){
            for (int i = 0; i < 22; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for (int j = 0; j < 3; j++){
            for (int i = 7; i < 30; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        int j = 28;
        for(int i = 4; i < 7; i++){
            mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());

        }

    }

    private void crearPiedraEnTerreno(Mapa mapa){

        for(int j = 14; j < 21; j++){
            for(int i = 3; i < 8; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int j = 10; j < 16; j++){
            for(int i = 13; i < 18; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int j = 16; j < 30; j ++){
            for(int i = 19; i < 21; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int j = 16; j < 19; j ++){
            for(int i = 21; i < 25; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int j = 3; j < 8; j++){
            for(int i = 22; i < 26; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }
    }

    private void crearMetalEnTerreno(Mapa mapa){

        for (int j = 9; j < 14; j++){
            for (int i = 0; i < 5; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());
            }
        }

        for (int j = 16; j < 19; j ++){
            for (int i = 25; i < 30; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());
            }
        }

        int j = 19;
        for (int i = 21; i < 30; i++){
            mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());
        }

        int i = 21;
        for( j = 20; j < 30; j++){
            mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());

        }

    }

    private void crearDiamanteEnTerreno(Mapa mapa){

        for(int j = 21; j < 27; j ++){
            for(int i = 23; i < 28; i++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialDiamante());
            }
        }
    }
}
