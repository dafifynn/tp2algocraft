package modelo.EstrategiaDeDurabilidad;

public class NUsos extends EstrategiaDeDurabilidad {

    // Atributos
    private double cantDeUsos;

    // Constructor
    public NUsos (double total, double constanteDeDesgaste, double cantDeUsos) {
        super(total, constanteDeDesgaste);
        this.cantDeUsos = cantDeUsos;
    }
  
}
