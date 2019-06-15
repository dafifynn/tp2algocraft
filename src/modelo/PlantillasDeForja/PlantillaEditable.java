package modelo.PlantillasDeForja;

public class PlantillaEditable extends Plantilla {

    // Constructor
    public PlantillaEditable() {

        super();
    }


    // Metodo Publico
    public void armarPlantillaEditable(int i, int j, Class C){

        this.plantilla[i][j] = C;
    }

}