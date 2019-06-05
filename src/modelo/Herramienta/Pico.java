package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueMetal;
import modelo.Bloque.BloquePiedra;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

public class Pico extends Herramienta {
  
    // Atributos
    private List<Class> bloquesQuePuedoDañar;


    // Constructor
    public Pico(double fuerza, EstrategiaDeDurabilidad estrategia){
        super(fuerza, estrategia);
        this.bloquesQuePuedoDañar = new ArrayList<Class>(Arrays.asList(BloquePiedra.class, BloqueMetal.class));
    }


    // Metodos
    public boolean esBloqueRompible(Bloque bloque){

        return this.bloquesQuePuedoDañar.contains(bloque.getClass());
    }

}
