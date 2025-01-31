import java.util.Scanner; 

public class Beispiel01 {
    public static void main(String[] args) {
      int kundennummer, anzahl;
      double preis, gesamtPreis; // Variable umschreiben 
      Scanner Input = new Scanner(System.in); // Scanner hinzufügen 
      
      System.out.print("Geben Sie Ihre Kundennummer ein: ");
      kundennummer = Input.nextInt(); // next statt read; variable = Input und nicht in Klammern 
   
      System.out.print("Geben Sie die Anzahl ein: ");
      anzahl = Input.nextInt(); //Anzahl einlessen vergessen 
   
      System.out.print("Geben Sie den Stückpreis ein: ");
      preis = Input.nextDouble(); // next statt read; variable = Input und nicht in Klammern 
   
      gesamtPreis = preis * anzahl; // Funktion umdrehen
   
      if (kundennummer < 100) {
        gesamtPreis = gesamtPreis * 0.95; // Semikolan vergessen 
      }
   
      if (anzahl < 20) {
        gesamtPreis = gesamtPreis + 15;
      } else
        if (anzahl < 50) {
          gesamtPreis = gesamtPreis + 5;
      }
      Input.close();
    }
  }