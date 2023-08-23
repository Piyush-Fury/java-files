public class method1 {

    static void table(int a){
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d X %d = %d\n" , a,i,a*i);
        }
    }
    public static void main(String[] args) {
        table(4);
    }
}
