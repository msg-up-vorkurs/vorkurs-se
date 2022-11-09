# Cheatsheet Sichtbarkeiten, bedingte Verzweigungen
## Sichtbarkeiten
### Sichtbarkeitsmodifier

"Datenkapselung" (oder "Geheimnisprinzip") bedeutet, dass der Lese- und Schreibzugriff auf in Klassen gehaltenen Daten nicht direkt, sondern über zuvor definierte Schnittstellen erfolgen soll.

Die Möglichkeit zum direkten Zugriff auf Klassen, Variablen und Methoden kann in Java mittels verschiedener Schlüsselwörter gesteuert werden:

| Schlüsselwort | Bedeutung                                                                                                                                                                           |
|---------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public        | Die Klasse, Variable oder Methode ist öffentlich, d.h. von überall aus sichtbar und aufrufbar.                                                                                      |
| "nichts"      | Die Klasse, Variable oder Methode ist "package-private", d.h. sie ist nur im gleichen Package (d.h. wenn aufrufende Java-Dateien im gleichen Ordner liegen) sichtbar und aufrufbar. |
| private       | Die Klasse, Variable oder Methode ist privat. Sie kann nur innerhalb der Klasse aufgerufen werden. Von anderen Klassen sind sie weder sicht- noch aufrufbar.                        |

**Beispiel Bankkonto:**

Ein Bankkonto hat einen Kontostand, der nicht von außen manipuliert werden soll. Stattdessen sollen zum Geldtransfer ausschließlich die Methoden `withdraw(double amount)` und `deposit(double amout)` verwendet werden. Der direkte Zugriff auf den Kontostand von außen kann mit `private` unterbunden werden.

**BankAccount.java:**
```java
public class BankAccount {
    private double balance;
    private double overdraftLimit;

    public BankAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        ...
    }

    public void deposit(double amount) {
        ...
    }
}
```
**Application.java:**
```java
public class Application {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        account.withdraw(5000.0); // Kontostand ist jetzt 0.0

        // Compiler wirft hier Fehler.
        // "balance"-Variable ist "private", d.h. nicht von
        // der Application-Klasse aus sichtbar.
        konto.balance = 5000.0; 
    }
}
```

### Getter
Um mit `private` markierte Variablen trotzdem lesbar zu machen, gibt es in Java Getter. Getter sind einfache, typischerweise mit `public` markierte Methoden, die den Wert einer Variable zurückgeben. Der Rückgabetyp ist dabei immer gleich mit dem der Variable. Konventionell werden Getter nach folgendem Schema benannt:

"get", gefolgt vom Variablennamen in [Camel Case](https://de.wikipedia.org/wiki/Binnenmajuskel).

**Beispiel:**

```java
public double getBalance() {
    return this.balance;
}
```

### Setter
Um mit `private` markierte Variablen schreibbar zu machen, gibt es in Java Setter. Setter sind - wie Getter - typischerweise mit `public` markierte Methoden. Sie unterscheiden sich dadurch von Gettern, dass sie keine Variablen lesen, sondern schreiben. Der Rückgabetyp der Methode ist dabei `void`. Zudem besitzt ein Setter genau einen Parameter: Den zu setzenden Wert für die Variable innerhalb der Instanz. Konventionell werden Setter nach folgendem Schema benannt:

"set", gefolgt vom Variablennamen in [Camel Case](https://de.wikipedia.org/wiki/Binnenmajuskel).

**Beispiel:**

```java
public double setOverdraftLimit(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
}
```

## Bedingte Verzweigungen
Bedingte Verzweigungen emöglichen es, dass bestimmte Codeblöcke nur dann ausgeführt werden, wenn bestimmte Bedingungen erfüllt sind.

### Aufbau von if-Abfragen:
```java
if (condition) {
    System.out.println("Die Bedingung ist wahr!");
    System.out.println("Die zweite Bedingung etwas weiter unten könnte es auch sein.");
    System.out.println("Aber das wird nicht mehr überprüft.");
} else if (condition2) {
    System.out.println("Die zweite Bedingung ist wahr!");
} else {
    System.out.println("Keine der beiden Bedingungen ist wahr.");
}
```

Der oberste Block mit `if` muss verpflichtend existieren. Die Zweige mit `else if` und `else` sind optional. `if` und `else` dürfen nur ein einziges Mal auf der gleichen Ebene vorkommen. In der Mitte darf es beliebig viele `else if`-Abfragen geben. if-Abfragen können geschachtelt werden.

Bedingungen besitzen den `boolean`-Datentyp, d.h. sie sind entweder `true` (wahr) oder `false` (unwahr). Sie können mit relationalen und logischen Operatoren definiert werden.

### Relationale Operatoren
Relationale Operatoren erlauben es, Variablen miteinander zu vergleichen:

* equal to ("ist gleich"): ```==```
* not equal to: ("ist nicht gleich") ```!=```
* greater than ("größer als"): ```>```
* less than: ("kleiner als") ```<```
* greater than or equal to ("größer gleich"): ```>=```
* less than or equal to ("kleiner gleich"): ```<=```

**Beispiele:**
```java
3 == 4 // false
3 == 3 // true
3 != 4 // true
3 > 4 // false
3 < 4 // true
3 < 3 // false
3 <= 3 // true
```

### Logische Operatoren
Mit logischen Operatoren können Wahrheitswerte von Bedingungen umgekehrt (NOT) und zwei Wahrheitswerte kombiniert (AND, OR, XOR) werden:

* NOT: ```!``` ("kehre Wahrheitswert um")
* AND: ```&``` ("beide Bedingungen müssen wahr sein")
* OR:  ```|``` ("eine der beiden Bedingungen muss wahr sein, oder beide")
* XOR: ```^``` ("eine der beiden Bedingungen muss wahr sein, aber nicht beide")

**Beispiele für NOT:**
```java
!true // false
!false // true
!(3 == 4) // true (da 3 == 4 => false)
```

**Beispiele für AND, OR, XOR:**
```java
true & true // true
        true & false // false
        (3 < 4) & (10 > 5) // true
        (5 == 4) & true // false

        true | false // true
        false | false // false
        (3 < 4) | (900 >= 1000) // true
        false | (900 >= 1000) // false

        true ^ true // false
        true ^ false // true
        (3 < 4) | (900 <= 1000) // false
        (3 < 4) | (900 >= 1000) // true
```

### Wahrheitstabelle
Die folgende Wahrheitstabelle zeigt die verschiedenen Ergebnisse an, die erzielt werden können, wenn mit den Operatoren AND, OR und XOR zwei Bedingungen kombiniert werden.

| 1. Bedingung | 2. Bedingung | AND & | OR \| | XOR ^ |
|--------------|--------------|-------|-------|-------|
| True         | True         | True  | True  | False |
| True         | False        | False | True  | True  |
| False        | True         | False | True  | True  |
| False        | False        | False | False | False |
