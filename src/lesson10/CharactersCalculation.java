package lesson10;

public class CharactersCalculation {
    public static void main(String[] args) {
        // задача про частотний аналіз тексту
        String poetry = "To be, or not to be, that is the question:" +
                "Whether 'tis nobler in the mind to suffer" +
                "The slings and arrows of outrageous fortune," +
                "Or to take arms against a sea of troubles" +
                "And by opposing end them. To die—to sleep," +
                "No more; and by a sleep to say we end" +
                "The heart-ache and the thousand natural shocks";

        char[] alphabet = new char[256];
        for (char sym : poetry.toLowerCase().toCharArray()) {
            int symbol = sym % 256;
            alphabet[symbol]++;
        }

        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + " - " + (int) alphabet[i]);
        }


    }
}
