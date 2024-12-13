package cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //constant variables
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //variables
        var numberToFind = rand.nextInt(100) + 1;
        boolean correctNumber = false;
        int attempts = 0;

        System.out.println("** Guess The Number **");

        while (!correctNumber){
            attempts++;
            System.out.print("\nEnter a number between 1 and 100: ");
            var number = Integer.parseInt(scan.nextLine());

            if( number == numberToFind){
                System.out.print("You find the number!!!\n");
                System.out.println("Your attempts: " + attempts);
                correctNumber = true;
            } else{
                System.out.printf("Sorry, the correct number is %s", number < numberToFind ? "HIGHER" : "LOWER" );
            }
        }

    }
}
