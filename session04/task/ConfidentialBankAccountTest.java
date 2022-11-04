package session04.task;

public class ConfidentialBankAccountTest {

    static ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1, 18000, 2000.0);
    static ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2, 10000.0, 0.0);

    static int richtig = 0;
    static int falsch = 0;

    public static void main(String[] args) {
        testDeposit();
        testWithdraw();
        testTransfer();

        // Aufgabe 4: Uncomment Tests after implementing transferChecked
        // testCalculateWithdrawLimit();
        // testTransferCheckedNoTransfer();

        System.out.println("Bestandene Tests: " + richtig);
        System.out.println("Fehlgeschlagene Tests: " + falsch);
    }

    static void testDeposit() {
        double bobExpected = 11000.0;
        double bobActual = bobAccount.balance;

        bobAccount.deposit(1000);

        if (bobActual == bobExpected)
            richtig++;
        else {
            falsch++;
            System.out.println("testDeposit()");
            System.out.println("Bob's Konto (IST): " + bobActual);
            System.out.println("Bob's Konto (SOLL): " + bobExpected + "\n");
        }
    }

    static void testWithdraw() {
        double bobExpected = 9000.0;
        double bobActual = bobAccount.balance;

        bobAccount.withdraw(1000.0);

        if (bobActual == bobExpected)
            richtig++;
        else {
            falsch++;
            System.out.println("testWithdraw()");
            System.out.println("Bob's Konto (IST): " + bobActual);
            System.out.println("Bob's Konto (SOLL): " + bobExpected + "\n");
        }
    }

    static void testTransfer() {
        double aliceExpected = 12000.0;
        double aliceActual = aliceAccount.balance;
        double bobExpected = 16000.0;
        double bobActual = bobAccount.balance;

        aliceAccount.transfer(2000.0, bobAccount);

        if (aliceExpected == aliceActual && bobExpected == bobActual)
            richtig++;
        else {
            falsch++;
            System.out.println("testTransfer()");
            System.out.println("Alice's Konto (IST): " + aliceActual);
            System.out.println("Bob's Konto (IST): " + bobActual);
            System.out.println("Alice's Konto (SOLL): " + aliceExpected);
            System.out.println("Bob's Konto (SOLL): " + bobExpected + "\n");
        }
    }

    /*
     * Aufgabe 4: Uncomment Tests after implementing transferChecked
     */
    /*
    static void testCalculateWithdrawLimit() {
        double aliceExpected = 20000.0;
        double aliceActual = aliceAccount.calculateWithdrawLimit();

        if (aliceExpected == aliceActual)
            richtig++;
        else {
            falsch++;
            System.out.println("testCalculateWithdrawLimit()");
            System.out.println("Alice's Withdraw Limit (IST): " + aliceActual);
            System.out.println("Alice's Withdraw Limit (SOLL): " + aliceExpected);
        }
    }

    static void testTransferChecked() {
        double aliceExpected = 16000.0;
        double aliceActual = aliceAccount.balance;
        double bobExpected = 12000.0;
        double bobActual = bobAccount.balance;

        aliceAccount.transferChecked(2000.0, bobAccount);

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
        double aliceExpected = 18000.0;
        double aliceActual = aliceAccount.balance;
        double bobExpected = 10000.0;
        double bobActual = bobAccount.balance;

        aliceAccount.transferChecked(21000.0, bobAccount);

        if (aliceExpected == aliceActual && bobExpected == bobActual)
            richtig++;
        else {
            falsch++;
            System.out.println("testTransferCheckedNoTransfer()");
            System.out.println("Alice's Konto (IST): " + aliceAccount.balance);
            System.out.println("Bob's Konto (IST): " + bobAccount.balance);
            System.out.println("Alice's Konto (SOLL): " + 18000.0);
            System.out.println("Bob's Konto (SOLL): " + 10000.0 + "\n");
        }
    }
     */
}
