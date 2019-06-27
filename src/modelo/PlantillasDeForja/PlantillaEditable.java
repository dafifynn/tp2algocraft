package modelo.PlantillasDeForja;

import modelo.Constantes;
import modelo.Material.Material;

public class PlantillaEditable extends PlantillaDeForja {

    // Atributos
    private int cantDeElementosEnPlantilla;

    // Constructor
    public PlantillaEditable() {

        super();
        this.cantDeElementosEnPlantilla = 0;
    }


    // Metodo Publico
    public void armarPlantillaEditable(int i, int j, Material M){

        this.plantilla[i][j] = M;
        this.cantDeElementosEnPlantilla++;
    }

    public int getCantDeElementosEnPlantilla() {

        return this.cantDeElementosEnPlantilla;
    }

}