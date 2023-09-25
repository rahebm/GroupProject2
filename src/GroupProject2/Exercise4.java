package GroupProject2;

import java.util.Arrays;

public class Exercise4 {
    public static int countWords(String input) {
        return (int) Arrays.stream(input.split("\\s+|\\p{Punct}"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    public static void main(String[] args) {
        String inputString = "Hello, world!";

        int wordCount = countWords(inputString);

        System.out.println(inputString);
        System.out.println(wordCount);
    }
}
