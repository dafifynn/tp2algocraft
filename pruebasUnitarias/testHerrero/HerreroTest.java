package testHerrero;

import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Jugador.Herrero;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HerreroTest {

    @Test
    public void prueba(){
        Herrero herrero = new Herrero();

        Hacha hachaDeMadera = (Hacha) herrero.construirHerramienta(Constantes.HACHA_DE_MADERA);

        assertEquals(hachaDeMadera.getClass(), Hacha.class);
    }
}