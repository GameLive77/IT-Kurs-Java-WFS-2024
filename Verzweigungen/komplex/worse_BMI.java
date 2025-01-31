import java.util.Scanner;

public class worse_BMI {
    
    public static void main(String[] args) {
        
        String gender_char; 
        boolean gender; // True = Mann, False = Frau 
        int age; 
        double height, weight, right_weight; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Sind Sie über-, unter- oder normalgewichtig?");
        System.out.println("Sind sie Männlich (M) oder Weiblich (W)?");
        gender_char = sc.nextLine();

        gender = gender_char.equals("M") || gender_char.equals("m");

        System.out.print("Lebesjahr: ");
        age = sc.nextInt();
        System.out.print("Gewicht in kg: ");
        weight = sc.nextDouble(); 
        System.out.print("Größe in cm: ");
        height = sc.nextDouble();

        right_weight = height - 100; 

        if(age < 18 || height <= 120){

            System.out.println("Sie sind zu Jung oder zu Klein um ihren Gewicht zu beurteilen");

        }
        else if(gender){

            if(weight > right_weight * 0.95 && weight < right_weight * 1.05){

                System.out.println("Sie haben ein normales Gewicht für ein Mann");

            }
            else if (weight <= right_weight * 0.95){

                System.out.println("Sie haben ein untergewichtiges Körper");

            }
            else {

                System.out.println("Sie haben ein übergewichtiges Körper");

            }

        }
        else {

            if(weight > right_weight * 0.93 && weight < right_weight * 1.04){

                System.out.println("Sie haben ein normales Gewicht für ein Mann");

            }
            else if (weight <= right_weight * 0.93){

                System.out.println("Sie haben ein untergewichtiges Körper");

            }
            else {

                System.out.println("Sie haben ein übergewichtiges Körper");
            }

        }

        sc.close();

    }

}
