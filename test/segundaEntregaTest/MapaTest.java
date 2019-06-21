package segundaEntregaTest;

import modelo.Excepciones.CoordenadaOcupadaException;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.Material;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapaTest {

    @Test
    public void colocarUnMaterialAlMapaVacioInicialmenteEnLaCoordenadaX0Y1 () {
        Material madera = new MaterialMadera();

        // Se verifica que esa coordenada esta vacia.
        Mapa mapa = new Mapa();
        Coordenada coordenada = new Coordenada(0,1);

        assertFalse(mapa.hayMaterialEnCoordenada(coordenada));

        // Se agrega el material al mapa.
        mapa.agregarMaterial(coordenada, madera);
        assertTrue(mapa.hayMaterialEnCoordenada(coordenada));
    }

    @Test
    public void colocarMaterialDeMaderaEnLaMismaCoordenadaRetornaCoordenadaOcupadaException () {
        Mapa mapa = new Mapa();
        Coordenada coordenada = new Coordenada(0,1);

        // Se agrega el material al mapa.
        mapa.agregarMaterial(coordenada, new MaterialMadera());

        assertThrows(CoordenadaOcupadaException.class, () -> {mapa.agregarMaterial(coordenada, new MaterialMadera());});
    }

    @Test
    public void colocarMaterialDistintoEnLaMismaCoordenadaRetornaCoordenadaOcupadaException () {
        Mapa mapa = new Mapa();
        Coordenada coordenada = new Coordenada(0,1);

        // Se agrega el material al mapa.
        mapa.agregarMaterial(coordenada, new MaterialMadera());

        assertThrows(CoordenadaOcupadaException.class, () -> {mapa.agregarMaterial(coordenada, new MaterialMetal());});
    }
}
