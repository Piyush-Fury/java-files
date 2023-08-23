class Thread1 extends Thread{
    public void run(){
        while(true){
            try{
            Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}


class Thread2 extends Thread{
    public void run(){
        while(true){
            try{
            Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class practice1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        t1.setPriority(10);
        t2.setPriority(5);

        System.out.println("priority of thread 1 is" + t1.getPriority());
        System.out.println("priority of thread 2 is" + t2.getPriority());
    }
}
