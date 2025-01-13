import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class age {

    public static void main(String[] args) {

        String name, birthday;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hallo, wie heißt du?");
        name = sc.nextLine();

        System.out.println("Wann bist du geboren? (Format: dd.MM.yyyy)");
        birthday = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {

            LocalDate birthdate = LocalDate.parse(birthday, formatter);
            LocalDate today = LocalDate.now();
            int age = Period.between(birthdate, today).getYears();
            System.out.println("Hallo " + name + "! Du bist " + age + " Jahre alt.");

        } 
        catch (DateTimeParseException e) {
            
            System.out.println("Das eingegebene Datum ist ungültig. Bitte benutze das Format: dd.MM.yyyy .");
        
        }

        sc.close();
        
    }
}