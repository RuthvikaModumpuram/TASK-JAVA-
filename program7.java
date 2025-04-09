import java.util.*;
public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
    		   int a[] = new int[5];
    		   System.out.println("Enter the array numbers:");
    		   for(int i = 0; i < 5; i++)
    		   {
    			   a[i] = sc.nextInt();
    		   }
    		   sc.close();
    		   int min = a[0];
    		   int max = a[0];
    		   for(int i = 1; i< 5; i++)
    		   {
    			   if(a[i] < min)
    			   {
    				   min = a[i];
    			   }
    			   if(a[i] > max)
    			   {
    				   max = a[i];
    			   }
    		   }
    		   System.out.println("Largest number is:" + max);
    		   System.out.println("Smallest number is:" + min);
	}

}
