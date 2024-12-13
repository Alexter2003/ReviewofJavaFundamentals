package EntradaDeDatosPorConsola;

import java.util.Scanner;

public class ConversionDeDatos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Valor entero: ");
        var entero = Integer.parseInt(scanner.nextLine());
        System.out.println("Valor entero: " + entero);

    }
}
