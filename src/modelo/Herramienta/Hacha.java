package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueMadera;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Hacha extends Herramienta {

    // Constructor
    public Hacha(double fuerza, EstrategiaDeDurabilidad estrategia){

        super(fuerza, estrategia);
        this.bloquesQuePuedoDañar = new ArrayList<Class>(Arrays.asList(BloqueMadera.class));
    }
}
