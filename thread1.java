class tommy implements Runnable{
    public void run(){
        int i=0;
        while(i<40){
            System.out.println("Piyush Agrawal");
            i++;
        }
    }
}

class gun implements Runnable {
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("BCA");
            i++;
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        tommy p1 = new tommy();
        Thread t1 = new Thread(p1);

        gun p2 = new gun();
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }
}
