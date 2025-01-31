import java.util.Scanner; 

public class functions {
 
    public static void main(String[] args) {
        
        double x, y; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Welchen Wer entspircht den Wert x in dieser Funktion");
        System.out.println("Geben Sie den Wert x ein:");
        x = sc.nextInt();

        if(x >= -3 && x <= -1){

            y = x + 2; 
            System.out.println("Der Wert f(x) ist: " + y);

        }
        else if(x > -1 && x <= 1){

            y = 1; 
            System.out.println("Der Wert f(x) ist: " + y);

        } 
        else if(x > 1 && x <= 4){

            y = -0.25*Math.pow(x,2) + 0.5*x + 0.75;
            System.out.println("Der Wert f(x) ist: " + y);

        }
        else{

            System.out.println("Wert befindet sich außerhalb des Intervalls, kein Wert ist angegeben");

        }

        sc.close();

    }

}
