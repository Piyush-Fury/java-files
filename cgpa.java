import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter The Marks obtained in Maths : ");
      float Maths = sc.nextFloat();

      System.out.println("Enter the marks obtained in Science : ");
      float Science = sc.nextFloat();

      System.out.println("enter the Marks obtained in Computer :");
      float Computer = sc.nextFloat();

      float percentage = ((Maths+ Science+ Computer)/300)*100;

      System.out.println("Total Percentage is :" + percentage);

      float pa = (percentage/9.5f);

      System.out.println("CGPA is :" + pa);
    }   
}
