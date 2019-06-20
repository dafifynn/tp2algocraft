package modelo.Juego;

import modelo.Grilla.Grilla;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
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

        for(int i = 24; i < 29; i ++){
            for(int j = 0; j < 4; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }


        for(int i = 23; i < 29; i ++){
            for(int j = 7; j < 13; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for(int i = 23; i < 25; i ++){
            for(int j = 4; j < 7; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for(int i = 3; i < 12; i ++){
            for(int j = 26; j < 30; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for(int i = 3; i < 8; i ++){
            for(int j = 0; j < 22; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        for(int i = 0; i < 3; i ++){
            for(int j = 7; j < 30; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMadera());
            }
        }

        int i = 28;
        for(int j = 4; j < 7; j ++){
            mapa.agregarMaterial(new Coordenada(j,i), new MaterialMadera());

        }

    }

    private void crearPiedraEnTerreno(Mapa mapa){

        for(int i = 14; i < 21; i ++){
            for(int j = 3; j < 8; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int i = 10; i < 16; i ++){
            for(int j = 13; j < 18; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int i = 16; i < 30; i ++){
            for(int j = 19; j < 21; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int i = 16; i < 19; i ++){
            for(int j = 21; j < 25; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }

        for(int i = 3; i < 8; i ++){
            for(int j = 22; j < 26; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialPiedra());
            }
        }
    }

    private void crearMetalEnTerreno(Mapa mapa){

        for(int i = 9; i < 14; i ++){
            for(int j = 0; j < 5; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());
            }
        }

        for(int i = 16; i < 19; i ++){
            for(int j = 25; j < 30; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());
            }
        }
        int i = 19;
        for(int j = 21; j < 30; j ++){
            mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());

        }
        int j = 21;
        for( i = 20; i < 30; i ++){
            mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());

        }

    }

    private void crearDiamanteEnTerreno(Mapa mapa){

        for(int i = 21; i < 27; i ++){
            for(int j = 23; j < 28; j++){
                mapa.agregarMaterial(new Coordenada(i,j), new MaterialMetal());
            }
        }
    }
}
