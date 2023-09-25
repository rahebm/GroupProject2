package GroupProject2;


    class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

    class Sedan extends Car {
        double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {
            if (length > 20) {
                return super.calculateSalePrice() * 0.90;
            } else {
                return super.calculateSalePrice() * 0.95;
            }
        }
    }

    class Truck extends Car {
        double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                return super.calculateSalePrice() * 0.90;
            } else {
                return super.calculateSalePrice() * 0.80;
            }
        }
    }



