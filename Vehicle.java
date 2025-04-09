public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", 120);
        vehicle1.displayDetails();

        System.out.println();

        Car car1 = new Car("Honda", 150, "Petrol");
        car1.displayDetails();
    }
}

class Car extends Vehicle
{
    private String fuelType;
    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

