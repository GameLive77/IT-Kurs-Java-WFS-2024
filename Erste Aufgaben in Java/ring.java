import java.util.Scanner;
import java.lang.Math;

public class ring {
    
    public static void main(String[] args) {

        double r1, r2, A;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kreisring Recher:");
        System.out.println("Bekannt Variable: äußerem umd inneren Radius"); 
        System.out.print("äußerer Radius: "); r1 = sc.nextDouble();
        System.out.print("inneren Radius: "); r2 = sc.nextDouble();

        A = Math.sqrt(Math.pow(r1, 2)-Math.pow(r2, 2));

        System.out.println("Flächeninhalt: " + A);

        sc.close();

    }

}