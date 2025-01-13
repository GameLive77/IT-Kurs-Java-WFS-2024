import java.util.Scanner;

public class electricityBill {
    
    public static void main(String[] args) {
        
        double current_State, lastYEAR_State, price, past_monthlyPayments;
        double consumption, totalBILL, paidBILL, BILL_difference, new_monthlyPayments;
        Scanner sc = new Scanner(System.in);        

        System.out.println("--- Stromkosten Rechner ---" + "\n");
        System.out.print("Geben Sie ein die diesjährige Auszählung des Stromzählers: "); current_State = sc.nextDouble();
        System.out.print("Geben Sie ein die letztjährige Auszählung des Stromzählers: "); lastYEAR_State = sc.nextDouble();
        System.out.print("\n" + "Geben Sie ein den aktuellen Strompreis pro kWh in Euro: "); price = sc.nextDouble();
        System.out.print("\n" + "Geben Sie ein den bisherige monatlichen Strompreis in Euro: "); past_monthlyPayments = sc.nextDouble();

        consumption = current_State - lastYEAR_State;
        totalBILL = consumption * price; 
        paidBILL = past_monthlyPayments * 12; 
        BILL_difference = totalBILL - paidBILL;
        new_monthlyPayments = totalBILL / 12; 

        System.out.println("\n" + "--- --- ---" + "\n");
        System.out.println("Verbrauchten Strom dieses Jahr: " + consumption + " kWh" + "\n"); 
        System.out.println("Gesammten Rechnung für das Jahr: " + totalBILL + " Euro");
        System.out.println("Bezahlten Beitrag für das Jarh: " + paidBILL + " Euro");
        System.out.println("Restbeitrag für das Jahr: " + BILL_difference + " Euro" + "\n");
        System.out.println("Neuen monatlichen Beitrag für das nächste Jahr: " + new_monthlyPayments + " Euro");
        System.out.println("\n" + "--- --- ---" + "\n");

        sc.close();

    }

}
