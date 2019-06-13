package segundaEntregaTest;


import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Pico;
import modelo.Jugador.Inventario;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionDeHerramientas {

    @Test
    public void construirHachaDeMadera (){

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(1,2);
        inventario.guardarMaderaEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Hacha hachaMadera = (Hacha) inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaMadera.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_MADERA);
        assertEquals(hachaMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_MADERA);
    }

    @Test
    public void construirPicoDeMadera (){

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(1,2);
        inventario.guardarMaderaEnGrilla(1,3);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Pico picoMadera = (Pico) inventario.obtenerHerramientaDeGrilla();

        assertEquals(picoMadera.getClass().isAssignableFrom(Pico.class),true);
        assertEquals(picoMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_PICO_MADERA);
        assertEquals(picoMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_PICO_MADERA);
    }


    @Test
    public void construirHachaDePiedra(){

        Inventario inventario = new Inventario();
        inventario.guardarPiedraEnGrilla(1,1);
        inventario.guardarPiedraEnGrilla(1,2);
        inventario.guardarPiedraEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Hacha hachaDeMadera = (Hacha)inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaDeMadera.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

    @Test
    public void construirPicoDePiedra(){

        Inventario inventario = new Inventario();
        inventario.guardarPiedraEnGrilla(1,1);
        inventario.guardarPiedraEnGrilla(1,2);
        inventario.guardarPiedraEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        Hacha hachaDeMadera = (Hacha)inventario.obtenerHerramientaDeGrilla();

        assertEquals(hachaDeMadera.getClass().isAssignableFrom(Hacha.class),true);
        assertEquals(hachaDeMadera.obtenerDurabilidad(), Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA);
        assertEquals(hachaDeMadera.obtenerFuerza(), Constantes.FUERZA_INICIAL_HACHA_PIEDRA);
    }

}
