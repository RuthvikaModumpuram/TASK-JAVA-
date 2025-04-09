import java.util.*;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a, b;
       System.out.println("Enter a :");
       a = sc.nextInt();
       System.out.println("Enter b :");
       b = sc.nextInt();
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("The swapped numbers are: a =" + a + "  b =" + b);
       
	}

}
