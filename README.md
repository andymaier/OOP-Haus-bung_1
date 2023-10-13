# Aufgabe 1: Abtippen und Korrigieren eines Programms (8 Punkte)

Ziel der 1. Aufgabe ist es, mit der Eclipse IDE vertraut zu werden. Tippen Sie das Java-Programm `MyFirstProgram` ab und führen Sie es aus. Gehen sie dabei so vor wie im Foliensatz zur ersten Übungsstunde erklärt.

```java
public class MyFirstProgram {
    public static void main(String[] args) {
        integer numberOfOutputs;
        Out.print("Please enter the number of outputs: ");
        numberOfOutpts = In.readInt();
        for (int i = 1; i < nrOfOutputs; i++) {
            Out.print("Output number ");
            Out.print(j);
            Out.println(": Hello World!");
        } // for
    } // main
} // MyFirstProgram
```

Der Compiler wird Fehler entdecken. Beheben Sie diese, indem Sie die Hinweise beachten, die Ihnen Eclipse liefert. Starten Sie das Programm anschließend erneut.

Testen Sie das Programm mit verschiedenen Eingabewerten. Können Sie Fehlfunktionen entdecken? Versuchen Sie, die Funktion des Programms möglichst genau zu beschreiben. Lesen Sie sich den Programmcode durch (innerhalb der main-Methode). Können Sie (ungefähr) identifizieren, was wo gemacht wird? Experimentieren Sie, indem Sie den Programmcode in der main-Methode leicht ändern und sich das Ergebnis nach erneutem Ausführen ansehen.

Abzugeben ist ein kompilierbares und korrektes Programm. Ergänzen Sie dieses um Java-Kommentare mit einer kurzen Funktionsbeschreibung des Programms. ```

##Check:
- Compiler hat keine Fehler -> OK
- Fehlfunktion? -> OK, das war wahrscheinlich der falsche Datentyp
- Funktion des Programms beschreiben -> das habe ich den Javadocs gemacht

##Optimierungen: 
- Formatierung war nicht ganz korrekt. siehe Aufgabe 1 Klassen
- einzelne Methoden rausgezogen für eine bessere Strukturierung
- Abkürzung ausgeschrieben Out -> System.out...
- Abkürzung ausgeschrieben In -> System.in...
- Exception bei System.in... hinzugenommen für die Methoden Signatur
- Java Kommentare -> über die Methoden hinzugefügt.
- Test Klasse hinzugefügt mit einer Maven Projektstruktur. Maven ist ein Abhängigkeitstool wie npm in javascript. maven strukturiert auch das Projekt an sich. Die Strutkr eines mavenn projekts ist dann so:

```java
.
├── Ablaufdiagramm und Testfälle.pdf
├── Aufgaben.pdf
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── judy
    │               ├── Aufgabe1.java
    │               ├── Aufgabe2.java
    │               ├── Aufgabe2Test.java
    │               ├── In.java
    │               └── Out.java
    └── test
        └── java
            └── com
                └── judy
                    └── Aufgabe1Test.java
```

# Aufgabe 2: Kalkulation (16 Punkte)

**Implementieren Sie ein Programm zur Angebotserstellung für ein Hotel.** Das Angebot soll die **Buchungsdaten** (Anzahl der Personen, Anzahl der Übernachtungen und Anzahl der bestellten Mahlzeiten pro Tag) sowie die Preise, die sich daraus errechnen, enthalten.

Das Hotel hat ausschließlich Doppelzimmer und berechnet den Preis pro Zimmer. Der Normalpreis für ein Doppelzimmer beträgt 120 Euro pro Übernachtung. Für jede volle Woche, die ein Zimmer gebucht wird, gibt es einen Rabatt von 10% auf die Übernachtungspreise der ganzen Woche. Der Kunde kann 0-3 Mahlzeiten pro Tag buchen, wobei die ersten beiden Mahlzeiten jeweils 25 Euro kosten, die dritte Mahlzeit kostet nur mehr 10,50 Euro.

## Gliedern Sie Ihr Programm wie folgt in Eingabe, Berechnung und Ausgabe:

### Eingabe:
Lesen Sie folgende Buchungsdaten ein:
- Anzahl der Personen
- Anzahl der Übernachtungen
- Anzahl der Mahlzeiten pro Tag

### Berechnung:
Berechnen Sie folgende Werte:
- Anzahl der benötigten Doppelzimmer
- Anzahl der Übernachtungen zum vollen Zimmerpreis
- Anzahl der Übernachtungen zum reduzierten Wochenrabatt-Zimmerpreis
- Anzahl der Mahlzeiten um 25 Euro
- Anzahl der Mahlzeiten um 10,50 Euro
- Teilsumme für die Übernachtungen zum vollen Zimmerpreis
- Teilsumme für die Übernachtungen zum reduzierten Wochenrabatt-Zimmerpreis
- Teilsumme für die Mahlzeiten um 25 Euro
- Teilsumme für die Mahlzeiten um 10,50 Euro
- Gesamtkosten für alle Übernachtungen und Mahlzeiten

### Ausgabe:
Geben Sie folgende Werte aus:
- Buchungsdaten
- Teilsummen (je eine Zeile)
- Gesamtkosten

**Verwenden Sie nur den Datentyp int. Implementieren Sie Ihr Programm ohne Verzweigungen und Schleifen. Verwenden Sie die arithmetischen Operatoren +, -, *, /, und %.**

Testen Sie das Programm mit unterschiedlichen Eingaben. Abzugeben sind:
1. Ein Ablaufdiagramm (PDF)
2. Das Java-Programm (Eclipse-Projekt)
3. Die Ausgaben des Programms bei unterschiedlichen Eingaben (PDF)

##Check:

- Ich habe eine Testklasse dafür erstellt.

##Optimierungen: 

- Ich habe mal die Aufgabe2.java etwas strukturiert.
- Der Ablauf ist nun in der Main Methode.
- Die Eingabe, Berechnung und Ausgabe sind voneinander getrennt.
- Es gibt Model Klassen die die Daten halten. Damit ist der Ablauf (Main Methode + zugehörige Funktionen) und
Daten ResultData, InputData getrennt voneinander.