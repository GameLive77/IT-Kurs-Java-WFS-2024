import java.util.Scanner; 

public class DeliveryCourier {
    
    public static void main(String[] args) {
        
        double total, packaging_cost_1, packaging_cost_2, delivery_until, postage_share, discount_from, new_total;
        Scanner sc = new Scanner(System.in);
        packaging_cost_1 = 3; 
        packaging_cost_2 = 2; 
        postage_share = 2;
        delivery_until = 100; 
        discount_from = 200; 
    
        System.out.println("Willkommen bie iKauf");
        System.out.println("Wie hoch ist ihren Auftragswert in Euro?");
        total = sc.nextInt();

        if(total < delivery_until){

            new_total = total + packaging_cost_1 + postage_share;

        }
        else if (total >= discount_from){

            new_total = total;

        }
        else{

            new_total = total + packaging_cost_2; 

        }

        System.out.println("\n" + "Rechnungsendbetrag: " + new_total + " Euro");
        
        sc.close();

    }

}
