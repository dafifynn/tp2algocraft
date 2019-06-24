package modelo.Herramienta;

import modelo.Material.Material;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.List;

public abstract class Herramienta{

    // Atributos
    protected double fuerza;
    protected EstrategiaDeDurabilidad estrategiaDeDurabilidad;
    protected List<Class> bloquesQuePuedoDaniar;


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
    protected boolean esBloqueRompible(Material material){

        return this.bloquesQuePuedoDaniar.contains(material.getClass());
    }

    
    public void impactar(Material material){

        if (this.esBloqueRompible(material)){

            material.esGolpeado(this.fuerza);
        }
        this.estrategiaDeDurabilidad.desgastar();
    }


    public boolean estaRota() {
        return this.estrategiaDeDurabilidad.estaSinDurabilidad();
    }
    
    
     @Override
    public boolean equals (Object o ) {
        Herramienta otraHerramienta = (Herramienta) o;
        if((this.obtenerFuerza() == otraHerramienta.obtenerFuerza())&&
                (this.obtenerDurabilidad() == otraHerramienta.obtenerDurabilidad())&&
                    (this.getClass() == otraHerramienta.getClass() )){
            return true;
        }else{
            return false;
        }

    }

}
