package modelo.PlantillasDeForja;

import modelo.Constantes;

public class PlantillaEditable extends PlantillaDeForja {

    // Constructor
    public PlantillaEditable() {

        super();
    }


    // Metodo Publico
    public void armarPlantillaEditable(int i, int j, Class C){

        this.plantilla[i][j] = C;
    }

}