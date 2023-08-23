import java.util.Scanner;

public class template {
    public static void main(String[] args) {
       String letter = "Dear name, Thanks alot!!";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your name : ");
       String naam = sc.nextLine();
       String New = letter.replace("name", naam);
       System.out.println(New);
    }
}
