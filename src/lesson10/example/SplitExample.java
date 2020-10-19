package lesson10.example;

public class SplitExample {
    public static void main(String[] args) {
        String sentence = "To be or not to be? That is the question";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
