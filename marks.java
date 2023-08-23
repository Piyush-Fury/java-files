import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths : ");
        float maths = sc.nextFloat();
        System.out.println("Enter the marks of Computer : ");
        float computer = sc.nextFloat();
        System.out.println("Enter the marks of Science : ");
        float science = sc.nextFloat();
        
        float total = maths+science+computer;
        float percentage = total/300*100f;

        System.out.println("Percentage : " + percentage);

        if(percentage>=40 && maths>=33 && science>=33 && computer>=33){
            System.out.println("Passed!!");
        }
        else
        {
            System.out.println("padke aao beta you are failed try again!!");
        }
    }

}
