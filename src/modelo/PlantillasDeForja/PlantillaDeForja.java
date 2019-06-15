package modelo.PlantillasDeForja;


public abstract class PlantillaDeForja {

    // Atributo
    protected Class[][] plantilla;


    // Constructor
    public PlantillaDeForja(){

        this.plantilla = new Class[3][3];
        this.inicializarPlantilla();
    }


    // Metodo Privado
    protected void inicializarPlantilla() {

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                this.plantilla[i][j] = null;
            }
        }
    }

    private boolean sonPlantillasIguales(Class[][] plantilla) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (plantilla[i][j] != this.plantilla[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


    // Metodo Publico
    @Override
    public boolean equals (Object o) {

        if(!(o instanceof PlantillaDeForja)) { return false;}

        PlantillaDeForja otraPlantilla = (PlantillaDeForja) o;
        return otraPlantilla.sonPlantillasIguales(this.plantilla);
    }

}