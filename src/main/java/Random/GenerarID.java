package Random;

import java.util.Random;
import java.util.Scanner;

public class GenerarID {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("*** GENERADOR DE ID ***");

        System.out.print("Ingrese su nombre: ");
        var nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellido = sc.nextLine();
        System.out.print("Ingrese su año de nacimiento (yyyy): ");
        var year = sc.nextLine();

        var valorAletorio = rand.nextInt(10000) + 1;

        var valor = "";
        if (valorAletorio > 999){
            valor = "" + valorAletorio;
        }else if (valorAletorio < 10) {
            valor = "000" + valorAletorio;
        } else if (valorAletorio < 100) {
            valor = "00" + valorAletorio;
        } else  {
            valor = "0" + valorAletorio;
        }

        String nombreFormateado = nombre.substring(0, 3).toUpperCase();
        String apellidoFormateado = apellido.substring(0, 3).toUpperCase();
        String yearFormateado = year.substring(2, 4).toUpperCase();

        var idUnico = String.join("", nombreFormateado, apellidoFormateado, yearFormateado, valor);
        System.out.println("Id: " + idUnico);

    }
}
