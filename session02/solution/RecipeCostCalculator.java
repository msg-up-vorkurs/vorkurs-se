package session02.solution;

public class RecipeCostCalculator {
    public static void main(String[] args) {

        // Preis pro Kilo
        double butterPrice = 9.56;
        double sugarPrice = 0.79;
        double flourPrice = 2.30;
        double chocolatePrice = 12.9;

        // Preis pro 6er Pack
        double eggPrice = 1.99;

        // TODO: Variablen für die Mengenangaben anlegen
        int portions = 12;
        double butter = 0.250;
        double sugar = 0.350;
        double flour = 0.210;
        double chocolate = 0.150;
        int egg = 2;

        // TODO: Gesamt- und Portionspreis für das Rezept berechnen
        double recipePrice = butter * butterPrice
                + sugar * sugarPrice
                + egg * (eggPrice / 6)
                + flour * flourPrice
                + chocolate * chocolatePrice;
        double portionPrice = recipePrice / portions;

        // TODO: Ausgabe der berechneten Preise
        System.out.println("Gesamtpreis: " + recipePrice);
        System.out.println("Portionspreis: " + portionPrice);

    }
}
