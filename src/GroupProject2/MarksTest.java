package GroupProject2;

public class MarksTest {public static void main(String[] args) {
    StudentA studentA = new StudentA(80, 90, 70);
    StudentB studentB = new StudentB(75, 85, 65, 95);

    System.out.println("Student A's Percentage: " + studentA.getPercentage() + "%");
    System.out.println("Student B's Percentage: " + studentB.getPercentage() + "%");
}

}
