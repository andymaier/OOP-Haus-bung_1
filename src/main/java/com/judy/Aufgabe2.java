package com.judy;
 /* Funktionsbeschreibung: 
Das Programm erstellt ein Angebot, basiert auf den vom Benutzer eingegebenen Buchungsdaten. Es gliedert sich in 3 Hauptteile: Eingabe, Berechnung und Ausgabe. 
1. Eingabe: Der Benutzer soll die Anzahl der Personen, Übernachtungen und Mahlzeiten pro Tag eingeben (Hinweis: da wir keine If Anweisungen verwenden dürfen, kann ich auch keine Bedinung stellen, dass eine Fehlermeldung kommt, wenn der Benutzer mehr als 3 Mahlzeiten eingibt: if (m > 3) { System.out.println("Fehler: Sie können maximal 3 Mahlzeiten pro Tag buchen."); }
2. Berechnung: Das Programm berechnet die Anzahl der benötigten Zimmer, die Anzahl der Übernachtungen (voller Preis und rabatt), Anzahl der Mahlzeiten und Teilsummen der Übernachtungen.
3. Ausgabe: Das Programm gibt die eingegebenen Buchungsdaten, sowie die errechneten Teilsummen aus- am ende wird der Gesamtpreis ausgegeben */

public class Aufgabe2 {

public static void main(String[] args) {
    // Eingabe 
	Out.print("Geben Sie die Personenzahl ein:");
	int p = In.readInt();
	Out.print("Geben Sie die Anzahl der Übernachtungen ein:");
	int u = In.readInt();
	Out.print("Geben Sie die Anzahl der Mahlzeiten pro Tag ein (max.3):");
	int m = In.readInt();
	
	
	//Berechnung der Werte
	int rooms = (p +1) /2; 
	int nightsFullPrice = u % 7; 
	int nightsDiscounted = u - nightsFullPrice; 
	int meals10_50Euro = m / 3;
	int meals25Euro = m - meals10_50Euro;
	
	
	int sumnightsFullPrice = (int) nightsFullPrice *12000 * rooms; 
	int sumnightsDiscounted = (int) (nightsDiscounted * (12000- (12000 * 0.1)) * rooms);
	int summeals25Euro = (int) meals25Euro * u * p * 2500 ;
	int summeals10_50Euro = (int) (meals10_50Euro * u * p * 1050);
	int totalCost = sumnightsFullPrice + sumnightsDiscounted + summeals25Euro + summeals10_50Euro;
	
	
    // Ausgabe der Werte
	Out.println ("");
    Out.println("Ihre eingegebenen Buchungsdaten:");
    Out.println("Anzahl der Personen: " + p);
    Out.println("Anzahl der Übernachtungen: " + u);
    Out.println("Anzahl der Mahlzeiten pro Tag: " + m);

    Out.println ("\nTeilsummen:");
    Out.println ("Teilsumme für Übernachtungen zum ganzen Preis: " + sumnightsFullPrice / 100 + "Euro");
    Out.println ("Teilsumme für Übernachtungen zum reduzierten Wochenrabatt- Preis: " + sumnightsDiscounted / 100 + "Euro");
    Out.println ("Teilsumme für Mahlzeiten 25 Euro: " + summeals25Euro / 100 + "Euro");
    Out.println ("Teilsumme für Mahlzeiten zu 10,50 Euro: " + summeals10_50Euro / 100 + "Euro");

    Out.println("\nGesamtkosten: " + totalCost / 100 + "Euro");
    
  }

}

