import java.util.Scanner;

public class cuboid{

    public static void main(String[] args) {

        float x, y, z, sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Volumen von Quader Rechner:");
        System.out.println("Kantenlänge 1: "); x = sc.nextInt();
        System.out.println("Kantenlänge 2: "); y = sc.nextInt();
        System.out.println("Kantenlänge 3: "); z = sc.nextInt();

        sum = x * y * z; 

        System.out.println("Volumen von Quader: " + sum);

    }

}