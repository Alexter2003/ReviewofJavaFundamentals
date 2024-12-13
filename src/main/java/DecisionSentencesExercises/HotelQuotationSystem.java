package DecisionSentencesExercises;

import java.util.Scanner;

public class HotelQuotationSystem {
    public static void main(String[] args) {
        //constant variables
        Scanner sc = new Scanner(System.in);
        final var PRICE_WITH_SEA_VIEW = 190.50;
        final var PRICE_WITHOUT_SEA_VIEW = 150.50;

        //variables
        String name;
        int daysInTheHotel;
        boolean withSeaView;
        double total;

        System.out.println("** Hotel Quotation System **");
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        System.out.print("Enter days in the hotel: ");
        daysInTheHotel = Integer.parseInt(sc.nextLine());
        System.out.print("Do you want a room with a sea view? (true/false): ");
        withSeaView = Boolean.parseBoolean(sc.nextLine());

        if(withSeaView) {
            total = (PRICE_WITH_SEA_VIEW * daysInTheHotel);
        } else{
            total = (PRICE_WITHOUT_SEA_VIEW * daysInTheHotel);
        }

        System.out.println("\n**** Quotation details ****");
        System.out.println("Client name: " + name);
        System.out.printf("Days in the room: %d", daysInTheHotel);
        System.out.printf("\nRoom price: %.2f", total);
        System.out.printf("\nRoom type: %s \n", withSeaView ? "with sea view" : "without sea view" );

    }
}
