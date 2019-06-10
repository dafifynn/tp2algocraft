package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Material.MaterialPiedra;
import modelo.Constantes;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestMaterialPiedra {

    // Tests de integracion de Material de Piedra
    @Test
    public void seGolpeaBloqueDePiedraConHachaDeMetalImpactandoSoloLaHerramienta() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        MaterialPiedra bloqueDePiedra = new MaterialPiedra();

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);
    }
}
