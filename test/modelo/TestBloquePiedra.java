package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.BloquePiedra;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

public class TestBloquePiedra {

    // Tests de integracion de Bloque de Piedra
    @Test
    public void seGolpeaBloqueDePiedraConHachaDeMetalImpactandoSoloLaHerramienta() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMetal = jugador.crearHachaDeMetal();
        BloquePiedra bloqueDePiedra = new BloquePiedra();

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);

        hachaDeMetal.impactar(bloqueDePiedra);

        assertEquals(bloqueDePiedra.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA);
    }
}
