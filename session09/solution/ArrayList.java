package session09.solution;

public class ArrayList {

    private String[] content;

    public ArrayList(String[] content) {
        this.content = content;
    }

    public void add(String value) {
        // Array mit Übergröße erstellen
        String[] temp = new String[this.content.length + 1];

        //Werte einzeln speichern
        for (int i = 0; i < this.content.length; i++) {
            temp[i] = this.content[i];
        }

        //Zusätzlichen Namen an letzter Stelle speichern
        temp[temp.length - 1] = value;

        this.content = temp;
    }

    //TODO Aufgabe 1 Schreibe die Methode contains die als Boolean zurückgibt,
    //               ob der übergebene Wert value in der Liste enthalten ist
    public boolean contains(String value) {

        for (String s : content) {
            if (value.equals(s)) {
                return true;
            }
        }

        return false;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < this.content.length; i++) {
            if (i >= this.content.length - 1) {
                System.out.print(this.content[i]);
            } else {
                System.out.print(this.content[i] + ",");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
