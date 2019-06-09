package modelo.Herramienta;

import modelo.Material.MaterialMadera;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Hacha extends Herramienta {

    // Constructor
    public Hacha(double fuerza, EstrategiaDeDurabilidad estrategia){

        super(fuerza, estrategia);
        this.bloquesQuePuedoDaniar = new ArrayList<Class>(Arrays.asList(MaterialMadera.class));
    }
}
