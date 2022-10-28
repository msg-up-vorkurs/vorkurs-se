package session03.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest {

    Bank bank = new Bank();

    @Test
    void testRateCredit() {
        // when
        boolean actualRating = bank.rateCredit('D', 35, true, 100, 60000, 0);

        // then
        Assertions.assertTrue(actualRating);
    }

    @Test
    void testRateCreditResidenceNotDE() {
        // when
        boolean actualRating = bank.rateCredit('A', 35, true, 100, 60000, 0);

        // then
        Assertions.assertFalse(actualRating);
    }

    @Test
    void testRateCreditAgeUnder18() {
        // when
        boolean actualRating = bank.rateCredit('D', 17, true, 100, 60000, 0);

        // then
        Assertions.assertFalse(actualRating);
    }

    @Test
    void testRateCreditNoRegularIncome() {
        // when
        boolean actualRating = bank.rateCredit('D', 35, false, 100, 60000, 0);

        // then
        Assertions.assertFalse(actualRating);
    }

    @Test
    void testRateCreditCreditScoreUnder70() {
        // when
        boolean actualRating = bank.rateCredit('D', 35, true, 69, 60000, 0);

        // then
        Assertions.assertFalse(actualRating);
    }

    @Test
    void testRateCreditCreditScoreIs70() {
        // when
        boolean actualRating = bank.rateCredit('D', 35, true, 70, 60000, 0);

        // then
        Assertions.assertTrue(actualRating);
    }

    @Test
    void testRateCreditCreditAmountOver100000CreditScoreOver80() {
        // when
        boolean actualRating = bank.rateCredit('D', 35, true, 80, 100001, 0);

        // then
        Assertions.assertTrue(actualRating);
    }

    @Test
    void testRateCreditCreditAmountOver100000CreditScoreUnder80() {
        // when
        boolean actualRating = bank.rateCredit('D', 35, true, 79, 100001, 0);

        // then
        Assertions.assertFalse(actualRating);
    }

    // Nur für die Erweiterungsregel relevant!
    //@Test
    //void testRateCreditAgeOver63SufficientCreditCollateral() {
    //    // when
    //    boolean actualRating = bank.rateCredit("DE", 64, true, 100, 100001, 100001);
    //
    //    // then
    //    Assertions.assertTrue(actualRating);
    //}
    //
    //@Test
    //void testRateCreditAgeOver63InsufficientCreditCollateral() {
    //    // when
    //    boolean actualRating = bank.rateCredit("DE", 64, true, 100, 100001, 60000);
    //
    //    // then
    //    Assertions.assertFalse(actualRating);
    //}
}
