package pruebasUnitarias;

import modelo.Grilla.Grilla;
import modelo.Juego.Artista;
import org.junit.Test;

public class ArtistaTest {

    @Test
    public void dibujarMundo() {

        Grilla grillaVacia = new Grilla(4,4);

        Artista.dibujarMundo(grillaVacia);

        //Se debera imprimir por pantalla una grilla de 4x4 con el caracter de vacio
    }
}
