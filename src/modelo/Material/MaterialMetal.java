package modelo.Material;

import modelo.Constantes;

public class MaterialMetal extends Material {

    // Constructor
    public MaterialMetal(){

        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_METAL;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL;
    }

    @Override
    public int hashCode() {
        int primo = 31;
        return primo * (int) Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL;
    }
}
