package session05.solution;

public class ConfidentialBankAccountTest {

    static int richtig = 0;
    static int falsch = 0;

    public static void main(String[] args) {

        // Aufgabe 2: Uncomment Tests after implementing transferChecked
        testCalculateWithdrawLimit();
        testTransferChecked();
        testTransferCheckedNoTransfer();

        System.out.println("Bestandene Tests: " + richtig);
        System.out.println("Fehlgeschlagene Tests: " + falsch);
    }


    static void testCalculateWithdrawLimit() {

        ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1, 18000, 2000.0);
        ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2, 10000.0, 0.0);

        double aliceExpected = 20000.0;
        double aliceActual = aliceAccount.calculateWithdrawLimit();

        if (aliceExpected == aliceActual)
            richtig++;
        else {
            falsch++;
            System.out.println("testCalculateWithdrawLimit()");
            System.out.println("Alice's Withdraw Limit (IST): " + aliceActual);
            System.out.println("Alice's Withdraw Limit (SOLL): " + aliceExpected + "\n");
        }
    }

    static void testTransferChecked() {

        ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1, 18000, 2000.0);
        ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2, 10000.0, 0.0);

        aliceAccount.transferChecked(2000.0, bobAccount);

        double aliceExpected = 16000.0;
        double aliceActual = aliceAccount.getBalance();
        double bobExpected = 12000.0;
        double bobActual = bobAccount.getBalance();

        if (aliceExpected == aliceActual && bobExpected == bobActual)
            richtig++;
        else {
            falsch++;
            System.out.println("testTransferChecked()");
            System.out.println("Alice's Konto (IST): " + aliceActual);
            System.out.println("Bob's Konto (IST): " + bobActual);
            System.out.println("Alice's Konto (SOLL): " + aliceExpected);
            System.out.println("Bob's Konto (SOLL): " + bobExpected + "\n");
        }
    }

    static void testTransferCheckedNoTransfer() {

        ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1, 18000, 2000.0);
        ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2, 10000.0, 0.0);

        aliceAccount.transferChecked(21000.0, bobAccount);

        double aliceExpected = 18000.0;
        double aliceActual = aliceAccount.getBalance();
        double bobExpected = 10000.0;
        double bobActual = bobAccount.getBalance();

        if (aliceExpected == aliceActual && bobExpected == bobActual)
            richtig++;
        else {
            falsch++;
            System.out.println("testTransferCheckedNoTransfer()");
            System.out.println("Alice's Konto (IST): " + aliceActual);
            System.out.println("Bob's Konto (IST): " + bobActual);
            System.out.println("Alice's Konto (SOLL): " + 18000.0);
            System.out.println("Bob's Konto (SOLL): " + 10000.0 + "\n");
        }
    }

}
