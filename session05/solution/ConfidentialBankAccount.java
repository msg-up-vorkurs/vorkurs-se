package session05.solution;

public class ConfidentialBankAccount {

    // TODO Aufgabe 1: Sichtbarkeitsmodifikatoren ändern
    private int accountNumber;
    private double balance;
    private double overdraftLimit;

    public ConfidentialBankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    // TODO Aufgabe 1: Methoden zum Auslesen der Attribute implementieren
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // TODO Aufgabe 1: Methode zum Setzen von overdraftLimit implementieren
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void printInfo() {
        System.out.println("Accountnumber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }


    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void transfer(double amount, ConfidentialBankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    /*
     * TODO Aufgabe 2: calculateWithdrawlimit
     * Für das Auszahlungslimit wird sowohl der Kontostand als auch das Kreditlimit berücksichtigt
     */

    double calculateWithdrawLimit() {
        return this.balance + this.overdraftLimit;
    }

    /*
     * TODO Aufgabe 2: transferChecked
     * Vor jeder Überweisung soll sichergestellt werden,
     * ob der Betrag unter Einhaltung des Kreditlimits abgebucht werden kann.
     */

    void transferChecked(double amount, ConfidentialBankAccount to) {
        if (this.calculateWithdrawLimit() >= amount) {
            this.transfer(amount, to);
        } else {
            System.out.println("Überweisung fehlgeschlagen: Konto nicht ausreichend gedeckt.");
        }

    }

}
