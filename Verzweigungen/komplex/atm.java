import java.util.Scanner; 

public class atm {
    
    public static void main(String[] args) {
        
        int[] banknotes = {500,200,100,50,20,10,5}; 
        int[] banknotes_needed = {0,0,0,0,0,0,0}; 
        String[] banknotes_names = {"500er-Scheine: ", "200er-Scheine: ", "100er-Scheine: ", "50er-Scheine: ", "20er-Scheine: ", "10er-Scheine: ", "5er-Scheine: "}; 
        int amount, rest; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Wie gr0ß ist der Geldbetrag: ");
        amount = sc.nextInt();

        for(int i = 0; i < 7; i ++){

            banknotes_needed[i] = amount / banknotes[i];
            rest = amount % banknotes[i]; 
            amount = rest; 

            System.out.println(banknotes_names[i] + banknotes_needed[i]);

        }

        System.out.println("Rest: " + amount);

        sc.close();

    }

}
