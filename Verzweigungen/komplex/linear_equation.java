import java.util.Scanner;

public class linear_equation {
    
    public static void main(String[] args) {
        
        double y, a, b; 
        double x; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Berechnen von x Wert in der Funktion y=ax+b");
        System.out.println("\nGeben Sie den a Wert ein:");
        a = sc.nextDouble();
        System.out.println("\nGegen Sie den b Wert ein:");
        b = sc.nextDouble(); 
        System.out.println("\nGeben sie den y Wert ein:");
        y = sc.nextDouble(); 

        if (a == 0) {
            
            if (y == b) {
                
                System.out.println("Unendlich viele Lösungen.");
            
            } else {
                
                System.out.println("Keine Lösung möglich.");
            
            }
        
        } else {

            x = (y-b)/a; 

            System.out.println("x Wert ist: " + x);
        
        }

        sc.close();
    
    }

}
