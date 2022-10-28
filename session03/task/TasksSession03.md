# Aufgaben zu Session03

## Aufgabe 1: Bankkonto

Für eine Bank soll ein Programm zur Kontenverwaltung entwickelt werden. Als ersten Schritt muss die Struktur der Konten festgelegt werden. Erstellen Sie hierfür zunächst die Klasse **MyBankAccount**.
Welche Eigenschaften hat ein Bankkonto? Legen Sie 5 passende Attribute (z.B. Kontonummer, Kontostand) an.

## Aufgabe 2: Konstruktor

Um sicherzustellen, dass alle neuen Konten korrekt angelegt werden, soll die Klasse *MyBankAccount* um einen Konstruktor ergänzt werden.
Der Konstruktor soll alle Attribute mit einem geeigneten Wert initialisieren.

Ist es bei jedem Attribut sinnvoll, den Wert mit einem Parameter zu übergeben?

Erzeugen Sie anschließend mithilfe des Konstruktors eine neue *MyBankAccount*-Instanz und geben Sie die Werte aller Attribute in der Konsole aus.

## Aufgabe 3: Bankkonto Methoden

Für die gegebene Klasse *BankAccount* soll das Verhalten des Kontos beim Einzahlen und Abbuchen festgelegt werden. 

* Zu Beginn soll eine Methode **printInfo()** für die Ausgabe der Kontoinformationen ergänzt werden. Führen Sie diese Methode anschließend mit den in der *main()* gegebenen Objekten aus.
* Erstellen Sie für die Aktionen 'Einzahlen' und 'Abbuchen' die Methoden **deposit** und **withdraw**. Führen Sie anschließend die Methoden mit den in der *main()* gegebenen Objekten aus und überprüfen Sie die Aktualisierungen mit *printInfo*.
* Damit beim Überweisen keine Fehler passieren, soll eine weitere Methode **transfer** ergänzt werden. 

  Diese Methode soll sicherstellen, dass der abgebuchte Betrag vom Startkonto auch in gleicher Höhe auf dem Zielkonto eingezahlt wird.

  Welche Objekte und Werte braucht man, um eine Überweisung durchzuführen?
    
  Kann man bereits implementierte Methoden nutzen?

  Führen Sie anschließend die Methode mit den in der *main()* gegebenen Objekten aus und überprüfen Sie die Aktualisierungen mit *printInfo*.


## Aufgabe 4: Bankkonto Tests

Um die neu implementierten Methoden auf Fehler zu überprüfen, sollen sie mit Unit-Tests getestet werden. Es soll jeweils ein Test für die Methoden *deposit*, *withdraw* und *transfer*. 
* deposit: Zahlen Sie im *when*-Block mithilfe der *deposit*-Methode einen Betrag in eines der Konten ein und überprüfen Sie die Veränderung des Kontostands im *then*-Block.
* withdraw: Buchen Sie im *when*-Block mithilfe der *withdraw*-Methode einen Betrag von einem der Konten ab und überprüfen Sie die Veränderung des Kontostands im *then*-Block.
* transfer: Führen Sie *transfer* im *when*-Block aus. Was müssen Sie im *then*-Block alles überprüfen?


Nutzen Sie dazu die gegebene Klasse *BankAccountTest*.

## Aufgabe 5: Bankkonto Sichtbarkeitsmodifikatoren

Das Bankkonto soll von Veränderungen von außen geschützt werden. Führen Sie folgende Anpassungen in den Klassen **ConfidentialBankAccount** und **ConfidentialBankAccountTest** aus.

* Da die *accountNumber* für ein Konto immer gleich bleiben soll, soll die Deklaration so angepasst werden, damit sie von außen nicht mehr Sichtbar ist. Damit sie trotzdem noch ausgelesen werden kann, soll eine Getter Methode hinzugefügt werden.
* *balance* soll von außen nur noch über die bereits implementierten Methoden verändert werden dürfen. Passen Sie die Deklaration an und erstellen Sie eine Methode, die das Auslesen des Kontostands erlaubt. 
* Auf die Variable *overdraftLimit* soll ebenfalls nicht direkt zugegriffen werden dürfen. Passen Sie die Deklaration entsprechend an und erstellen Sie eine *Getter* und eine *Setter* Methode für diese Variable.
* Durch die Veränderung der Sichtbarkeitsmodifikatoren müssen auch Anpassungen an allen Stellen vorgenommen werden, an denen direkt auf die Instanzvariablen zugegriffen wird. Passen Sie deshalb *ConfidentialBankAccountTest* an die Änderungen an, sodass die Tests wieder ausgeführt werden können. 


## Aufgabe 6: Bankkonto Verzweigung

Bei der aktuellen Implementierung von *transfer* wird die Überweisung ohne Rücksicht auf das Kreditlimit des Bankkontos durchgeführt. Um die Überweisung nur dann durchzuführen, wenn es der Kontostand und das Kreditlimit erlauben, soll eine neue Methode **transferChecked** in der Klasse **ConfidentialBankAccount** angelegt werden. 
Um die Methode **transferChecked** einfacher implementieren zu können, legen Sie zunächst die Methode **calculateWithdrawLimit** an, die das Auszahlungslimit des Kontos berechnet und zurückgibt. 

Implementieren Sie diese Methode mithilfe von bedingten Verzweigungen und überprüfen sie Ihre Implementierung mithilfe der gegebenen Tests in der Klasse **ConfidentialBankAccountTest**. 

## Aufgabe 7: Verschachtelte Verzweigungen

Mithilfe von einfachen Regeln sollen schon vor den aufwendigen und genauen Kreditprüfungen die Anträge aussortiert werden.

Um einen Kredit zu erhalten, muss die antragstellende Person einen Wohnsitz in Deutschland angemeldet haben, volljährig sein und über ein geregeltes Einkommen verfügen. Zusätzlich muss eine Bonitätsbewertung von mindestens 70 vorliegen. Bei einer Kreditsumme von über 100.000€ darf die Bewertung nicht unter 80 liegen.

Die **rateCredit** Methode in der **Bank** Klasse soll anhand dieser Regeln bewerten, ob ein Kredit infrage kommt oder nicht. Kommt ein Kredit infrage, soll die Methode *true* zurückgegeben, andernfalls *false*. Ihre Lösung können Sie mithilfe der gegebenen Tests in **BankTest** überprüfen. 


**Erweiterung der Regeln:**
Ab dem frühestmöglichen Renteneintrittsalter (hier vereinfacht das 63. Lebensjahr) wird zusätzlich eine für die Kreditsumme ausreichende Sicherheit gefordert, um einen Kredit zu erhalten. 
Passen Sie die Methode **rateCredit** an, damit diese auch die neue Regel berücksichtigt.
