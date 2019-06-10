package modelo.Material;

import modelo.Constantes;

public class MaterialDiamante extends Material {

    // Constructor
    public MaterialDiamante(){

        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_DIAMANTE;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_DIAMANTE;
    }

}
