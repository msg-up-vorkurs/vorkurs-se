# Cheatsheet Variablen
## Datentypen
| Name    | Beschreibung                                                    | Beispiel       |
|---------|-----------------------------------------------------------------|----------------|
| boolean | Wahrheitswert (true oder false)                                 | true           |
| byte    | min: -128, max: 127                                             | 7              |
| short   | min: -32.768, max: 32.767                                       | 2022           |
| int     | min: -2.147.483.648, max: 2.147.483.647                         | 54321          |
| long    | min: −9.223.372.036.854.775.808, max: 9.223.372.036.854.775.807 | 10987654321    |
| float   | 32-bit/4-byte floating point                                    | 2.022          |
| double  | 64-bit/8-byte floating point                                    | 2.022F         |
| char    | Repräsentiert ein Unicode Zeichen                               | 'a'            |
| String  | Zeichenkette                                                    | "Hello World!" |

## Zuweisung
Um einer Variable einen Wert zuzuweisen, muss diese zuerst mit Datentyp und Namen intialisert werden
```java
int testwert;
```
Daraufhin kann in dieser ein Wert gespeichert werden
```java
testwert = 1;
```
Initialisierung und Zuweisung können auch in einer Zeile passieren
```java
int testwert = 1;
String hw = "Hello World!";
```

Um Werte zu berechnen oder zusammenzufügen können arithmetische Operatoren verwendet zu werden
```java
int summe = 1 + 2;
int multiplikation = 3 * 2;
int division = 4 / 2;
```
Die gespeichtern Werte des oberen Codeblocks sind dann summe=3, multiplikation=6, division=2.