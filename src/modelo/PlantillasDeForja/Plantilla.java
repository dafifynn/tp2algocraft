package modelo.PlantillasDeForja;


public abstract class Plantilla{

    // Atributo
    protected Class[][] plantilla;


    // Constructor
    public Plantilla(){

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

        if(!(o instanceof Plantilla)) { return false;}

        Plantilla otraPlantilla = (Plantilla) o;
        return otraPlantilla.sonPlantillasIguales(this.plantilla);
    }

}