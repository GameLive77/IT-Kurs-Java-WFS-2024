import java.util.Scanner;

public class weeklySalary {
    
    public static void main(String[] args) {
        
        double working_hours, overtime, hourly_wage, overtime_bonus, salary;
        Scanner sc = new Scanner(System.in);        

        overtime_bonus = 1.2;

        System.out.println("--- Wochenlohn Rechner ---" + "\n");
        System.out.println("Als Eingaben sind die Anzahl der Arbeitsstunden, die Anzahl der Überstunden und der Stundenlohn." + "\n" +"Für Überstunden muss zudem ein Zuschlag von 20% auf den Stundenlohn gewährt werden." +"\n");
        System.out.print("Anzahl der Arbeitsstunden: "); working_hours = sc.nextDouble();
        System.out.print("Anzahl der Überstunden: "); overtime = sc.nextDouble();
        System.out.print("Stundenlohn in Euro: ");  hourly_wage = sc.nextDouble();

        salary = working_hours * hourly_wage + overtime * (hourly_wage * overtime_bonus);

        System.out.println("\n" + "Wochenlohn:");
        System.out.println(salary + " Euro");

        sc.close();

    }

}
