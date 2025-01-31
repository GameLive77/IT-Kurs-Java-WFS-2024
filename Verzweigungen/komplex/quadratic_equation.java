import java.util.Scanner;
import java.lang.Math;

public class quadratic_equation {
    
    public static void main(String[] args) {
        
        double c, a, b; 
        double[] x = {0, 0}; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Berechnen von x Wert in der Funktion y=ax²+bx+c");
        System.out.println("Geben Sie den a Wert ein:");
        a = sc.nextDouble();
        System.out.println("Gegen Sie den b Wert ein:");
        b = sc.nextDouble(); 
        System.out.println("Geben sie den c Wert ein:");
        c = sc.nextDouble(); 

        if (a == 0){

            if (b == 0) {
            
                if (c == 0) {
                    
                    System.out.println("Unendlich viele Lösungen.");
                
                } else {
                    
                    System.out.println("Keine Lösung möglich.");
                
                }
            
            } else {
    
                x[0] = (0-c)/b; 
    
                System.out.println("x Wert ist: " + x[0]);
            
            }

        } else {

            x[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2*a); 
            x[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2*a); 
    
            System.out.println("x Wert ist: "+ x[0] + " & " + x[1]);
            sc.close();

        }


    }

}
