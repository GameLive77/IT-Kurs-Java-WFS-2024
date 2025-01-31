package Verzweigungen;

import java.util.Scanner;

public class greet {

    public static void main(String[] args) {
        
        int age; 
        String Name, gender; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: "); 
        Name = sc.nextLine();

        System.out.println("Alter: ");
        age = sc.nextInt(); sc.nextLine();

        System.out.println("Geschlecht: (m für Männlich; w für Weblich)");
        gender = sc.nextLine();

        if(age >= 18){

            if(gender.equals("m")||gender.equals("M")){

                System.out.println("Guten Tag Herr " + Name + gender);

            }

            else if(gender.equals("w")||gender.equals("W")){

                System.out.println("Guten Tag Frau " + Name + gender);

            }

            else {

                System.out.println("Guten Tag " + Name + gender);

            }

        }

        else {

            System.out.println("Hallo " + Name + gender);

        }

        sc.close();

    }
    
}
