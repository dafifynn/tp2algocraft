package modelo.Bloque;

public abstract class Bloque {

    //atributos
    protected double durabilidad;

    protected double resistencia;


    // Metodos
    public double obtenerDurabilidad(){
        return this.durabilidad;
    }

    public void esGolpeado(double danio){

        if(this.danioAfectaAResistencia(danio)){
            this.reducirDurabilidad(danio);
        }
    }

    private void reducirDurabilidad(double danio){

        this.durabilidad -= danio;
    }

    private boolean danioAfectaAResistencia(double danio){

        return danio >= this.resistencia;
    }
    
}
