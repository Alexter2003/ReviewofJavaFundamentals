package EntradaDeDatosPorConsola.EjercicioDeSistemaEmpleados;

import java.util.Scanner;

//Pequeño ejercicio para toma de datos desde consola
public class tomaDeDatosEmpleado {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        var nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        var edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el salario del empleado: ");
        var salario = Double.parseDouble(scanner.nextLine());

        System.out.print("El empleado es jefe? ");
        var esJefe = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Datos del empleado: \n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Es jefe: " + esJefe);

    }
}
