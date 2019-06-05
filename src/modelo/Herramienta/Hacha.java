package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueMadera;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

public class Hacha extends Herramienta {
  
    // Atributos
    private List<Class> bloquesQuePuedoDañar;


    // Constructor
    public Hacha(double fuerza, EstrategiaDeDurabilidad estrategia){

        super(fuerza, estrategia);
        this.bloquesQuePuedoDañar = new ArrayList<Class>(Arrays.asList(BloqueMadera.class));
    }


    // Metodos
    public boolean esBloqueRompible(Bloque bloque){

        return this.bloquesQuePuedoDañar.contains(bloque.getClass());
    }

}
