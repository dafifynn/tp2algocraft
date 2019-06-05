package modelo.Bloque;

import modelo.Constantes;

public class BloqueDiamante extends Bloque {

    // Constructor
    public BloqueDiamante(){
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_DIAMANTE;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_DIAMANTE;
    }

}
