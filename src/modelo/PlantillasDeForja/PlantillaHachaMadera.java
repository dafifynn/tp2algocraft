package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.MaterialMadera;


public class PlantillaHachaMadera extends PlantillaDeForja {

    // Constructor
    public PlantillaHachaMadera() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialMadera.class;
        this.plantilla[0][1] = MaterialMadera.class;
        this.plantilla[1][0] = MaterialMadera.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }
}