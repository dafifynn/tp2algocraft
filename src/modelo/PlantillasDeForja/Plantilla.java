package modelo.PlantillasDeForja;


public abstract class Plantilla{

    // Atributo
    protected Casilla[][] plantilla;


    // Metodo
    public boolean compararPlantilla(Plantilla otraPlantilla){

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                if (otraPlantilla.obtenerElemento(i, j) != this.plantilla[i][j].verElemento()){
                    return false;
                }
            }
        }

        return true;
    }

    public Class obtenerElemento(int i, int j) {

        return this.plantilla[i][j].verElemento();
    }

}
