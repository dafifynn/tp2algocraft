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

        this.plantilla[0][0] = new MaterialMadera();
        this.plantilla[0][1] = new MaterialMadera();
        this.plantilla[1][0] = new MaterialMadera();
        this.plantilla[1][1] = new MaterialMadera();
        this.plantilla[2][1] = new MaterialMadera();
    }
}