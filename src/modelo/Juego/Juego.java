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

        this.imprimirComando();

        while (!this.finDeJuego) {

            String comandoDeEntrada = JOptionPane.showInputDialog(null, "Ingresar");
            this.analizarComando(comandoDeEntrada);
        }


    }


    // Metodo Privado
    private void analizarComando(String comandoDeEntrada) {

        switch (comandoDeEntrada.toUpperCase())
        {

            case Constantes.FIN_DE_JUEGOS:
                {
                    this.finDeJuego = true;
                }

            case Constantes.MOV_ARRIBA:
            {
                DireccionArriba direccion = new DireccionArriba();
                this.jugador.moverse(direccion, this.mapa);
            }

            case Constantes.MOV_ABAJO:
            {
                DireccionAbajo direccion = new DireccionAbajo();
                this.jugador.moverse(direccion, this.mapa);
            }

            case Constantes.MOV_DER:
            {
                DireccionDerecha direccion = new DireccionDerecha();
                this.jugador.moverse(direccion, this.mapa);
            }

            case Constantes.MOV_IZQ:
            {
                DireccionIzquierda direccion = new DireccionIzquierda();
                this.jugador.moverse(direccion, this.mapa);
            }

            case Constantes.GOLP_ARRIBA:
            {
                DireccionArriba direccion = new DireccionArriba();
                this.jugador.impactar(direccion, this.mapa);
            }

            case Constantes.GOLP_ABAJO:
            {
                DireccionAbajo direccion = new DireccionAbajo();
                this.jugador.impactar(direccion, this.mapa);
            }

            case Constantes.GOLP_DER:
            {
                DireccionDerecha direccion = new DireccionDerecha();
                this.jugador.impactar(direccion, this.mapa);
            }

            case Constantes.GOLP_IZQ:
            {
                DireccionIzquierda direccion = new DireccionIzquierda();
                this.jugador.impactar(direccion, this.mapa);
            }

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
