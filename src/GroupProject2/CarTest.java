package GroupProject2;

public class CarTest {
    public static void main(String[] args) {
        Car sedan = new Sedan(20000, "Blue", 22);
        Car truck = new Truck(30000, "Red", 2500);

        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}

