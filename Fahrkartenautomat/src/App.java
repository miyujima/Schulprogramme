import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preis einer Fahrkarte: ");
        double preis = sc.nextDouble();
        if(preis < 0 || preis > 10) {
            System.out.println("Fehlerhafte Eingabe: "+preis+" Ticketpreis wird auf 1 gesetzt");
            preis = 1;
        }
        System.out.print("Anzahl der Tickets: " );
        int anzahl = sc.nextInt();
        if(anzahl < 0 || anzahl > 10) {
            System.out.println("Fehlerhafte Eingabe: "+preis+" Ticketpreis wird auf 1 gesetzt");
            preis = 1;
        }
        double zuZahlen = preis*anzahl;

        while(zuZahlen > 0) {
            System.out.println("Noch zu zahlen: "+zuZahlen+" Euro");
            System.out.print("Zahlen sie eine ein (mögliche Eingaben: 5 cent, 10 cent, 20 cent, 50 cent, 1 Euro, 2 Euro, 5 Euro, 10 Euro, 20 Euro): ");
            double einzahlung = sc.nextDouble();
            if(einzahlung == 0.05 || einzahlung == 0.10 || einzahlung == 0.20 || einzahlung == 0.5 || einzahlung == 1.0 || einzahlung == 2.0 || einzahlung == 5.0 || einzahlung == 10.0 || einzahlung == 20.0) {
                zuZahlen = zuZahlen - einzahlung;
            }
            else {
                System.out.println("Invalide Einzahlung!");
            }
        }

        System.out.println("==========================");
        
        if(zuZahlen < 0) {
            double ruck = zuZahlen-(zuZahlen*2);
            System.out.println("Ihr Rückgeld beträgt: "+ruck+ " Euro");

        }

        System.out.println("Fahrschein wird gedruckt");

        System.out.println("Vergessen sie nicht den Fahrschein vor Antritt der Fahrt entwerten zu lassen.");
        System.out.println("Wir wünschen ihnen eine Gute Fahrt!");

        sc.close();

    }
}
