package test;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Constantes;
import modelo.Bloque.BloqueMadera;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;

public class TestBloqueMadera {

    // Tests de integracion
    @Test
    public void seGolpeaBloqueDeMaderaConHachaDeMaderaImpactandoAmbos() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        BloqueMadera bloqueDeMadera = new BloqueMadera();

        assertEquals(bloqueDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA);

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(bloqueDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA - hachaDeMadera.obtenerFuerza());
    }
}
