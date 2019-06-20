package modelo.Juego;

import modelo.Constantes;
import modelo.EstrategiaDeDireccion.DireccionAbajo;
import modelo.EstrategiaDeDireccion.DireccionArriba;
import modelo.EstrategiaDeDireccion.DireccionDerecha;
import modelo.EstrategiaDeDireccion.DireccionIzquierda;
import modelo.Jugador.Jugador;
import modelo.Mapa.Mapa;

import javax.swing.*;


public class Juego {

    // Atributos
    private Mapa  mapa;
    private Jugador jugador;
    private boolean finDeJuego;


    // Constructor
    public Juego() {
        this.mapa = new Mapa();
        this.jugador = new Jugador();
        this.finDeJuego = false;

        Artista artista = new Artista();
        artista.crearTerreno(this.mapa);

    }


    // Metodos Publicos
    public void iniciarPartida() {

        Controlador controlador = new Controlador();
        this.imprimirComando();

        while (!this.finDeJuego) {

            String comandoDeEntrada = JOptionPane.showInputDialog(null, "Ingresar");
            this.finDeJuego = controlador.analizarComando(comandoDeEntrada, this.mapa, this.jugador);
        }


    }


    // Imprimir Comandos
    private void imprimirComando() {

        System.out.println("Comando:");
        System.out.println(" - Movimiento");
        mostrarDireccion(Constantes.MOV_ARRIBA, Constantes.MOV_ABAJO, Constantes.MOV_IZQ, Constantes.MOV_DER);
        System.out.println(" ");
        System.out.println(" - Golpear Bloque Material");
        mostrarDireccion(Constantes.GOLP_ARRIBA, Constantes.GOLP_ABAJO, Constantes.GOLP_IZQ, Constantes.GOLP_DER);
        System.out.println(" ");
        System.out.println((" - Terminar juego:  T"));
        System.out.println(" ");
    }

    private void mostrarDireccion(String Arriba, String Abajo, String Izq, String Der) {

        System.out.println("       * Arriba =  " + Arriba);
        System.out.println("       * Abajo =  " + Abajo);
        System.out.println("       * Derecha =  " + Der);
        System.out.println("       * Izquierda =  " + Izq);
    }

}
