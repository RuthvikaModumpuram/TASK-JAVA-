import java.util.Scanner;

class Rectangle {

    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class program9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        
        Rectangle rect = new Rectangle(length, width);

        System.out.println("Area of the rectangle: " + rect.calculateArea());

        sc.close();
    }
}

