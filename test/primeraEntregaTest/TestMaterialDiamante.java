package primeraEntregaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Jugador.Forja;
import modelo.Material.MaterialDiamante;
import modelo.Herramienta.*;
import org.junit.jupiter.api.Test;

public class TestMaterialDiamante {

    // Tests de integracion de Material de Diamante
    @Test
    public void picoDeMetalSeUsaContraDiamanteALaDecimaSeRompe() {

        Forja forja = new Forja();
        Herramienta picoDeMetal = forja.construirHerramienta(Constantes.PICO_DE_METAL);
        MaterialDiamante bloqueDeDiamante = new MaterialDiamante();

        for(int i = 0; i < 9 ; i++){
            picoDeMetal.impactar(bloqueDeDiamante);
            assertEquals(picoDeMetal.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_METAL);
        }

        picoDeMetal.impactar(bloqueDeDiamante);

        assertEquals(picoDeMetal.obtenerDurabilidad(),0.0);
    }

}
