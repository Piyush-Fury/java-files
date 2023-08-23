import java.util.Scanner;
import java.util.Random;


public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for ROCK, 1 for Paper, 2 for Scissor: ");
        int choice = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt();

        if (choice == computerInput)
        System.out.println("Draw");
        else if(choice == 0 && computerInput == 2 || choice == 1 && computerInput == 0 || choice == 2 && computerInput==1)
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("Computer Win!!");
        }
    }
}
