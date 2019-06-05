package modelo.Bloque;

import modelo.Constantes;

public class BloqueMetal extends Bloque {

    // Constructor
    public BloqueMetal(){
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_METAL;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL;
    }

}
