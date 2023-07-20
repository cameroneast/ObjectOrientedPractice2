public class Main {
    public static void main(String[] args) {
        // Create instances of Car and ElectricCar
        Car car1;
        ElectricCar eCar1;
        // Initialize their attributes
        car1 = new Car("Toyota", 2022, "Gasoline");
        eCar1 = new ElectricCar("Tesla", 2023, 85);
        // Display the details of each vehicle
        car1.displayDetails();
        System.out.print("\n");
        eCar1.displayDetails();
    }
}

