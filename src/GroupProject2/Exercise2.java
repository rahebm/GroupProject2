package GroupProject2;

public class Exercise2 {public static String reverseString(String input) {
    StringBuilder reversed = new StringBuilder();

    for (int i = input.length() - 1; i >= 0; i--) {
        reversed.append(input.charAt(i));
    }

    return reversed.toString();
}

    public static void main(String[] args) {
        String inputString = "Hello";
        String reversedString = reverseString(inputString);

        System.out.println("Input: " + inputString);
        System.out.println("Reversed: " + reversedString);
    }
        }
