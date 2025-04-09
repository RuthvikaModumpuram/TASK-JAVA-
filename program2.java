import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		float c;
		Scanner sc=new Scanner(System.in);        System.out.println("Enter the Temperature in Celsius:");
		c=sc.nextFloat();
		float f=(c * 9/5) + 32;
		System.out.println("Temperature in Fahrenheit:" + f);
	}

}
