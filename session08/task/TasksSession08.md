# Aufgaben zu Session08
## Aufgabe 1 - Vererbung einbauen
Betrachten Sie die Klassen `Employee`, `Student` und `Teacher`. Diese teilen sich eine Reihe an gemeinsamen Attributen und Methoden. Lagern Sie in einem ersten Schritt alle gemeinsamen Attribute und Methoden in eine Oberklasse `Person` aus.

Lassen Sie anschleßend alle der 3 Klassen von der von Ihnen definierten Basisklasse `Person` erben.

Instanziieren Sie anschließend Testweise alle Klassen in der Main-Methode der `Main`-Klasse.

## Aufgabe 2 - Methoden vereinfachen
Nachdem `Employee`, `Student` und `Teacher` nun von der gleichen Basisklasse `Person` erben: Gibt es eine Möglichkeit, die Implementierungen der `sayHelloTo`-Methoden zu kürzen? Falls ja, warum funktioniert dies?

## Aufgabe 3 - Methoden überladen
Überladen Sie die sayHelloTo-Methoden in den Klassen `Employee`, `Student` und `Teacher`. Der Employee soll anschließend neben "Hallo" auch seine Abteilung bekannt geben. Der Student soll neben "Hallo" das eigene Studienfach ausgeben. Zu guter Letzt soll der Teacher sein Lehrfach ausgeben.

Beispiele:
* `Employee`: Hello, my name is John Doe and I'm working in Sales.
* `Teacher`: Hello, my name is John Doe and I'm teaching Computer Science.
* `Student`: Hello, my name is John Doe and I'm studying Business Informatics.

Nutzen Sie hierfür die `@Override`-Annotation in den Kindklassen.

Testen Sie anschließend Ihre Implementierung in der Main-Methode der `Main`-Klasse.

## Aufgabe 4 - Abstrakte Klassen
Angenommen, es gäbe keine Person ohne irgendeine Profession in Ihrem Datenmodell. Deklarieren Sie die Klasse `Person`, sowie die sayHelloTo-Methode, als `abstract`.
Nehmen Sie danach die notwendigen Änderungen in den Kindklassen vor.