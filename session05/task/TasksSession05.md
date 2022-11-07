# Aufgaben zu Session05

## Aufgabe 1: Bankkonto Sichtbarkeitsmodifikatoren

Das Bankkonto soll von Veränderungen von außen geschützt werden. Führen Sie folgende Anpassungen in der Klasse **ConfidentialBankAccount** aus.

* Da die *accountNumber* für ein Konto immer gleich bleiben soll, soll die Deklaration so angepasst werden, damit sie von außen nicht mehr Sichtbar ist. Damit sie trotzdem noch ausgelesen werden kann, soll eine Getter Methode hinzugefügt werden.
* *balance* soll von außen nur noch über die bereits implementierten Methoden verändert werden dürfen. Passen Sie die Deklaration an und erstellen Sie eine Methode, die das Auslesen des Kontostands erlaubt.
* Auf die Variable *overdraftLimit* soll ebenfalls nicht direkt zugegriffen werden dürfen. Passen Sie die Deklaration entsprechend an und erstellen Sie eine *Getter* und eine *Setter* Methode für diese Variable.
* Aktualisieren Sie die *ConfidentialBankAccountTest* Klasse, sodass diese statt direkten Zugriffen die von Ihnen neu implementierten Getter verwendet.

## Aufgabe 2: Bankkonto Verzweigung

Bei der aktuellen Implementierung von *transfer* wird die Überweisung ohne Rücksicht auf das Kreditlimit des Bankkontos durchgeführt. Um die Überweisung nur dann durchzuführen, wenn es der Kontostand und das Kreditlimit erlauben, soll eine neue Methode **transferChecked** in der Klasse **ConfidentialBankAccount** angelegt werden.
Um die Methode **transferChecked** einfacher implementieren zu können, legen Sie zunächst die Methode **calculateWithdrawLimit** an, die das Auszahlungslimit des Kontos berechnet und zurückgibt.

Implementieren Sie diese Methode mithilfe von bedingten Verzweigungen.

## Aufgabe 3: Verschachtelte Verzweigungen

Mithilfe von einfachen Regeln sollen schon vor den aufwendigen und genauen Kreditprüfungen die Anträge aussortiert werden.

Um einen Kredit zu erhalten, muss die antragstellende Person einen Wohnsitz in Deutschland angemeldet haben, volljährig sein und über ein geregeltes Einkommen verfügen. Zusätzlich muss eine Bonitätsbewertung von mindestens 70 vorliegen. Bei einer Kreditsumme von über 100.000€ darf die Bewertung nicht unter 80 liegen.

Die **rateCredit** Methode in der **Bank** Klasse soll anhand dieser Regeln bewerten, ob ein Kredit infrage kommt oder nicht. Kommt ein Kredit infrage, soll die Methode *true* zurückgegeben, andernfalls *false*.


**Erweiterung der Regeln:**
Ab dem frühestmöglichen Renteneintrittsalter (hier vereinfacht das 63. Lebensjahr) wird zusätzlich eine für die Kreditsumme ausreichende Sicherheit gefordert, um einen Kredit zu erhalten.
Passen Sie die Methode **rateCredit** an, damit diese auch die neue Regel berücksichtigt.


## Aufgabe 4: RobotHoover Mopping Switch

Ein Staubsaugerroboter erkennt selbständig, auf welchem Bodenbelag er sich gerade befindet. Diese Information soll in der Methode **moppingAllowed** genutzt werden, um zu entscheiden, ob gewischt werden darf oder nicht. Auf gefliesten Böden und Parkettböden darf gewischt werden, auf Teppichböden jedoch nicht. Auf allen anderen Bodenbelägen wird sicherheitshalber auch auf das Wischen verzichtet.

Vervollständigen Sie die Methode **moppingAllowed** mithilfe eines Switch-Case-Blocks, sodass die genannten Regeln eingehalten werden.

## Aufgabe 5: RobotHoover Charging-Action Switch

Der Staubsaugerroboter soll abhängig von seinem Ladestand die aktuelle Ladeaktion ausgeben. Für diese Funktionalität ist bereits die Methode **chargingAction** mithilfe von if-Statements implementiert.

Implementieren Sie die Methode **chargingActionSwitch**, indem sie die Methode **chargingAction** in switch-Statements übertragen.