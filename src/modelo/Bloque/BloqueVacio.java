package modelo.Bloque;

import modelo.Constantes;

public class BloqueVacio extends Bloque {

    // Constructor
    public BloqueVacio(){
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_VACIO;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_VACIO;
    }

}
