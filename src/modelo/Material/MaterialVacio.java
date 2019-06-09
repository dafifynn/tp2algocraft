package modelo.Material;

import modelo.Constantes;

public class MaterialVacio extends Material {

    // Constructor
    public MaterialVacio(){
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_VACIO;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_VACIO;
    }

}
