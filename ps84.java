import java.util.Scanner;

public class ps84 {
    public static void main(String[] args) {
        try{
            int a = 670;
            int b = 0;
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }

        // problem 3

        int [] marks = new int[3];
        marks[0] = 78;
        marks[1] = 50;
        marks[2] = 66;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
        try{
            System.out.println("Enter the index number");
            int num = sc.nextInt();
            System.out.println("The calue at given index is " + marks[num]);
            flag = false;
        }
        catch(Exception e){
            System.out.println("Buddy enter the number less then 3");
        }
    }
    }
}
