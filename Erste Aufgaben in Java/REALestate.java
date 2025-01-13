import java.util.Scanner;

public class REALestate
 {

    public static void main(String[] args) {

        // ppsm = price per square meter; VATp = VAT precent
        double length, width, area, ppsm, base, fee, VATp, VAT, total;
        fee = 0.03;
        Scanner sc = new Scanner(System.in);

        System.out.println("Grundstuck Preis berechnen");
        System.out.print("Länge von Grundstück in Meter: "); length = sc.nextDouble();
        System.out.print("Breite von Grundstück in Meter: "); width = sc.nextDouble();
        System.out.print("Quadratmeterpreis: "); ppsm = sc.nextDouble();
        System.out.print("Mehrwertsteuer: "); VATp = sc.nextDouble();

        area = length * width;
        base = ppsm * area; 
        VAT = VATp/100;
        total = base + base*fee + base*VAT;
        
        System.out.println("Kosten für Grundstück:");
        System.out.println("Fläche:" + area + "m²");
        System.out.println("Grundpreis:" + base + " Euro");
        System.out.println("Maklergebühr:" + (fee*base) + "Euro");
        System.out.println("Mehrwertsteuer:" + (VAT*base) + " Euro");
        System.out.println("Gesammt:" + total + " Euro");

        sc.close();
        
    }
    
}
