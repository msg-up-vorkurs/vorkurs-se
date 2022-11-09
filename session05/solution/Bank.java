package session05.solution;

public class Bank {

    /*
     * TODO Aufgabe 3: rateCredit implementieren
     * residence ist 'D' für Deutschland
     */
    boolean rateCredit(char residence, int age, boolean regularIncome, int creditScore, double creditAmount, double creditCollateral) {

        if (residence == 'D' & age >= 18 & regularIncome) {
            if (age < 63 | creditAmount <= creditCollateral) {
                if (creditScore >= 80) {
                    return true;
                } else if (creditScore >= 70 & creditAmount <= 100000) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

        // Alternativ auch ohne Verschachtelung
//        if (residence == 'D' & age >= 18 & regularIncome
//                & (age < 63 | creditAmount <= creditCollateral)
//                & (creditScore >= 80 | (creditScore >= 70 & creditAmount <= 100000))) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
