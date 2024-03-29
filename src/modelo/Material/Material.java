package modelo.Material;

public abstract class Material {

    // Atributos
    protected double durabilidad;
    protected double resistencia;


    // Metodos
    public double obtenerDurabilidad(){
        return this.durabilidad;
    }


    public boolean estaRoto() { return this.durabilidad <= 0; }


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

    @Override
    public boolean equals(Object o) {

        if(!(o instanceof Material)) { return false;}

        Material otroMaterial = (Material) o;
        return otroMaterial.getClass() == this.getClass();
    }
}
