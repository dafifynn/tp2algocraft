package modelo.Herramienta;

import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Pico extends Herramienta {

    // Constructor
    public Pico(double fuerza, EstrategiaDeDurabilidad estrategia){

        super(fuerza, estrategia);
        this.bloquesQuePuedoDaniar = new ArrayList<Class>(Arrays.asList(MaterialPiedra.class, MaterialMetal.class));
    }

}
