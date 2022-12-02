package session07.solution;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private double overdraftLimit;

    public BankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void printInfo() {
        System.out.println("Accountnumber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }

    // TODO Aufgabe 1: printAnnouncedDebits, soll den aktuellen Kontostand und die angekündigten Abbuchungen ausgeben
    void printAnnouncedDebits(double[] announcedDebits) {
        System.out.println("Balance: " + this.balance);
        for (double debit : announcedDebits) {
            System.out.println("       - " + debit);
        }
    }
    
    // TODO Aufgabe 2: checkAnnouncedDebitsCovered, soll überprüfen, ob alle angekündigten Abbuchungen gedeckt sind
    boolean checkAnnouncedDebitsCovered(double[] announcedDebits) {
        double debitSum = 0;
        for (double debit : announcedDebits) {
            debitSum = debitSum + debit;
        }
        return debitSum <= this.calculateWithdrawLimit();
    }

    /*
     * TODO Aufgabe 3: transferAnnouncedDebits, soll die angekündigten Abbuchungen ausführen, wenn das Konto ausreichend gedeckt ist
     * Hierbei soll das jeweilige Zielkonto aus dem targetsAccounts Array verwendet werden.
     * (announcedDebits[i] soll auf das Zielkonto targetAccounts[i] überwiesen werden)
     */
    void transferAnnouncedDebits(double[] announcedDebits, BankAccount[] targetAccounts) {
        // ausgeben der angekündigten Abbuchungen
        this.printAnnouncedDebits(announcedDebits);

        // ausführen der angekündigten Abbuchungen, wenn das Konto ausreichend gedeckt ist
        if (this.checkAnnouncedDebitsCovered(announcedDebits)) {
            for (int i = 0; i < announcedDebits.length; i++) {
                this.transferChecked(announcedDebits[i], targetAccounts[i]);
            }
        } else {
            System.out.println("Announced Debits not transferred.");
        }
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void transfer(double amount, BankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    double calculateWithdrawLimit() {
        return this.balance + this.overdraftLimit;
    }

    void transferChecked(double amount, BankAccount to) {
        if (this.calculateWithdrawLimit() >= amount) {
            this.transfer(amount, to);
        } else {
            System.out.println("Überweisung fehlgeschlagen: Konto nicht ausreichend gedeckt.");
        }

    }

    public static void main(String[] args) {

        BankAccount aliceAccount = new BankAccount(1, 1000.0, 0.0);
        BankAccount johnAccount = new BankAccount(2, 1000.0, 0.0);
        BankAccount bobAccount = new BankAccount(3, 1000.0, 2000.0);
        double[] announcedDebits =  new double[]{100.0,1000.0, 200.0 };
        BankAccount[] targetAccounts = new BankAccount[]{aliceAccount, aliceAccount, johnAccount};
        bobAccount.printAnnouncedDebits(announcedDebits);
        System.out.println("All announced debits are covered: " + bobAccount.checkAnnouncedDebitsCovered(announcedDebits));
        bobAccount.transferAnnouncedDebits(announcedDebits, targetAccounts);
        aliceAccount.printInfo();
        johnAccount.printInfo();
        bobAccount.printInfo();


    }

}
