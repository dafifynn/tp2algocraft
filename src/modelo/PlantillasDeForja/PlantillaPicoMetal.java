package modelo.PlantillasDeForja;

import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;

public class PlantillaPicoMetal extends Plantilla {

    // Constructor
    public PlantillaPicoMetal() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialMetal.class;
        this.plantilla[0][1] = MaterialMetal.class;
        this.plantilla[0][2] = MaterialMetal.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }

}
