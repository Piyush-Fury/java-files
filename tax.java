import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income : ");
        float income = sc.nextFloat();
        if(income>=250000 && income<500000)
        System.out.println("Your Tax Percentage is 5%");
        else if (income>=500000 && income<1000000)
        System.out.println("Your Tax Percentage is 20%");
        else
        System.out.println("Your tax percentage is 30%");
    }
}
