import java.util.Scanner;
import java.util.Arrays;

public class sort_numbers {
    
    public static void main(String[] args) {
        
        int[] numbers = {0, 0, 0}; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie Drei zahlen ein zum Sortieren:");
        
        for(int i = 0; i < 3; i ++){

            numbers[i] = sc.nextInt(); 

        }

        Arrays.sort(numbers); 

        System.out.println("\nDie größte Zahl ist: " + numbers[2]);
        System.out.println("Die Zahlen in Reihnfolge von kleinste bis größte");

        for(int i = 0; i < 3; i ++){

            System.out.println(numbers[i]);

        }

        sc.close();

    }

}
