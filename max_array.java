public class max_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,50,5,6};
        int max = 0;
        for(int e:arr)
        {
            if(e>max)
            {
               max = e;
            }
        }
        System.out.println("Max number in the arrray is : "+ max);
    }
}
