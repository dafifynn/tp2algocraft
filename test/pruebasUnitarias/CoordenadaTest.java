package pruebasUnitarias;

import modelo.Constantes;
import modelo.Excepciones.CoordenadaFueraDelLimiteException;
import modelo.Mapa.Coordenada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoordenadaTest {
    @Test
    public void seCreanDosCoordenadasConLosMismosParametrosYAlCompararConEqualsRetornaTrue () {
        Coordenada coordenada1 = new Coordenada(1,2);
        Coordenada coordenada2 = new Coordenada(1,2);

        assertEquals(true, coordenada1.equals(coordenada2));
    }

    @Test
    public void seCreanDosCoordenadasConDiferentesParametrosYAlCompararConEqualsRetornaFalse () {
        Coordenada coordenada1 = new Coordenada(1,2);
        Coordenada coordenada2 = new Coordenada(0,4);

        assertEquals(false, coordenada1.equals(coordenada2));
    }

    @Test
    public void seCreanDosCoordenadasConLosMismosParametrosYTienenElMismosHashCode () {
        Coordenada coordenada1 = new Coordenada(1,2);
        Coordenada coordenada2 = new Coordenada(1,2);

        assertEquals(true, coordenada1.hashCode() == coordenada2.hashCode());
    }

    @Test
    public void seCreanDosCoordenadasConDiferentesParametrosYTienenDistintosHashCode () {
        Coordenada coordenada1 = new Coordenada(0,0);
        Coordenada coordenada2 = new Coordenada(1,2);

        assertEquals(true, coordenada1.hashCode() != coordenada2.hashCode());
    }

    @Test
    public void seCreaOtraCoordenadaAPartirDeLaMismaYSeVerificaQueEsDistintaDeLaOriginal() {
        Coordenada coordenada = new Coordenada(0,0);
        Coordenada coordenadaSiguiente = coordenada.crearCoordenadaAdyacente(1,0);

        assertEquals(false, coordenada.equals(coordenadaSiguiente));
    }

    @Test
    public void crearCoordenadaFueraDelLimiteDelMapaProduceError() {
        assertThrows(CoordenadaFueraDelLimiteException.class, () -> {new Coordenada(Constantes.MAPA_FILAS_DEFECTO, Constantes.MAPA_COLUMNAS_DEFECTO);});

    }
}
