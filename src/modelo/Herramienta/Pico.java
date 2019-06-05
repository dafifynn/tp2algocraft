package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueMetal;
import modelo.Bloque.BloquePiedra;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

public class Pico extends Herramienta {
  
    // Constructor
    public Pico(double fuerza, EstrategiaDeDurabilidad estrategia) {
        super(fuerza, estrategia);
    }


    // Metodos
    public boolean esBloqueRompible(Bloque bloque){

        return(bloque.getClass().isAssignableFrom(BloquePiedra.class) || bloque.getClass().isAssignableFrom(BloqueMetal.class));

    }

}
