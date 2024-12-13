package DecisionSentencesExercises;

import java.util.Scanner;

public class ejercicioTiendaEnLinea {
    public static void main(String[] args) {
        //Variables fijas
        final var MONTO_COMPRA_DESC = 1000;

        //Variables
        double amountOfPurchases;
        boolean esMiembro;
        double amountWithDiscounts = 0;
        double discount;
        double total;
        Scanner scan = new Scanner(System.in);


        System.out.println("** Tienda en linea con descuentos **");
        System.out.print("Digite el monto de compra: ");
        amountOfPurchases = Double.parseDouble(scan.nextLine());
        System.out.print("Es miembro? (true/false): ");
        esMiembro = Boolean.parseBoolean(scan.nextLine());

        if(amountOfPurchases >= MONTO_COMPRA_DESC && esMiembro){
            discount = 0.10;
        } else if (amountOfPurchases < MONTO_COMPRA_DESC && esMiembro){
            discount = 0.05;
        } else {
            discount = 0;
        }

        if(discount != 0){
            amountWithDiscounts = amountOfPurchases * discount;
            total = amountOfPurchases - amountWithDiscounts;
        }else{
            total = amountOfPurchases;
        }
        System.out.println("\nSu descuento es de: " + discount * 100 + "%");
        System.out.println("Su total comprado: " + amountOfPurchases);
        System.out.println("Total descontado: " + amountWithDiscounts);
        System.out.println("Total de compras con descuento: " + total);
    }
}
