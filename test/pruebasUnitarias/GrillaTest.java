package pruebasUnitarias;

import modelo.Grilla.Grilla;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class GrillaTest {

    @Test
    public void crearGrillaVacia() {

//        Grilla<String> grillaDeCadenas = new Grilla<>(4,4);
//
//        assertEquals(grillaDeCadenas.filas(),4);
//        assertEquals(grillaDeCadenas.columnas(), 4);
//
//        for(int i = 1; i <= 4; i++) {
//            for(int j = 1; j <= 4; j++) {
//                assertEquals(grillaDeCadenas.obtener(i,j).estaVacio(),true);
//            }
//        }
    }

    @Test
    public void obtenerCantidadFilas() {

        Grilla<String> grillaDeCadenas = new Grilla<>(4,4);

        assertEquals(grillaDeCadenas.filas(),4);
    }

    @Test
    public void obtenerCantidadColumnas() {

        Grilla<String> grillaDeCadenas = new Grilla<>(4,4);

        assertEquals(grillaDeCadenas.columnas(),4);
    }

    @Test
    public void agregarObtenerElemento() {

//        //se prueban los dos metodos en el mismo test para evitar usar MockData
//
//        Grilla<String> grillaDeLetras = new Grilla<>(5,5);
//        String letraAsignada = "A";
//
//        grillaDeLetras.agregar(letraAsignada,1,1);
//        String letraObtenida = grillaDeLetras.obtener(1,1).verElemento();
//
//        assertEquals(letraObtenida,letraAsignada);
    }

    @Test
    public void eliminarElemento() {

//        Grilla<String> grillaDePalabras = new Grilla<>(10,10);
//        String palabraAgregada = "holaMundo";
//        grillaDePalabras.agregar(palabraAgregada,2,2);
//
//        grillaDePalabras.eliminar(2,2);
//
//        assertEquals(grillaDePalabras.obtener(2,2).estaVacio(),true);
    }
}
