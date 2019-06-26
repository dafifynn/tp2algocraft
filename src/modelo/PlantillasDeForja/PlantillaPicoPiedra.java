package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialPiedra;

public class PlantillaPicoPiedra extends PlantillaDeForja {

    // Constructor
    public PlantillaPicoPiedra() {

        super();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = new MaterialPiedra();
        this.plantilla[0][1] = new MaterialPiedra();
        this.plantilla[0][2] = new MaterialPiedra();
        this.plantilla[1][1] = new MaterialMadera();
        this.plantilla[2][1] = new MaterialMadera();
    }
}