package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.Bloque.BloqueMetal;
import modelo.Bloque.BloquePiedra;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Pico extends Herramienta {

    // Constructor
    public Pico(double fuerza, EstrategiaDeDurabilidad estrategia){
        super(fuerza, estrategia);
        this.bloquesQuePuedoDañar = new ArrayList<Class>(Arrays.asList(BloquePiedra.class, BloqueMetal.class));
    }
}
