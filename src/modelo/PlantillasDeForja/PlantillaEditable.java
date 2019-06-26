package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.Material;

public class PlantillaEditable extends PlantillaDeForja {

    // Constructor
    public PlantillaEditable() {

        super();
    }


    // Metodo Publico
    public void armarPlantillaEditable(int i, int j, Material M){

        this.plantilla[i][j] = M;
    }

}