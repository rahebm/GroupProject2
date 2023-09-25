package GroupProject2;

public class Exercise8 {
    public static String incrementString(String str) {
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        for (int i = n - 1; i >= 0; i--) {
            if (charArray[i] < '9') {
                charArray[i]++;
                return new String(charArray);
            } else {
                charArray[i] = '0';
            }
        }
        char[] newArray = new char[n + 1];
        newArray[0] = '1';
        System.arraycopy(charArray, 0, newArray, 1, n);

        return new String(newArray);
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "53456";
        String num3 = "29";

        System.out.println("Incremented " + num1 + " -> " + incrementString(num1));
        System.out.println("Incremented " + num2 + " -> " + incrementString(num2));
        System.out.println("Incremented " + num3 + " -> " + incrementString(num3));
    }

}
