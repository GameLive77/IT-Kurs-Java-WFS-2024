import java.util.Scanner;

public class leap_year {
    
    public static void main(String[] args) {
        
        int year; 
        boolean leap_year; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Schaltjahr berechenen");
        System.out.println("Welchen Jahr wollen sie ermitteln?");
        year = sc.nextInt();

        if(year%4 == 0){

            if(year%100 == 0){

                if (year%400 == 0){

                    System.out.println("Schaltjahr");

                }
                else {

                    System.out.println("KEIN Schaltjahr");

                }

            }
            else {

                System.out.println("Schaltjahr");

            }

        }
        else {

            System.out.println("KEIN Schaltjahr");

        }

        // ODER MAN MACHT ES IN EIN BOOLEAN STATMENT 

        leap_year = (year%4 == 0 && year%100 != 0) || (year%400 == 0);

        if(leap_year){

            System.out.println("Schaltjahr");

        }
        else {

            System.out.println("KEIN Schaltjahr");

        }

        sc.close();

    }

}
