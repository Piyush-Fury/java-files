import java.util.Scanner;


class Percentage{
     public static void main(String[] args) {
    System.out.println("Enter numbers you acquired in each subject");
    //total marks
    float tMarks=400;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter numbers you acquired in English");
    float   eng = sc.nextFloat();
    System.out.println("Enter numbers you acquired in Computer Science");
    float comSci = sc.nextFloat();
    System.out.println("Enter you numbers you acquired in Math");
    float mth = sc.nextFloat();
    System.out.println("Enter you numbers you acquired in Physics");
    float phy = sc.nextFloat();
    float pc=((eng+comSci+mth+phy)/tMarks)*100;
    System.out.print("Percentage of your marks is ");
    System.out.println(pc +"%");
    }   
}