import java.util.Scanner;
import java.lang.Math;

public class cashRegister {
    
    public static void main(String[] args) {
        
        int amount_items;
        double total = 0, given, returned; 
        Scanner sc = new Scanner(System.in);

        System.out.println("-- --- --- --- --- --- --- Kasse --- --- --- --- --- --- --" + "\n");
        System.out.print("Wie viele Produkte wollen Sie kaufen? "); amount_items = sc.nextInt();
        sc.nextLine();
        
        String[] items = new String[amount_items];
        int[] amount = new int[amount_items];
        double[] pricePER = new double[amount_items];
        double[] price = new double[amount_items];

        for (int i = 0; i < amount_items; i++) {

            System.out.println("\n" + (i + 1) + ". Produkt");
            System.out.print("Produktname: "); items[i] = sc.nextLine();
            System.out.print("Anzahl von Produkt: "); amount[i] = sc.nextInt();
            System.out.print("Preis von Produkt in Euro: "); pricePER[i] = sc.nextDouble();
            sc.nextLine();

            price[i] = (double) Math.round((amount[i] * pricePER[i]) * 100) / 100;
        
        };

        for (double p : price) {
            total += p;
        }
        
        System.out.println("\n" + "------------------------------------------------------" + "\n");
        System.out.println("Gesamt: " + ((double) Math.round((total) * 100) / 100) + " Euro");
        System.out.println("Wie viel Euro haben Sie gegeben?");
        given = sc.nextDouble();
        sc.nextLine();
        
        returned = (double) Math.round((given - total) * 100) / 100;

        if (returned < 0) {
        
            System.out.println("\n" + "Sie haben zu wenig Geld gegeben");
            System.out.println("Es fehlt " + (returned * -1) + " Euro");

        }

        else {
            
            System.out.println("\n" + "-- --- --- --- --- --- Quittung --- --- --- --- --- --" + "\n");

            for(int i = 0; i < amount_items; i++){
                
                System.out.printf("%-30s %5s %10.2f %5s\n", items[i], amount[i] + " x", pricePER[i], "Euro");
                System.out.printf("%47.2f %5s\n\n", price[i], "Euro");

            };

            System.out.println("------------------------------------------------------");
            System.out.printf("%-10s %36.2f %5s\n\n","Gesamt:", total, "Euro");
            System.out.printf("%-10s %36.2f %5s\n", "Gegeben:", given, "Euro");
            System.out.printf("%-10s %36.2f %5s\n", "Zurück:", returned, "Euro");
            
        }

        sc.close();

    }   

}
