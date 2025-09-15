/*
import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
System .out.println("Enter a numbers");
System .out.println("Enter 2 numbers");

 int x = sc.nextInt();
int y = sc.nextInt();
  if(isPerfectNumber(num))
  {
 System.out.println(num + "Is a perfect number");
}
else
{
  System.out.println(num + "Is not a perfect number");
}
}
static Boolean isPerfectNumber(int num)
 {
  int sum = 0;

for(int i = 1; i <= num/2; i++)
 {
   if(num % i == 0)
 {
   sum += i;
}
}
return sum == num;
}
}
*/

import java.util.Scanner;

class PerfectNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Perfect numbers between " + start + " and " + end + " are:");
        
        for (int num = start; num <= end; num++) {
            int sum = 0;
            
            // calculate sum of proper divisors
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        
        sc.close();
    }
}
