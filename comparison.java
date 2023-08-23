import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the input from the userr
        System.out.println("Enter The Number : ");
        float a = sc.nextFloat();

        // default value for comparison
        float gn = 10; 
        if (a == gn)
        System.out.println("Number is equal");
        else if (a<gn)
        System.out.println("Number is less then given number : ");
        else
        System.out.println("NUmber is greater then given number");

    }
}
