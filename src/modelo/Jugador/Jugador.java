package modelo.Jugador;

import modelo.Herramienta.Herramienta;


public class Jugador {

    // Atributo
    //private Inventario inventario;
    private Herramienta herramientaEquipada;


    // Constructor
    public Jugador(){

        //this.inventario = new Inventario();
        //this.herramientaEquipada = this.inventario.equipar(0);
    }


    // Metodos Privados
    private void guardarEnInventario(){

        //this.inventario.guardar(this.herramientaEquipada);
    }

    private boolean tengoHerramientaEquipada(){

        return this.herramientaEquipada.getClass().isAssignableFrom(Herramienta.class);
    }


    // Metodos Publicos
    public void moverse(){

    }

    public void golpearMaterial(){

    }

    public void equipar(int posicion){

        if (this.tengoHerramientaEquipada()){
            this.guardarEnInventario();
        }

        //this.herramientaEquipada = this.inventario.extraerHerramienta(posicion);
    }

    public void abrirInventario(){

        //this.inventario.dibujar();
    }

}
