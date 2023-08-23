class Tommy{
    public void Hit()
    {
        System.out.println("Hitting the Enemy");
    }
    public void Run()
    {
        System.out.println("Running From Enenmy");
    }
    public void Fire()
    {
        System.out.println("Firing on the Enemy");
    }
}
public class Rockstar {
 public static void main(String[] args) {
    Tommy player = new Tommy();
    player.Hit();
    player.Run();
    player.Fire();
 }   
}
