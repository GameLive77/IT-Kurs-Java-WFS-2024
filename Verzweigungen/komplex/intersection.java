import java.util.Scanner;

public class intersection {
    
    public static void main(String[] args) {
        
        double a, b, c, d, x, y; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Schnittpunkt berechnen für die Funktionen - g(x)=y=ax+b und h(x)=y=cx+d");
        System.out.println("Geben Sie den Wert für a");
        a = sc.nextDouble();
        System.out.println("Geben Sie den Wert für b");
        b = sc.nextDouble();
        System.out.println("Geben Sie den Wert für c");
        c = sc.nextDouble();
        System.out.println("Geben Sie den Wert für d");
        d = sc.nextDouble();

        if (a == c){

            if(b == d){

                System.out.println("Funktionen verlaufen parallel aufeinander und es gibt unendlich viele Lösungen");

            }
            else{

                System.out.println("Die Funktionen verlaufen parallel und es gibt keinen schneidepunkt");

            }
            
        }
        else {

            x = (b-d) / (c-a);
            y = a*x+b;

            System.out.println("Der Schnittpunkt ist (" + x + "|" + y +")");

        }

        sc.close();

    }

}
