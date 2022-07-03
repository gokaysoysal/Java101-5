public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 10, "Blue", "Sedan");
        audi.printInfo();

        Car bmw = new Car("BMW", 20, "Red", "Hatchback");
        bmw.printInfo();

        Car mercedes = new Car("Mercedes", 30, "Black", "Suv");
        mercedes.printInfo();
    }
}