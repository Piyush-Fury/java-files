public class array2 {
    public static void main(String[] args) {
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f,100.0f};
        float sum = 0;
        for(float elements:marks){
            sum =sum+elements;
        }
        System.out.println("The average of the marks is :" + sum/marks.length);
    }
}
