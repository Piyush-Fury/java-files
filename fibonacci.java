public class fibonacci {

    static int fib(int n)
    {
        if(n==1||n==2){
            return n-1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
     int results = fib(5);
     System.out.println(results);   
    }
}
