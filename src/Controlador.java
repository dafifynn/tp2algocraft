import modelo.Juego.Juego;

import java.util.HashMap;
import java.util.Scanner;


public class Controlador {

    public static void main(String[] args) {

        Juego juuego = new Juego();
        boolean finDeJuego = false;
        HashMap<String, Integer> hashDeComando = new HashMap<>();

        while (! finDeJuego) {
            Scanner entrada = new Scanner(System.in);
            imprimirComando();

            String comando = entrada.nextLine();
        }
    }

    private static void imprimirComando() {

        System.out.println("Comando:");
        System.out.println(" - Movimiento");
        mostrarDireccion();
        System.out.println(" ");
        System.out.println(" - Golpear Bloque Material:  G");
        System.out.println(" ");
        System.out.println((" - Terminar juego:  T"));
        System.out.println(" ");
        System.out.print("Ingresar: ");
    }

    private static void mostrarDireccion() {

        System.out.println("       * Arriba =  W");
        System.out.println("       * Abajo =  S");
        System.out.println("       * Derecha =  D");
        System.out.println("       * Izquierda =  A");
    }

}
