package test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import modelo.Constantes;
import modelo.Bloque.BloqueDiamante;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

class TestBloqueMadera extends TestCase {

    // Tests de integracion de Bloque de Diamante
    @Test
    void picoDeMetalSeUsaContraDiamanteALaDecimaSeRompe() {

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        BloqueDiamante bloqueDeDiamante = new BloqueDiamante();

        for(int i = 0; i < 9 ; i++){
            picoDeMetal.impactar(bloqueDeDiamante);
            assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        }

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),0.0);
    }
    
}
