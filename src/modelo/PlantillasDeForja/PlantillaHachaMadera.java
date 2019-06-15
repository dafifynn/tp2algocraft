package modelo.PlantillasDeForja;


import modelo.Material.MaterialMadera;

public class PlantillaHachaMadera extends Plantilla{

    // Constructor
    public PlantillaHachaMadera() {

        this.plantilla = new Class[3][3];
        this.inicializarPlantilla();
        this.armarPlantilla();
    }


    // Metodo
    private void armarPlantilla() {

        this.plantilla[0][0] = MaterialMadera.class;
        this.plantilla[0][1] = MaterialMadera.class;
        this.plantilla[1][0] = MaterialMadera.class;
        this.plantilla[1][1] = MaterialMadera.class;
        this.plantilla[2][1] = MaterialMadera.class;
    }

}
