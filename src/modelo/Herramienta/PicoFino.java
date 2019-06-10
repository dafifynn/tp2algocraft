package modelo.Herramienta;

import modelo.Material.*;
import modelo.Material.MaterialDiamante;
import modelo.Material.MaterialPiedra;
import modelo.EstrategiaDeDurabilidad.EstrategiaDeDurabilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class PicoFino extends Herramienta {

    // Constructor
    public PicoFino(double fuerza, EstrategiaDeDurabilidad estrategia) {

        super(fuerza, estrategia);
        this.bloquesQuePuedoDaniar = new ArrayList<Class>(
                Arrays.asList(MaterialPiedra.class, MaterialMetal.class, MaterialDiamante.class));
    }


    // Metodos
    private boolean meAfectaImpacto(Material material) {

        return (material.getClass().isAssignableFrom(MaterialDiamante.class));
    }

    @Override
    public void impactar(Material material){

        if (this.esBloqueRompible(material)){

            material.esGolpeado(this.fuerza);
        }

        if(this.meAfectaImpacto(material)){

            this.estrategiaDeDurabilidad.desgastar();
        }
    }

}
