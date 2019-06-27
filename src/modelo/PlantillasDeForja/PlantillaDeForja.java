package modelo.PlantillasDeForja;


import modelo.Constantes;
import modelo.Material.*;

public abstract class PlantillaDeForja {

    // Atributo
    protected Object[][] plantilla;

    // Constructor
    public PlantillaDeForja(){

        this.plantilla = new Object[3][3];
        this.inicializarPlantilla();
    }


    // Metodo Privado
    protected void inicializarPlantilla() {

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                this.plantilla[i][j] = new MaterialVacio();
            }
        }
    }

    private boolean sonPlantillasIguales(Object[][] plantilla) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (!plantilla[i][j].equals(this.plantilla[i][j])) {
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

    @Override
    public int hashCode() {
        int primo = 31;
        int resultado = 1;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (plantilla[i][j].equals(new MaterialMadera())) {
                    resultado += Constantes.DURABILIDAD_INICIAL_BLOQUE_MADERA;
                }
                else if (plantilla[i][j].equals(new MaterialPiedra())) {
                    resultado += Constantes.DURABILIDAD_INICIAL_BLOQUE_PIEDRA;
                }
                else if (plantilla[i][j].equals(new MaterialMetal())) {
                    resultado += Constantes.DURABILIDAD_INICIAL_BLOQUE_METAL;
                }
                else if (plantilla[i][j].equals(new MaterialDiamante())) {
                    resultado += Constantes.DURABILIDAD_INICIAL_BLOQUE_DIAMANTE;
                }
            }
        }

        return primo * resultado;
    }
}