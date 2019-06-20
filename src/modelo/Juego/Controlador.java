package modelo.Juego;

import modelo.Constantes;
import modelo.EstrategiaDeDireccion.*;
import modelo.Excepciones.MovimientoInvalidoException;
import modelo.Excepciones.SinHerramientaEquipadaException;
import modelo.Jugador.Jugador;
import modelo.Mapa.Mapa;

import javax.swing.*;

public class Controlador {


    // Metodo Publico
    public boolean analizarComando(String comandoDeEntrada, Mapa mapa, Jugador jugador) {

        switch (comandoDeEntrada.toUpperCase())
        {

            case Constantes.FIN_DE_JUEGO:
            {
                return true;
            }

            case Constantes.MOV_ARRIBA:
            {
                DireccionArriba direccion = new DireccionArriba();
                this.movimiento(direccion, mapa, jugador);
                break;
            }

            case Constantes.MOV_ABAJO:
            {
                DireccionAbajo direccion = new DireccionAbajo();
                this.movimiento(direccion, mapa, jugador);
                break;
            }

            case Constantes.MOV_DER:
            {
                DireccionDerecha direccion = new DireccionDerecha();
                this.movimiento(direccion, mapa, jugador);
                break;
            }

            case Constantes.MOV_IZQ:
            {
                DireccionIzquierda direccion = new DireccionIzquierda();
                this.movimiento(direccion, mapa, jugador);
                break;
            }

            case Constantes.GOLP_ARRIBA:
            {
                DireccionArriba direccion = new DireccionArriba();
                this.golpearMaterial(direccion, mapa, jugador);
                break;
            }

            case Constantes.GOLP_ABAJO:
            {
                DireccionAbajo direccion = new DireccionAbajo();
                this.golpearMaterial(direccion, mapa, jugador);
                break;
            }

            case Constantes.GOLP_DER:
            {
                DireccionDerecha direccion = new DireccionDerecha();
                this.golpearMaterial(direccion, mapa, jugador);
                break;
            }

            case Constantes.GOLP_IZQ:
            {
                DireccionIzquierda direccion = new DireccionIzquierda();
                this.golpearMaterial(direccion, mapa, jugador);
                break;
            }

        }
        return false;
    }


    // Metodo Privado
    private void movimiento(EstrategiaDeDireccion direccion, Mapa mapa, Jugador jugador) {

        try{
            jugador.moverse(direccion, mapa);

        }catch (MovimientoInvalidoException e){

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Movimiento no posible");
        }
    }

    private void golpearMaterial(EstrategiaDeDireccion direccion, Mapa mapa, Jugador jugador) {

        try{
            jugador.impactar(direccion, mapa);

        }catch (SinHerramientaEquipadaException e){

            e.printStackTrace();
            JOptionPane.showInputDialog("No posees herramienta");
        }
    }
}
