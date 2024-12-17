import java.util.Scanner;

public class bills {
    
    public static void main(String[] args) {

        int SMSamount, MMSamount;
        double base,  SMSbill, MMSbill, totalBILL;
        Scanner sc = new Scanner(System.in);

        base = 5.99;
        SMSbill = 0.19;
        MMSbill = 0.29;
        
        System.out.println("Mobil Tarif");
        System.out.println("Rechner für Mobil Tarif Kosten"); 
        System.out.println("Grundgebühr - 5,99 Euro"); 
        System.out.println("SMS 19ct & MMS 29ct"); 
        System.out.println("Anzahl von SMS, die sie diesen Monat gesendet haben: "); SMSamount = sc.nextInt();
        System.out.println("Anzahl von MMS, die sie diesen Monat gesendet haben: "); MMSamount = sc.nextInt();

        totalBILL = base + SMSamount*SMSbill + MMSamount*MMSbill;

        System.out.println("Ihren Gebühren für diesen Monat: " + totalBILL + " Euro");

    }

}
