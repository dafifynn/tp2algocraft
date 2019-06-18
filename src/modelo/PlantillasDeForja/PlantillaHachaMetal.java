package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;

public class PlantillaHachaMetal extends PlantillaDeForja {

    // Constructor
    public PlantillaHachaMetal() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialMetal.class;
        this.plantilla[0][1] = MaterialMetal.class;
        this.plantilla[1][0] = MaterialMetal.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }
}