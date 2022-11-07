package session05.task;

public class BankTest {

    static Bank bank = new Bank();

    static int richtig = 0;
    static int falsch = 0;

    public static void main(String[] args) {
        testRateCredit();
        testRateCreditResidenceNotDE();
        testRateCreditAgeUnder18();
        testRateCreditNoRegularIncome();
        testRateCreditCreditScoreUnder70();
        testRateCreditCreditScoreIs70();
        testRateCreditCreditAmountOver100000CreditScoreOver80();
        testRateCreditCreditAmountOver100000CreditScoreUnder80();

        // Nur für die Erweiterungsregel relevant!
        // testRateCreditAgeOver63SufficientCreditCollateral();
        // testRateCreditAgeOver63InsufficientCreditCollateral();

        System.out.println("Bestandene Tests: " + richtig);
        System.out.println("Fehlgeschlagene Tests: " + falsch);
    }

    static void testRateCredit() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCredit('D', 35, true, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCredit():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditResidenceNotDE() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit('A', 35, true, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditResidenceNotDE():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAgeUnder18() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit('D', 17, true, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditAgeUnder18():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditNoRegularIncome() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit('D', 35, false, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditNoRegularIncome():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditScoreUnder70() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit('D', 35, true, 69, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditCreditScoreUnder70():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditScoreIs70() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCredit('D', 35, true, 70, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditCreditScoreIs70():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditAmountOver100000CreditScoreOver80() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCredit('D', 35, true, 80, 100001, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditCreditAmountOver100000CreditScoreOver80():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditAmountOver100000CreditScoreUnder80() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit('D', 35, true, 79, 100001, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditCreditAmountOver100000CreditScoreUnder80():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    // Nur für die Erweiterungsregel relevant!
    static void testRateCreditAgeOver63SufficientCreditCollateral() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCredit('D', 64, true, 100, 100001, 100001);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditAgeOver63SufficientCreditCollateral():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAgeOver63InsufficientCreditCollateral() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit('D', 64, true, 100, 100001, 60000);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            System.out.println("testRateCreditAgeOver63InsufficientCreditCollateral():");
            System.out.println("ERGEBNIS: " + actualRating);
            System.out.println("ERWARTET: " + expectedRating + "\n");
        }
    }
}
