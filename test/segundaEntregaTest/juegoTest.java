package segundaEntregaTest;

import modelo.Constantes;
import modelo.Juego.Juego;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

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

    @Test
    public void seInicializaElJuegoYJugadorEstaUbicadoCorrectamente(){

        Juego juego = new Juego();
        Jugador jugador = juego.obtenerJugador();

        Coordenada coordenada = new Coordenada(Constantes.JUGADOR_COORDENADA_X_DEFECTO, Constantes.JUGADOR_COORDENADA_Y_DEFECTO);

        assertTrue(coordenada.equals(jugador.obtenerCoordenada()));
    }
}
