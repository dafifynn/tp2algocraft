package modelo.Material;

import modelo.Constantes;

public class MaterialPiedra extends Material {

    // Constructor
    public MaterialPiedra(){

        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_PIEDRA;
        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA;
    }

    @Override
    public int hashCode() {
        int primo = 31;
        return primo * (int) Constantes.DURABILIDAD_INICIAL_BLOQUE_DIAMANTE;
    }
}
