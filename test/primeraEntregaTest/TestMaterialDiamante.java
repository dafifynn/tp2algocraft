package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Material.MaterialDiamante;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestMaterialDiamante {

    // Tests de integracion de Material de Diamante
    @Test
    public void picoDeMetalSeUsaContraDiamanteALaDecimaSeRompe() {

        Jugador jugador = new Jugador();
        Pico picoDeMetal = jugador.crearPicoDeMetal();
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        for(int i = 0; i < 9 ; i++){
            picoDeMetal.impactar(bloqueDeDiamante);
            assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        }

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),0.0);
    }

}
