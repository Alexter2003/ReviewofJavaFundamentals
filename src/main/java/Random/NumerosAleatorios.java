package Random;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros aleatorios ** ");
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            //Generar numero aleatorio
            var numeroAleatorio = random.nextInt(10) + 1;
            System.out.println(numeroAleatorio);
        }
    }
}
