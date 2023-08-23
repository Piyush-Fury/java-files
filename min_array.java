public class min_array {  
    public static void main(String[] args) {  
  
         //Initialize array  
        int [] arr = {1,2,3,4,5,60};

        int min = arr[0];

        int i=0;

        for(int e:arr)
        {
            if(min<e)
            {
                min=e;
            }
        }
        System.out.println(min);
 
/* 
        int []arr = {1,2,3,4,5,60};
        
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
   */ }  
    
}  