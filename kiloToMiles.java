import java.util.Scanner;

public class kiloToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometers : ");
        float kilo = sc.nextFloat();

        float miles = kilo*0.621371f;

        System.out.println("Miles : "+ miles);
    }
}
