package DecisionSentencesExercises;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        //constant variables
        Scanner sc = new Scanner(System.in);

        //variables
        boolean logout = false;
        int amountInAccount = 0;
        int option;

        while (!logout){
            System.out.println("What do you want do?");
            System.out.println("1 - Logout");
            System.out.println("2 - Add money in your Account");
            System.out.println("3 - Remove money in your Account");
            System.out.println("4 - See Account");
            System.out.print("option: ");
            option = Integer.parseInt(sc.nextLine());

            if(option == 1){
                System.out.println("Bye!!");
                logout = true;
            }else if(option == 2){
                System.out.println("What is the amount you want to add");
                amountInAccount += Integer.parseInt(sc.nextLine());
                System.out.println("Your new amount is " + amountInAccount);
            }else if(option == 3){
                System.out.println("What is the amount you want to remove");
                var moneyToDiscount = Integer.parseInt(sc.nextLine());
                if(amountInAccount > moneyToDiscount ){
                    amountInAccount -= moneyToDiscount;
                    System.out.println("Your new amount is " + amountInAccount);
                }else{
                    System.out.println("You not have this money ");
                }
            }else if(option == 4){
                System.out.println("Money in your account: " + amountInAccount);
            }
        }

    }
}
