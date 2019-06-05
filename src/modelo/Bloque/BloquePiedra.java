package modelo.Bloque;

import modelo.Constantes;

public class BloquePiedra extends Bloque {

    // Constructor
    public BloquePiedra(){
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_PIEDRA;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA;
    }

}
