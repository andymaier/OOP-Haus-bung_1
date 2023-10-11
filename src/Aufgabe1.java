import java.io.IOException;

/*  Funktion des Programms (ab der Main- Methode):
1. Die Variable int mit dem Namen “numberofOutputs” wird hier deklariert.
-> Sie wird verwendet um Anzahl der Ausgaben, die der Benutzer eingibt, zu speichern
2. In der Zeile  Out.print … wird der Benutzer aufgefordert die gewünschte Anzahl der Ausgaben einzugeben 
-> Out.print schreibt die Anweisung (please enter…) in die Konsole, so dass sie für den Nutzer sichtbar ist 
3. numberOfOutputs = In.readInt(); der eingegebene Wert wird gelesen und in der Variable “numberOfOutputs” gespeichert 
4. Danach wird eine Schleife gestartet, die von i=1 bis i =numberOfOutputs läuft. Der Code im Schleifenblock wird so oft ausgeführt, wie es der Benutzer eingegeben hat. 
5. Innerhalb der Schleife wird zuerst “output Number” ausgegeben, dann wird der Aktuelle wert von i ausgegeben und es wird dann noch “hello world!” ausgegeben 
6. Schleife und Main Methode werden mit Klammern beendet 

Änderungen: 
- Integer -> int (richtiger Datentyp Java) 
- numberOfOutpts -> Rechtschreibfehler korrigiert 
- for (int i = 1; i < nrOfOutputs; i++) -> i<= geöndert und Rechtschreibfehler “numberOfOutputs” verbessert (Schleife läuft so korrekt) 
- in und out java datei reingeladen 
- variable j in i umbenannt */

/**
 * Dies ist die Klasse Aufgabe1.
 * Sie enthält die main-Methode. 
 */
public class Aufgabe1 {

	/**
	 * Diese Methode ist der Einstiegspunkt des Programms.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int numberOfOutputs = getUserInput();
		printBasedOnUserInput(numberOfOutputs);
	}

	/**
	 * Diese Methode liest die Anzahl der Ausgaben ein.
	 * Die IOException wird geworfen, wenn ein Fehler beim Lesen der Eingabe auftritt.
	 * Das Einlesen erfolgt über die System.in.read()-Methode.
	 * @return
	 * @throws IOException
	 */
	private static int getUserInput() throws IOException {
		int numberOfOutputs;
		System.out.print("Please enter the number of outputs: ");
		numberOfOutputs = System.in.read();
		return numberOfOutputs;
	} 

	/**
	 * Diese Methode gibt die Ausgaben aus.
	 * Dies erfolgt in einer Schleife, die so oft durchlaufen wird, wie der Benutzer eingegeben hat.
	 * @param numberOfOutputs
	 */
	private static void printBasedOnUserInput(int numberOfOutputs) {
		for (int i = 1; i <= numberOfOutputs; i++) {
			System.out.print("Output number ");
			System.out.print(i);
			System.out.print(": Hello World!");
		}
	}
}
