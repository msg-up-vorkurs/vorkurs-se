package session03.task;

public class BankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;

    public BankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    // TODO Aufgabe 3: printInfo, soll Accountnumber und Balance mit System.out.println() ausgeben
    void printInfo() {

    }

    // TODO Aufgabe 3: deposit, soll einen Betrag auf dem Konto gutschreiben
    void deposit(double amount) {

    }

    // TODO Aufgabe 3: withdraw, soll einen Betrag vom Konto abbuchen


    /*
     * TODO Aufgabe 3: transfer, soll einen Betrag vom Start- zum Zielkonto transferieren
     * Welche Objekte und Werte werden für eine Überweisung benötigt?
     * Welche Parameter braucht die Methode?
     * Kann man bereits implementierte Methoden nutzen?
     */



    public static void main(String[] args) {

        BankAccount aliceAccount = new BankAccount(1, 18000.0, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        // TODO Aufgabe 3: Ausführen der implementierten Methoden und Kontrollieren der Veränderungen mithilfe von printInfo()


    }
}
