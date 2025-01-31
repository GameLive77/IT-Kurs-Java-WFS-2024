package Verzweigungen;
import java.util.Arrays;
import java.util.Scanner;

public class triangle {
    
    public static void main(String[] args) {
        
        double a, b, c; 
        boolean triangle, equal_sides, rightAngle;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dreiecke analysieren");
        System.out.print("Dreieck länge Seite A: "); a = sc.nextDouble();
        System.out.print("Dreieck länge Seite B: "); b = sc.nextDouble();
        System.out.print("Dreieck länge Seite C: "); c = sc.nextDouble();

        triangle = a+b > c && b+c > a && a+c > b;
        
        if(triangle) {

            equal_sides = a == b && b == c;
            double[] sides = {a, b, c};
            Arrays.sort(sides);
            rightAngle = Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);

            System.out.println("\n Es liegt ein Dreieck vor!");
            
            if(equal_sides){

                System.out.println("Der Dreieck ist gleichseitig");

            }
            else if (rightAngle) {
                
                System.out.println("Der Dreieck ist rechtwinklig");

            }
            else {

                System.out.println("Der Dreieck ist weder gleichsetig noch rechtwinklig");

            }
            

        }
        else {

            System.out.println("\n Die Seiten passen nicht zu ein Dreieck!");

        }

        sc.close();

    }

}
