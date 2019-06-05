package modelo.EstrategiaDeDurabilidad;

public class NUsos extends EstrategiaDeDurabilidad {

    // Atributos
    private double cantDeUsos;

    // Constructor
    public NUsos (double total, double constanteDeDesgaste, double cantDeUsos) {
        super(total, constanteDeDesgaste);
        this.cantDeUsos = cantDeUsos;
    }
  
    // Metodos
    private boolean usosAgotados() {

        return this.cantDeUsos == 0;
    }

    private void reducirUsos() {

        this.cantDeUsos--;
    }

    public void desgastar () {

        this.reducirUsos();

        if (this.usosAgotados()) {

            this.total = 0;
        }
    }
    
}
