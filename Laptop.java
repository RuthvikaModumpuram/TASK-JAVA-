public class Laptop {
    private String brand;
    private String processor;
    private double price;
    
    public Laptop(String brand, String processor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Laptop Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "Intel i7", 1200.00);
        laptop1.displayDetails();
    }
}