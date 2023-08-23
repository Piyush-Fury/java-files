import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        float num = sc.nextFloat();


        // Initializing the array elements
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f,100.0f};



        //setting isInArray to false
        boolean isInArray = false;


    
        //For each loop to access all the elements in the array and check wether it is there or not
        for(float elements:marks){
            if(num==elements)
            {
                isInArray=true;
                break;
            }
        }

        //output
        if(isInArray)
        {
            System.out.println("The value is present in the array!");
        }
        else
        {
            System.out.println("The value is not present in the array!");
        }
    }
}
