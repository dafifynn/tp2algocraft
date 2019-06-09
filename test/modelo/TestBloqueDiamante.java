package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.BloqueDiamante;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

public class TestBloqueDiamante {

    // Tests de integracion de Bloque de Diamante
    @Test
    public void picoDeMetalSeUsaContraDiamanteALaDecimaSeRompe() {

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
