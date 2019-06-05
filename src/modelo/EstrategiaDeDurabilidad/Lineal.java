package modelo.EstrategiaDeDurabilidad;

public class Lineal extends EstrategiaDeDurabilidad {

    // Constructor
    public Lineal(double total, double constanteDeDesgaste) {

        super(total, constanteDeDesgaste);
    }


    // Metodos
    public void desgastar(){

        this.total -= this.constanteDeDesgaste;
    }
  
}
