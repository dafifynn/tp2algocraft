package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialPiedra;

public class PlantillaHachaPiedra extends PlantillaDeForja {

    // Constructor
    public PlantillaHachaPiedra() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialPiedra.class;
        this.plantilla[0][1] = MaterialPiedra.class;
        this.plantilla[1][0] = MaterialPiedra.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }

    @Override
    public int hashCode(){

        final int prime = (int) (31 * (Constantes.DURABILIDAD_INICIAL_HACHA_PIEDRA + Constantes.FUERZA_INICIAL_HACHA_PIEDRA));
        int result = 1;
        result = prime * result + (Constantes.HACHA_DE_PIEDRA.hashCode());
        return result;
    }

}