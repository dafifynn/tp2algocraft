package segundaEntregaTest;

import modelo.Constantes;
import modelo.Juego.Juego;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class juegoTest {

    @Test
    public void seInicializaElJuegoYMapaNoEstaVacio(){
        Juego juego = new Juego();
        Mapa mapa = juego.obtenerMapa();
        boolean hayMaterialEnMapa = false;
        for(int i = 0; i < Constantes.MAPA_FILAS_DEFECTO; i++){
            for(int j = 0 ; j < Constantes.MAPA_COLUMNAS_DEFECTO; j++ ){
                Coordenada coordenada = new Coordenada(i,j);
                if(mapa.hayMaterialEnCoordenada(coordenada)){
                    hayMaterialEnMapa = true;
                }
            }
        }

        assertTrue(hayMaterialEnMapa);
    }
}
