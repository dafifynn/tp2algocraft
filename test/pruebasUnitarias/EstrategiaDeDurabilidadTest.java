package pruebasUnitarias;


import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;
import modelo.EstrategiaDeDurabilidad.Lineal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstrategiaDeDurabilidadTest {

    // Lineal
    @Test
    public void seCreaEstrategiaLinealCorrectamente(){

        double valorInicialDeDurabilidadPrueba = 100.0;
        double constanteDeDesgastePrueba = 10.0;

        EstrategiaDeDurabilidad estrategia = new Lineal(valorInicialDeDurabilidadPrueba, constanteDeDesgastePrueba);

        assertEquals(estrategia.obtenerValorActual(), valorInicialDeDurabilidadPrueba);
    }

    @Test
    public void seDesgastaCorrectamenteEstrategiaLineal(){

        double valorInicialDeDurabilidadPrueba = 100.0;
        double constanteDeDesgastePrueba = 10.0;

        EstrategiaDeDurabilidad estrategia = new Lineal(valorInicialDeDurabilidadPrueba, constanteDeDesgastePrueba);

        estrategia.desgastar();
        assertEquals(estrategia.obtenerValorActual(), valorInicialDeDurabilidadPrueba -
                                                            constanteDeDesgastePrueba);

        estrategia.desgastar();
        assertEquals(estrategia.obtenerValorActual(), valorInicialDeDurabilidadPrueba -
                                                            (2 * constanteDeDesgastePrueba));
    }

}
