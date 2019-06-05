package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

public abstract class Herramienta{
  
    // Atributos
    protected double fuerza;

    protected EstrategiaDeDurabilidad estrategiaDeDurabilidad;


    // Constructor
    public Herramienta(double fuerza, EstrategiaDeDurabilidad estrategia) {

        this.fuerza = fuerza;
        this.estrategiaDeDurabilidad = estrategia;
    }


    // Getters
    public double obtenerFuerza() {

        return this.fuerza;
    }

    public double obtenerDurabilidad() {

        return this.estrategiaDeDurabilidad.obtenerValorActual();
    }

}
