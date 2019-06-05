package modelo.EstrategiaDeDurabilidad;

public class Dinamica extends EstrategiaDeDurabilidad {

    // Constructor
    public Dinamica(double total, double constanteDeDesgaste) {

        super(total, constanteDeDesgaste);
    }


    // Metodos
    public void desgastar() {

        this.total -= (this.constanteDeDesgaste * this.total);
    }
  
}
