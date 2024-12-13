package cycles;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("** DRAW A TRIANGLE **");
        System.out.println("Enter the rows number: ");
        int rows = Integer.parseInt(sc.nextLine());

        for (int fila = 1; fila <= rows; fila++) {
            var espaciosBlanco = " ".repeat(rows - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }

    }
}
