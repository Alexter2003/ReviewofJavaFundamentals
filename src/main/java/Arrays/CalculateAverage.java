package Arrays;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        //constant variables
        Scanner sc = new Scanner(System.in);
        int numberOfNotes;
        int[] notes ;
        int average = 0;

        try {
            System.out.println("** CALCULATE AVERAGE **");
            System.out.print("How many notes do you enter? ");
            numberOfNotes = Integer.parseInt(sc.nextLine());
            notes = new int[numberOfNotes];
        } catch (Exception e) {
            System.out.println("The entered value is not a number");
            return;
        }

        for (int i = 0; i < numberOfNotes; i++) {
            System.out.println("Enter note number " + (i + 1) );
            notes[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < numberOfNotes; i++) {
            average += notes[i];
        }

        average /= numberOfNotes;

        System.out.println("The average is: " + average);


    }
}
