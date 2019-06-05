package modelo.Bloque;

import modelo.Constantes;

public class BloqueMadera extends Bloque {

    // Constructor
    public BloqueMadera(){
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_MADERA;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA;
    }

}
