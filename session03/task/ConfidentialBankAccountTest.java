package session03.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfidentialBankAccountTest {

    ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1, 18000, 2000.0);
    ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2, 10000.0, 0.0);

    // TODO Aufgabe 3: Anpassen der Tests and die veränderten Sichtbarkeitsmodifikatoren


    // Test deposit(double)
    @Test
    void testDeposit() {
        // when
        bobAccount.deposit(1000);

        // then
        assertEquals(11000.0, bobAccount.balance);
    }

    // Test withdraw(double)
    @Test
    void testWithdraw() {
        // given
        bobAccount.withdraw(1000.0);

        // then
        assertEquals(9000.0, bobAccount.balance);
    }

    // Test transfer(double, BankAccount)
    @Test
    void testTransfer() {
        // when
        aliceAccount.transfer(2000.0, bobAccount);

        // then
        assertEquals(12000.0, bobAccount.balance);
        assertEquals(16000.0, aliceAccount.balance);
    }

    /*
     * Aufgabe 4: Uncomment Tests after implementing transferChecked
     */


    /*

    @Test
    void testCalculateWithdrawLimit() {
        // when
        double withdrawLimit = aliceAccount.calculateWithdrawLimit();

        // then
        assertEquals(20000.0, withdrawLimit);
    }

    @Test
    void testTransferChecked() {
        // when
        aliceAccount.transferChecked(2000.0, bobAccount);

        // then
        assertEquals(12000.0, bobAccount.getBalance());
        assertEquals(16000.0, aliceAccount.getBalance());
    }

    @Test
    void testTransferCheckedNoTranfer() {
        // when
        aliceAccount.transferChecked(21000.0, bobAccount);

        // then
        assertEquals(10000.0, bobAccount.getBalance());
        assertEquals(18000.0, aliceAccount.getBalance());
    }

    */

}
