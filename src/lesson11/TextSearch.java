package lesson11;

public class TextSearch {
    public static void main(String[] args) {
        String text = "To be or not to be. There is a question. I choose be.";

        String[] words = text.toLowerCase().replaceAll("[-+.^:,]", "").split(" ");

        int[] wordsCount = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    wordsCount[i]++;
                }
            }
        }

        int maxCount = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < wordsCount.length; i++) {
            if (maxCount < wordsCount[i]) {
                maxCount = wordsCount[i];
                index = i;
            }
        }

        System.out.println("The popularest word is " + words[index]);

//        for (int i = 0; i < words.length ; i++) {
//            System.out.println(words[i] + " - " + wordsCount[i]);
//        }

    }
}
