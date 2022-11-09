package session06.tasks;

public class CaesarCipher {
    public static void main(String[] args) {
        String plaintext = "geheim";
        int key = 3;

        String ciphertext = code(plaintext, key);
        System.out.println("Klartext: " + plaintext);
        System.out.println("Verschlüsselt: " + ciphertext);

        String decoded = decode(ciphertext, key);
        System.out.println("Verschlüsselt: " + ciphertext);
        System.out.println("Klartext: " + decoded);
    }

    /* Klartext mit dem Schluessel verschluesseln */
    public static String code(String plaintext, int key) {
        String ciphertext = "";
        plaintext = plaintext.toLowerCase(); //Alles in Kleinbuchstaben umwandeln
        for (int i = 0; i < plaintext.length(); i++) {
            //Buchstaben verschieben und an Geheimtext haengen
            char next = plaintext.charAt(i);
            ciphertext = ciphertext + shift(next, key);
        }
        return ciphertext;
    }

    /* Verschiebt den Buchstaben um die angegebene Verschiebung (key)*/
    public static char shift(char letter, int shift) {
        //Buchstaben als Zahl behandeln
        if (letter >= 'a' && letter <= 'z') { //Sonderzeichen nicht veraendern
            letter += shift;
            while (letter > 'z') {
                letter -= 26;
            }
        }
        return letter;
    }

    public static String decode(String ciphertext, int key) {
        String decoded = "";
        //TODO Entschluessele den Geheimtext mit dem angegebenen Schluessel
        return decoded;
    }
}
