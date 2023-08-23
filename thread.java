class Piyush extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
        System.out.println("Driving the car");
        i++;
    }
}
}

class Pihu extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<40){
        System.out.println("dancing on the song");
        i++;
    }
}
}
public class thread {
    public static void main(String[] args) {
        Piyush p1 = new Piyush();
        Pihu p2 = new Pihu();
        p1.start();
        p2.start();
    }
}
