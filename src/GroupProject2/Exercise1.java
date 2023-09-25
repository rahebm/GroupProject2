package GroupProject2;

public class Exercise1 {
    public static void main(String[] args) {
        String string1 = "Batch17";
        String string2 = "Java";

        System.out.println("Before");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());

        System.out.println("After");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
    }

}
