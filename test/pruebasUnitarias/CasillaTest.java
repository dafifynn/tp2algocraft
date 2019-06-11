package pruebasUnitarias;

import modelo.Grilla.Casilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CasillaTest {

    @Test
    public void seCreaCasillaVacia(){

        Casilla<Object> casillaObjeto = new Casilla<>();

        assertEquals(casillaObjeto.estaVacio(),true);
    }

    @Test
    public void seCreaCasillaConElemento() {

        Casilla<String> casillaCadena = new Casilla<>("A");

        assertEquals(casillaCadena.estaVacio(),false);
    }

    @Test
    public void seRemueveElementoDeCasilla() {

        Casilla<Integer> casillaEntero = new Casilla<>(1);

        assertEquals(casillaEntero.estaVacio(),false);

        casillaEntero.remover();

        assertEquals(casillaEntero.estaVacio(),true);
    }

    @Test
    public void seObtieneElementoDeCasilla() {

        Double insertado = 2.2;
        Casilla<Double> casillaNumero = new Casilla<>(insertado);

        Double recuperado = casillaNumero.elemento();

        assertEquals(recuperado, insertado);
    }

    @Test
    public void seAsignaElementoACasilla() {

        String insertado = "soyUnString";
        Casilla<String> casillaCadena = new Casilla<>();

        casillaCadena.asignar(insertado);

        assertEquals(casillaCadena.estaVacio(),false);
        assertEquals(casillaCadena.elemento(),insertado);
    }
}
