import java.util.Date;
import java.util.Scanner;

public class age {
    
    public static void main(String[] args) {

        String name;
        int birth, age;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Hallo, wie heißt du?"); 
        System.out.println("Anzahl von SMS, die sie diesen Monat gesendet haben: "); SMSamount = sc.nextInt();

        System.out.println("Grundgebühr - 5,99 Euro"); 
        System.out.println("SMS 19ct & MMS 29ct"); 
        System.out.println("Anzahl von SMS, die sie diesen Monat gesendet haben: "); SMSamount = sc.nextInt();
        System.out.println("Anzahl von MMS, die sie diesen Monat gesendet haben: "); MMSamount = sc.nextInt();

        totalBILL = base + SMSamount*SMSbill + MMSamount*MMSbill;

        System.out.println("Ihren Gebühren für diesen Monat: " + totalBILL + " Euro");

    }

}
