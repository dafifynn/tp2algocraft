package modelo.EstrategiaDeDurabilidad;

public abstract class EstrategiaDeDurabilidad {
  
    // Atributos
    protected double total;
    protected double constanteDeDesgaste;


    // Constructor
    public EstrategiaDeDurabilidad(double total, double constanteDeDesgaste) {

        this.total = total;
        this.constanteDeDesgaste = constanteDeDesgaste;
    }
  

    // Getters
    public double obtenerValorActual(){

        return this.total;
    }


    // Metodos
    public boolean estaSinDurabilidad () {
        return this.total <= 0;
    }


    public abstract void desgastar();
  
}
