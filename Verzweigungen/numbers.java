package Verzweigungen;
import java.util.Scanner;

public class numbers {
    

    public static void main(String[] args) {

        int number = 0; 
        boolean positiv, even, is_null; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie eine belibeige Zahl");
        number = sc.nextInt();

        positiv = number > 0;
        is_null = number == 0; 
        even = number%2 == 0;

        System.out.println("\n" + "Ihren Nummer " + number + " ist:");
        System.out.println("Positiv: " + positiv);
        System.out.println("Negativ: " + (!(positiv) && !(is_null)));
        System.out.println("Null: " + is_null);
        System.out.println("Gerade: " + even);
        System.out.println("Ungerade: " + !(even));

        sc.close();
        
    }

}
