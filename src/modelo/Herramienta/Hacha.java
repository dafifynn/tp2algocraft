package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueMadera;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

public class Hacha extends Herramienta {
  
    // Constructor
    public Hacha(double fuerza, EstrategiaDeDurabilidad estrategia) {
        super(fuerza, estrategia);
    }
    
    
    // Metodos
    public boolean esBloqueRompible(Bloque bloque){

        return (bloque.getClass().isAssignableFrom(BloqueMadera.class));
    }

}
