package modelo.PlantillasDeForja;


import modelo.Material.MaterialMadera;

public class PlantillaHachaMadera extends Plantilla{

    // Constructor
    public PlantillaHachaMadera() {

        this.plantilla = new Casilla[3][3];
        this.inicializarPlantilla();
        this.armarPlantilla();
    }

    private void inicializarPlantilla() {

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                this.plantilla[i][j] = new Casilla();
            }
        }
    }

    private void armarPlantilla() {

        this.plantilla[0][0].asignarElemento(MaterialMadera.class);
        this.plantilla[0][1].asignarElemento(MaterialMadera.class);
        this.plantilla[1][0].asignarElemento(MaterialMadera.class);
        this.plantilla[1][1].asignarElemento(MaterialMadera.class);
        this.plantilla[2][1].asignarElemento(MaterialMadera.class);
    }

}
