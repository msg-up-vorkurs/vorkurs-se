package session05.tasks;

public class IntArray {

    public static void main(String[] args) {
    }

    private static int[] createArray() {
        //TODO Definiere ein eigenes Array das die Werte 42,120,7 und 99 enthält und gebe dieses über return aus
        int[] intArray = {42, 120, 7, 99};
        return intArray;
    }

    private static void calculateMean() {
        //TODO Berechne den Mittelwert des Arrays das du in createArray() erzeugt hast und gebe diesen über System.out.println() aus
        int[] array = createArray();
        int gesamt = array[0] + array[1] + array[2] + array[3];
        System.out.println(gesamt / array.length);
    }

    private static void calculateMeanWithLoop() {
        //TODO Berechne den Mittelwert des Arrays mithilfe einer for-Schleife das du in createArray() erzeugt hast und gebe diesen über System.out.println() aus
        int[] array = createArray();
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        System.out.println(res / array.length);
    }

    private static void calculateMeanWithWhileLoop() {
        //TODO Berechne den Mittelwert des Arrays mithilfe einer while-Schleife das du in createArray() erzeugt hast und gebe diesen System.out.println() return aus
        int[] array = createArray();
        int res = 0;
        int i = 0;
        while (i < array.length) {
            res += array[i];
            i++;
        }
        System.out.println(res / array.length);
    }
}
