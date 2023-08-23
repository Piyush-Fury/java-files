// import java.util.Scanner;

// class Factorial1{
//     public void fact(int n)
//     {
//         int m = n;
//         int fact = 1;
//         for(int i=0;i<=m;i++)
//         {
//             fact = fact*i;
//         }
//         System.out.println("Factorial of the number  is : " + m);
//     }
// }

// public class Factorial {
//     public static void main(String[] args) {
//         int number;
//         Scanner num = new Scanner(System.in);
//         Factorial1 fac = new Factorial1();
//         System.out.println("Please enter the Factorial number : ");
//         number = num.nextInt(); //3628800
//         fac.fact(number);
//     }
// }

import java.util.Scanner;

public class Factorial
{
   public static void main(String[] args)
   {
      int num, i, fact=1;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      
      for(i=num; i>=1; i--)
      {
         fact = fact*i;
      }
      
      System.out.println("\nFactorial Result = " +fact);
   }
}
