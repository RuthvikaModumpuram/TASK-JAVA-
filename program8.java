import java.util.Scanner;
public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
    		   System.out.println("Enter the size of array");
    		   int n = sc.nextInt();
    		   int a[] = new int[n];
    		   int sum = 0;
    		   System.out.println("Enter the array numbers:");
    		   for(int i = 0; i < 5; i++)
    		   {
    			   a[i] = sc.nextInt();
    			   sum = sum + a[i];
    		   }
    		   sc.close();
    		   System.out.println("The sum of array numbers is :" + sum);
	}

}
