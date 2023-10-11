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



public class Aufgabe1 {

	public static void main(String[] args) {
		int numberOfOutputs;
		Out.print ("Please enter the number of outputs: ");
		numberOfOutputs = In.readInt();
		for (int i = 1; i <= numberOfOutputs; i++) {
		Out.print("Output number ");
		Out.print(i);
		Out.println(": Hello World!");
	   } // for
	  } // main
	 } // MyFirstProgram
