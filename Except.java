import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 78;
        marks[1] = 50;
        marks[2] = 66;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index you want to divide with in array ");
        int arrNum = sc.nextInt();

        System.out.println("enter the number you want to devide the array index with ");
        int number = sc.nextInt();

        try{
            System.out.println("The value you want at index number is " + marks[arrNum]);
            System.out.println("The value after dividing the number with arrayh index is " + marks[arrNum]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Enter the legit number not zero");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter between 0,1,2");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }

