import java.util.Scanner;
import java.lang.Math;

public class cone {
    
    public static void main(String[] args) {

        double r, h, s, V, O;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kegel Recher:");
        System.out.println("Bekannt Variable: Radius und Höhe"); 
        System.out.print("Radius: "); r = sc.nextDouble();
        System.out.print("Höhe: "); h = sc.nextDouble();

        s = Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2));
        O = Math.PI*Math.pow(r, 2)+Math.PI*r*s;
        V = Math.PI*Math.pow(r, 2)*h/3;

        System.out.println("Seitenlänge: " + s);
        System.out.println("Oberfläche:" + O);
        System.out.println("Volumen:" + V);

        sc.close();

    }

}
