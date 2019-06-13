package segundaEntregaTest;


import modelo.Jugador.Inventario;
import org.junit.jupiter.api.Test;

public class ConstruccionDeHerramientas {

    @Test
    public void construirHachaDeMadera{

        Inventario inventario = new Inventario();
        inventario.guardarMaderaEnGrilla(1,1);
        inventario.guardarMaderaEnGrilla(1,2);
        inventario.guardarMaderaEnGrilla(2,1);
        inventario.guardarMaderaEnGrilla(2,2);
        inventario.guardarMaderaEnGrilla(3,2);

        assertEquals( inventario.obtenerHerramientaDeGrilla();
    }
}
