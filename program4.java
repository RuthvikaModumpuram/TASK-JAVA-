import java.util.*;
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to check whether it is an even or odd:");
     int a = sc.nextInt();
     if(a % 2 == 0)
    	 System.out.println("Even number:" + a);
     else
    	 System.out.println("Odd number:" + a);
	}

}
