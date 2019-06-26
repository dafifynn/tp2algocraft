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

        this.plantilla[0][0] = new MaterialMetal();
        this.plantilla[0][1] = new MaterialMetal();
        this.plantilla[1][0] = new MaterialMetal();
        this.plantilla[1][1] = new MaterialMadera();
        this.plantilla[2][1] = new MaterialMadera();
    }
}