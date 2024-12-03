import java.util.Scanner;

public class Wahlauswertung {
    public static void main(String[] args) {
        // Definition von Variablen
        int anzahl1, anzahl2, anzahl3, anzahl4;
        double summe, anteil1, anteil2, anteil3, anteil4;
        Scanner sc = new Scanner(System.in);

        // Eingabe
        System.out.print("Dieters Stimmenanzahl: "); anzahl1 = sc.nextInt();
        System.out.print("Erikas Stimmenanzahl: "); anzahl2 = sc.nextInt();
        System.out.print("Holgers Stimmenanzahl: "); anzahl3 = sc.nextInt();
        System.out.print("Fritz Stimmenanzahl: "); anzahl4 = sc.nextInt();

        // Verarbeitung
        summe = anzahl1 + anzahl2 + anzahl3 + anzahl4;
        anteil1 = anzahl1 / summe * 100;
        anteil2 = anzahl2 / summe * 100;
        anteil3 = anzahl3 / summe * 100;
        anteil4 = 100 - anteil1 - anteil2 - anteil3;

        // Ausgabe
        System.out.println("Dieters Anteil: " + anteil1 + " %");
        System.out.println("Erikas Anteil: " + anteil2 + " %");
        System.out.println("Holgers Anteil: " + anteil3 + " %");
        System.out.println("Fritz Anteil: " + anteil4 +" %");
    }
}
