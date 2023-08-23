public class sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,44,6,85};
        boolean isTrue = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isTrue=false;
            }
        }
        if(isTrue){
            System.out.println("The Array is sorted");
        }
        else{
        System.out.println("The array is not sorted");
    }
}
}
