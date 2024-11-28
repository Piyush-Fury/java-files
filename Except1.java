import java.util.Scanner;
//asas
public class Except1 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 78;
        marks[1] = 50;
        marks[2] = 66;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while(flag){
            System.out.println("Enter the value of Index");
            int indexNum = sc.nextInt();

            try{
                System.out.println("Welcome from PIYUSH AGRAWAL");
                try{
                    System.out.println(marks[indexNum]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception at 2 execution");
                }
            }
            catch(Exception e){
                System.out.println("Exception at level 1");
            }
        }
        System.out.println("thanks for using the program");
    }
}
