public class average_arg
{
    static double average(int... a)
    {
        //Average Of 'n' numbers
 
        int n = a.length;
 
        int sumOfNumbers = 0;
 
        //Claculating sum of numbers
        for(int i : a)
        {
            sumOfNumbers = sumOfNumbers + i;
        }
 
        return (sumOfNumbers/n);
    }
 
    public static void main(String[] args)
    {
        System.out.println(average(10, 20, 30, 40, 50));   //prints average of 5 numbers
 
        System.out.println(average(10, 20, 30, 40, 50, 60, 70, 80));  //prints average of 8 numbers
 
        System.out.println(average(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110));  //prints average of 11 numbers
    }
}