import java.util.Scanner;


public class Teclado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        imprimirComando();

        String comando = entrada.nextLine();
        System.out.println("Comando elegido: " + comando);
    }

    private static void imprimirComando() {

        System.out.println("Comando:");
        System.out.println(" - Movimiento:");
        System.out.println("       * Arriba = W");
        System.out.println("       * Abajo = S");
        System.out.println("       * Derecha = D");
        System.out.println("       * Izquierda = A");
        System.out.print("Ingresar: ");
    }

}
