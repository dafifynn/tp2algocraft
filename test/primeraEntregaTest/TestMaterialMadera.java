package modeloTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Material.MaterialMadera;
import modelo.Constantes;
import modelo.Herramienta.*;
import modelo.Jugador.Jugador;
import org.junit.Test;

public class TestMaterialMadera {

    // Tests de integracion
    @Test
    public void seGolpeaBloqueDeMaderaConHachaDeMaderaImpactandoAmbos() {

        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = jugador.crearHachaDeMadera();
        MaterialMadera bloqueDeMadera = new MaterialMadera();

        assertEquals(bloqueDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA);

        hachaDeMadera.impactar(bloqueDeMadera);

        assertEquals(bloqueDeMadera.obtenerDurabilidad(),Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA - hachaDeMadera.obtenerFuerza());
    }
}
