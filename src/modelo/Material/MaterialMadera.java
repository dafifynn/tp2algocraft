package modelo.Material;

import modelo.Constantes;

public class MaterialMadera extends Material {

    // Constructor
    public MaterialMadera(){

        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_MADERA;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA;
    }


    @Override
    public int hashCode() {
        int primo = 31;
        return primo * (int) Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA;
    }
}
