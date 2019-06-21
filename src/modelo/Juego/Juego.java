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

            String comandoDeEntrada = JOptionPane.showInputDialog(null, "INGRESAR");
            this.finDeJuego = controlador.analizarComando(comandoDeEntrada, this.mapa, this.jugador);
        }

        JOptionPane.showMessageDialog(null, "ADIOS POLLO XD");
    }

 //getters

    public Mapa obtenerMapa(){
        return this.mapa;
    }

    public Jugador obtenerJugador(){
        return this.jugador;
    }

    // Imprimir Comandos
    private void imprimirComando() {

        System.out.println("COMANDOS:");
        System.out.println(" - MOVIMIENTO");
        mostrarDireccion(Constantes.MOV_ARRIBA, Constantes.MOV_ABAJO, Constantes.MOV_IZQ, Constantes.MOV_DER);
        System.out.println(" ");
        System.out.println(" - GOLPEAR BLOQUE MATERIAL");
        mostrarDireccion(Constantes.GOLP_ARRIBA, Constantes.GOLP_ABAJO, Constantes.GOLP_IZQ, Constantes.GOLP_DER);
        System.out.println(" ");
        System.out.println((" - TERMINAR JUEGO:  T"));
        System.out.println(" ");
    }

    private void mostrarDireccion(String Arriba, String Abajo, String Izq, String Der) {

        System.out.println("       * ARRIBA =  " + Arriba);
        System.out.println("       * ABAJO =  " + Abajo);
        System.out.println("       * DERECHA =  " + Der);
        System.out.println("       * IZQUIERDA =  " + Izq);
    }

}
