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
}