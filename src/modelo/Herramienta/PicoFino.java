package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueDiamante;
import modelo.Bloque.BloqueMetal;
import modelo.Bloque.BloquePiedra;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PicoFino extends Herramienta {
  
    // Atributos
    private List<Class> bloquesQuePuedoDañar;


    // Constructor
    public PicoFino(double fuerza, EstrategiaDeDurabilidad estrategia) {

        super(fuerza, estrategia);
        this.bloquesQuePuedoDañar = new ArrayList<Class>(
                Arrays.asList(BloquePiedra.class, BloqueMetal.class, BloqueDiamante.class));
    }
  
  
    // Metodos
    public boolean esBloqueRompible(Bloque bloque) {

        return this.bloquesQuePuedoDañar.contains(bloque.getClass());
    }

    private boolean meAfectaImpacto(Bloque bloque) {

        return (bloque.getClass().isAssignableFrom(BloqueDiamante.class));
    }

    @Override
    public void impactar(Bloque bloque){

        if (this.esBloqueRompible(bloque)){
            bloque.esGolpeado(this.fuerza);
        }

        if(this.meAfectaImpacto(bloque)){
            this.estrategiaDeDurabilidad.desgastar();
        }
    }

}
