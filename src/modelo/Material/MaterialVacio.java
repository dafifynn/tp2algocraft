package modelo.Material;

import modelo.Constantes;

public class MaterialVacio extends Material {

    public MaterialVacio() {

        this.durabilidad = Constantes.DURABILIDAD_INICIAL_BLOQUE_VACIO;
        this.resistencia = Constantes.RESISTENCIA_INICIAL_BLOQUE_VACIO;
    }
}
