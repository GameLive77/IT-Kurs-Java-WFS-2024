package Verzweigungen;

import java.util.Scanner;

public class bank {
    
    public static void main(String[] args) {

        int PIN, PIN_given; 
        double balance, withdraw, new_balance;
        boolean correct, go_through;
        Scanner sc = new Scanner(System.in);

        PIN = 2043;
        balance = 136.34;
        withdraw = 0;
        correct =  go_through = false;

        System.out.println("*** *** BANKAUTOMATEN *** ***");
        System.out.println("\nBitte geben Sie ihren Karte ein");
        System.out.println("Bitte geben Sie ihren PIN ein");
        PIN_given = sc.nextInt();
        sc.nextLine();

        correct = tryout(PIN, PIN_given);

        while (correct == false){

            for (int i = 0; i < 3; i++){

                System.out.println("\nBitte geben Sie ihren PIN erneut ein \nSie haben noch " + (3 - i) + " Versuche");
                PIN_given = sc.nextInt();
                sc.nextLine();
                correct = tryout(PIN, PIN_given);

                if (correct) {
                    break;
                }
            
                if (i == 2) {
                    System.out.println("Sie haben keine Versuche mehr. Ihre Karte wird gesperrt!");
                    sc.close();
                    return; 
                }
                
            }

        }
   
        while (go_through == false) {

            System.out.println("\n\nIhren Kontostand beträgt: " + balance + " Euro\n");
            System.out.println("Wieviel Geld möchten Sie abheben?");
            withdraw = sc.nextDouble();
            go_through = withdraw_try(withdraw, balance);

        }

        new_balance = balance - withdraw;

        System.out.println("Sie haben " + withdraw + "Euro abgehoben");
        System.out.println("Sie haben noch " + new_balance + " Euro auf ihren Konto übrig");

        sc.close(); 

    }

    public static boolean tryout(int PIN, int PIN_given){

        if (PIN == PIN_given){

            return true; 

        }
        else {

            System.out.println("\nSie haben den falschen PIN eingegeben");
            return false;

        }

    }

    public static boolean withdraw_try(double withdraw, double balance) {
        
        if (withdraw > balance) {

            System.out.println("\nSie haben nicht genugend Geld auf dem Konto!");
            System.out.println("Sie es fehlen " + (withdraw - balance) + " Euro, um ihren Auszahlungbeitrag zu gewährleisten");
            return false;

        }
        else if (withdraw < 0) {

            System.out.println("\nSie haben einen negativen Wert eingegeben");
            return false;

        }
        else {

            return true; 

        }

    }

}
