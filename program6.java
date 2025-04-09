import java.util.*;
public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the number to  print its table:");
    Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
    		for(int i = 1; i <= 20; i++)
    		{
    			System.out.println(a + " * " + i + " = " +  (a*i));
    		}
	}

}
