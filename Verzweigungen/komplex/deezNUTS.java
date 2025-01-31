import java.util.Scanner;

public class deezNUTS {
    
    public static void restartProgram() {
        main(new String[0]);
    }

    public static void main(String[] args) {
        
        int amount_screws, amount_nuts, amount_washers, continue_Purchase;
        double screws_price = 0.05, nuts_price = 0.03, washers_price = 0.01, total; 
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n" + "Willkommen im Globus Baumarkt" + "\n");
        System.out.println("-- --- --- --- --- --- Preisliste --- --- --- --- --- --");
        System.out.printf("\n%-17s %30.2f %5s\n", "Schrauben:", screws_price ,"Euro");
        System.out.printf("%-17s %30.2f %5s\n", "Muttern:", nuts_price ,"Euro");
        System.out.printf("%-17s %30.2f %5s\n\n", "Unterlegscheiben:", washers_price ,"Euro");
        
    
        System.out.println("-- --- --- --- --- --- --- Kasse --- --- --- --- --- --- --" + "\n");
        System.out.print("Wie viele Schrauben möchten Sie kaufen? "); amount_screws = sc.nextInt();
        System.out.print("Wie viele Muttern möchten Sie kaufen? "); amount_nuts = sc.nextInt();
        System.out.print("Wie viele Unterlegscheiben möchten Sie kaufen? "); amount_washers = sc.nextInt();
        sc.nextLine();

        total = (amount_screws * screws_price) + (amount_nuts * nuts_price) + (amount_washers * washers_price);
        
        if (amount_screws >= amount_nuts && amount_screws >=  amount_washers && amount_nuts >= amount_washers) {

            System.out.println("\n" + "------------------------------------------------------" + "\n");
            System.out.printf("%-10s %37.2f %5s\n\n","Gesamt:", total, "Euro");

        }

        else if (!(amount_screws >= amount_nuts)) {

            System.out.println("\n" + "!! WARNING !!");
            System.out.println("Sie haben mehr Muttern als Schrauben bestellt! Wollen sie troztdem diese Mengen bestellen");

            System.out.printf("%-30s %5s %10.2f %5s\n", "Schrauben", amount_screws + " x", screws_price, "Euro");
            System.out.printf("%-30s %5s %10.2f %5s\n", "Muttern", amount_nuts + " x", nuts_price, "Euro");
            System.out.printf("%-30s %5s %10.2f %5s\n", "Unterlegscheiben", amount_washers + " x", washers_price, "Euro");

            System.out.println("Schreiben sie 0 für NEIN und 1 für JA");
            continue_Purchase = sc.nextInt();
            
            if(continue_Purchase == 1) {

                System.out.println("\n" + "------------------------------------------------------" + "\n");
                System.out.printf("%-10s %37.2f %5s\n\n","Gesamt:", total, "Euro");

            }

            else { 

                restartProgram();
            
            }

        }

        else if (!(amount_screws >= amount_washers)) {

            System.out.println("\n" + "!! WARNING !!");
            System.out.println("Sie haben mehr Unterlegscheiben als Schrauben bestellt! Wollen sie troztdem diese Mengen bestellen");

            System.out.printf("%-30s %5s %10.2f %5s\n", "Schrauben", amount_screws + " x", screws_price, "Euro");
            System.out.printf("%-30s %5s %10.2f %5s\n", "Muttern", amount_nuts + " x", nuts_price, "Euro");
            System.out.printf("%-30s %5s %10.2f %5s\n", "Unterlegscheiben", amount_washers + " x", washers_price, "Euro");

            System.out.println("Schreiben sie 0 für NEIN und 1 für JA");
            continue_Purchase = sc.nextInt();
            
            if(continue_Purchase == 1) {

                System.out.println("\n" + "------------------------------------------------------" + "\n");
                System.out.printf("%-10s %37.2f %5s\n\n","Gesamt:", total, "Euro");

            }

            else { 

                restartProgram();
            
            }

        }

        else {

            System.out.println("\n" + "!! WARNING !!");
            System.out.println("Sie haben mehr Unterlegscheiben als Muttern bestellt! Wollen sie troztdem diese Mengen bestellen");

            System.out.printf("%-30s %5s %10.2f %5s\n", "Schrauben", amount_screws + " x", screws_price, "Euro");
            System.out.printf("%-30s %5s %10.2f %5s\n", "Muttern", amount_nuts + " x", nuts_price, "Euro");
            System.out.printf("%-30s %5s %10.2f %5s\n", "Unterlegscheiben", amount_washers + " x", washers_price, "Euro");

            System.out.println("Schreiben sie 0 für NEIN und 1 für JA");
            continue_Purchase = sc.nextInt();
            
            if(continue_Purchase == 1) {

                System.out.println("\n" + "------------------------------------------------------" + "\n");
                System.out.printf("%-10s %37.2f %5s\n\n","Gesamt:", total, "Euro");

            }

            else { 

                restartProgram();
            
            }

        }

        sc.close();

    }   

}
