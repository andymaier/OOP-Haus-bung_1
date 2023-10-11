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

Der Compiler wird Fehler entdecken. Beheben Sie diese, indem Sie die Hinweise beachten, die Ihnen Eclipse liefert. Starten Sie das Programm anschließend erneut.

Testen Sie das Programm mit verschiedenen Eingabewerten. Können Sie Fehlfunktionen entdecken? Versuchen Sie, die Funktion des Programms möglichst genau zu beschreiben. Lesen Sie sich den Programmcode durch (innerhalb der main-Methode). Können Sie (ungefähr) identifizieren, was wo gemacht wird? Experimentieren Sie, indem Sie den Programmcode in der main-Methode leicht ändern und sich das Ergebnis nach erneutem Ausführen ansehen.

Abzugeben ist ein kompilierbares und korrektes Programm. Ergänzen Sie dieses um Java-Kommentare mit einer kurzen Funktionsbeschreibung des Programms. ```

Check:
- Compiler hat keine Fehler -> OK
- Fehlfunktion? -> OK, das war wahrscheinlich der falsche Datentyp
- Funktion des Programms beschreiben -> das habe ich den Javadocs gemacht

Optimierungen: 
- Formatierung war nicht ganz korrekt. siehe Aufgabe 1 Klassen
- einzelne Methoden rausgezogen für eine bessere Strukturierung
- Abkürzung ausgeschrieben Out -> System.out...
- Abkürzung ausgeschrieben In -> System.in...
- Exception bei System.in... hinzugenommen für die Methoden Signatur
- Java Kommentare -> über die Methoden hinzugefügt.
- Test Klasse hinzugefügt mit einer Maven Projektstruktur. Maven ist ein Abhängigkeitstool wie npm in javascript. maven strukturiert auch das Projekt an sich. Die Strutkr eines mavenn projekts ist dann so:

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