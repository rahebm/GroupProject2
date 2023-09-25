package GroupProject2;

public class Exercise3 {
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindromeString = "madam";
        String nonPalindromeString = "hello";

        boolean isPalindromeResult = isPalindrome(palindromeString);
        boolean isNonPalindromeResult = isPalindrome(nonPalindromeString);

        System.out.println("" + palindromeString + "" + " is a palindrome: " + isPalindromeResult);
        System.out.println("" + nonPalindromeString + "" + " is a palindrome: " + isNonPalindromeResult);
    }

}
