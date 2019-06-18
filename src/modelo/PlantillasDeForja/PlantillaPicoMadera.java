package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.MaterialMadera;

public class PlantillaPicoMadera extends PlantillaDeForja {

    // Constructor
    public PlantillaPicoMadera() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialMadera.class;
        this.plantilla[0][1] = MaterialMadera.class;
        this.plantilla[0][2] = MaterialMadera.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }
}