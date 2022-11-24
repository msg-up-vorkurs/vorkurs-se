# Aufgaben zu Session07

## Aufgabe 1: Konsolenausgabe der angekündigten Abbuchungen

Implementieren Sie eine Methode **printAnnouncedDebits**, die den aktuellen Kontostand sowie die angekündigten Abbuchungen auf der Konsole ausgibt. Die angekündigten Abbuchungen sollen als Parameter an die Methode übergeben werden.

## Aufgabe 2: Deckung der angekündigten Abbuchungen prüfen

Die Methode **checkAnnouncedDebitsCovered** soll überprüfen, ob alle angekündigten Abbuchungen gemeinsam (werden als Parameter übergeben) unter Einhaltung des Auszahlungslimits ausgeführt werden können. 

Die Methode soll **true** zurückgeben, wenn es möglich ist, dass alle Abbuchungen innerhalb der Kontolimits erfolgen. Andernfalls soll **false** zurückgegeben werden. (Nutzen Sie hierfür die Methode *calculateWithdrawLimit*.)

## Aufgabe 3: Ausführen der angekündigten Abbuchungen

Die Methode **transferAnnouncedDebits** soll zuerst **printAnnouncedDebits** ausführen und danach alle angekündigten Abbuchungen ausführen d.h. der abzubuchende Betrag soll auf das zugehörige Zielkonto überwiesen werden. 

Die Überweisungen sollen nur dann ausgeführt werden, wenn sichergestellt ist, dass das Konto innerhalb der Limits bleibt (checkAnnouncedDebitsCovered). Eine teilweise Ausführung der angekündigten Abbuchungen soll nicht erfolgen. 
 