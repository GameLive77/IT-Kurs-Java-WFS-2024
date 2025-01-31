package Verzweigungen;
import java.util.Scanner; 

public class iKauf {
    
    public static void main(String[] args) {
        
        double total, delivery_cost, delivery_until, discount, discount_from, new_total;
        Scanner sc = new Scanner(System.in);
        delivery_cost = 3.50; 
        delivery_until = 100; 
        discount = 0.98; 
        discount_from = 200; 
    
        System.out.println("Willkommen bie iKauf");
        System.out.println("Wie hoch ist ihren Auftragswert in Euro?");
        total = sc.nextInt();

        if(total < delivery_until){

            new_total = total + delivery_cost;

        }
        else if (total >= discount_from){

            new_total = total * discount;

        }
        else{

            new_total = total; 

        }

        System.out.println("\n" + "Rechnungsendbetrag: " + new_total + " Euro");
        
        sc.close();

    }

}
