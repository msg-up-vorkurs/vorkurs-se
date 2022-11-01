# Cheatsheet Klassen, Objekte, Konstruktoren und Methoden
## Klassen

Klassen definieren die "Schablone" für im Programm zu erstellende Objekte. In der Klasse werden somit alle "Fähigkeiten" der Objekte festgelegt.

```java
public class Person {
    
    // Klassenvariablen
    
    // Konstruktor(en)
    
    // Methoden
}
```

## Objekte / Instanzen

Objekte (Instanzen) werden mit dem Schlüsselwort `new` entsprechend der Vorgabe aus der Klassendefinition erzeugt und selbst in Variablen gespeichert.

```java
Person bob = new Person();
```

## Konstruktoren

Konstruktoren werden bei Erzeugung eines Objekts ausgeführt. Ihr Name muss dem Klassennamen entsprechen. Konstruktoren können Parameter erhalten, die beim Aufruf übergeben werden müssen.
Zur Vermeidung von Namenskonflikten beim Zugriff auf Variablen der Klasse (Klassenvariablen) kann das Schlüsselwort `this` verwendet werden.

```java
public class Person {
    
    String firstName;
    String lastName;
    int age;
 
    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
```

## Methoden

Methoden dienen dazu, den Quellcode besser zu strukturieren und ggf. Wiederverwendung zu ermöglichen.

### Definition einer Methode

Methoden werden in Java in einer Klasse definiert. Sie können Parameter erhalten und einen Rückgabewert liefern. Falls die Methode keinen Rückgabewert liefert, wird sie mit dem Rückgabetyp `void` spezifiziert.

```java
public class Person {

    String firstName;
    String lastName;
    double height;
    double weight;
    
    // Konstruktor(en)

    void sayHello() {
        System.out.println("Hello, my name is " + this.firstName + " " + this.lastName + "!");
    }

    float calculateBMI() {
        return this.weight / (this.height * this.height);
    }
}
```

### Aufruf einer Methode

Der Aufruf einer Methode erfolgt immer im Bezug auf das Objekt, dessen Klasse die Methode definiert.

```java
Person bob = new Person("Bob", "Doe", 26);
bob.sayHello(); // Ausgabe: "Hello, my name is Bob Doe!"
double bmi = bob.calculateBMI(); // Speichert das Ergebnis von "calculateBMI" in der Variable "bmi"
```
