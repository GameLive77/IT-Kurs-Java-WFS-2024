import java.util.Scanner;

public class cuboid{

    public static void main(String[] args) {

        double x, y, z, sum, V, O;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Volumen von Quader Rechner:");
        System.out.print("Kantenlänge 1: "); x = sc.nextDouble();
        System.out.print("Kantenlänge 2: "); y = sc.nextDouble();
        System.out.print("Kantenlänge 3: "); z = sc.nextDouble();

        sum = 4*(x+y+z);
        V = x * y * z; 
        O = 2*x*y+2*x*z+2*y*z;

        System.out.println("Gesammtkantenlänge: " + sum);
        System.out.println("Volumen von Quader: " + V);
        System.out.println("Oberfläche: " + O);

        sc.close();

    }

}