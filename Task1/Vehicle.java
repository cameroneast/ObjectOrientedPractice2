
public class Vehicle {
    // Attributes
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        // Display vehicle details
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
