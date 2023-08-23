import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 30;
        // int c = 40;
        // int sum = a+b+c;

        Scanner sum = new Scanner(System.in);

        System.out.println("Enter Value of A :");
        float a = sum.nextFloat();
        System.out.println("Enter the value of B :");
        float b = sum.nextFloat();
        System.out.println("Enter the value of C :");
        float c = sum.nextFloat();
        System.out.print("Sum of A B C are :");
        System.out.println(a+b+c);
    }
}
