package modelo.Herramienta;

import modelo.Bloque.Bloque;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.List;

public abstract class Herramienta{

    // Atributos
    protected double fuerza;

    protected EstrategiaDeDurabilidad estrategiaDeDurabilidad;

    protected List<Class> bloquesQuePuedoDañar;


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


    // Metodos
    protected boolean esBloqueRompible(Bloque bloque){

        return this.bloquesQuePuedoDañar.contains(bloque.getClass());
    }

    public void impactar(Bloque bloque){

        if (this.esBloqueRompible(bloque)){
            bloque.esGolpeado(this.fuerza);
        }
        this.estrategiaDeDurabilidad.desgastar();
    }
}
