package Verzweigungen;
import java.util.Scanner;

public class gambling {
    
    public static void main(String[] args) {
        
        String exit;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i >= 0; i++){

            System.out.println("\nWillkommen beim Casion");
            System.out.println("Was sollen sie spielen?");
            System.out.println("1. Schätzen Co-Op \n2. Glücksrad");
            System.out.println("Um raus zu gehen, drücken Sie x ");

            exit = sc.nextLine();
            if(exit.equals("x") || exit.equals("X")){

                break;

            }
            else if(exit.equals("1")){

                guess_game(exit, sc);

            }
            else if(exit.equals("2")){

                spin_machine(exit, sc);

            }
            else{

                System.out.println("Invalide eingabe");

            }

        }

        sc.close();

    }

    public static void guess_game(String exit, Scanner sc) {
        
        double random = 0;
        double player_1 = 0; 
        double player_2 = 0;

        System.out.println("\nWer ist näher zu der Zahl");
        System.out.println("Um raus zu gehen, drücken Sie x");

        for (int i = 0; i >= 0; i++){

            try{

                System.out.println("Spieler 1 geben sie eine Zahl ein von 1 bis 100");
                player_1 = sc.nextDouble();
                System.out.println("Spieler 2 geben sie eine Zahl ein von 1 bis 100");
                player_2 = sc.nextDouble();
                
                guess(random, player_1, player_2);

            }
            catch(Exception e){

                return;

            }
        }

    }

    public static void guess(double random, double player_1, double player_2) {
      
        random = Math.random()*100 + 1;

        System.out.printf("\nDie Zahl war %.0f\n", random);
        if(Math.abs(random - player_1) < Math.abs(random - player_2)){

            System.out.println("Spieler 1 hat GEWONNEN!!!");
            return;

        }
        
        else if (Math.abs(random - player_2) < Math.abs(random - player_1)){

            System.out.println("Spieler 2 hat GEWONNEN!!!");
            return;

        }
        else{

            System.out.println("Gleichstand");
            return;

        }

    }

    public static void spin_machine(String exit, Scanner sc) {
        
        double random = 0;
        double win_chance = 0.39; 

        System.out.println("\nSPIN THE WHEEL");

        for (int i = 0; i >= 0; i++){

            System.out.println("Drechen sie das Glücksrad, indem sie beliebige Taske drücken");
            System.out.println("Um raus zu gehen, drücken Sie x ");
            exit = sc.nextLine();
            if(exit.equals("x") || exit.equals("X")){

                break;

            }
            else{

                spin(random, win_chance);

            }

        }

    }

    public static void spin(double random, double win_chance){

        random = Math.random();

        if(random <= win_chance){

            System.out.println("GEWONNEN!!!");
            return;

        }
        
        else {

            System.out.println("VERLOREN");
            return;

        }

    }

}
