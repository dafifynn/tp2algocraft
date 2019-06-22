package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;

public class PlantillaPicoFino extends PlantillaDeForja {


    // Constructor
    public PlantillaPicoFino() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialMetal.class;
        this.plantilla[0][1] = MaterialMetal.class;
        this.plantilla[0][2] = MaterialMetal.class;
        this.plantilla[1][0] = MaterialPiedra.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }
}