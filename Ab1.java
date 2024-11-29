// //****************** QUESTION1 ***************/
//asd
//sdas
// // abstract class Pen{
// //     abstract void write();
// //     abstract void refill();
// // }

// // class Fountainpen extends Pen{
// //     void write(){
// //         System.out.println("Write");
// //     }
// //     void refill(){
// //         System.out.println("refill");
// //     }
// //     void ChangeNib()
// //     {
// //         System.out.println("Changing Nib");
// //     }
// // }


// //****************** QUESTION2 ***************/

// // class Monkey{
// //     public void jump(){
// //         System.out.println("Jumpong");
// //     }
// //     public void bite(){
// //         System.out.println("biting");
// //     }
// // }

// // interface BasicAnimal{
// //     void eat();
// //     void sleep();
// // }

// // class human extends Monkey implements BasicAnimal{
// //     public void eat(){
// //         System.out.println("Eating");
// //     }
// //     public void sleep(){
// //         System.out.println("Sleeping");
// //     }
// // }



// //****************** QUESTION3 ***************/

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void dissconect();
}

class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("ringing");
    }
    void lift(){
        System.out.println("Lifting");
    }
    void dissconect(){
        System.out.println("Cutting");
    }
    // public void hello(){
    //     System.out.println("hello");
    // }
}

 
public class Ab1 {
    public static void main(String[] args) {
        Telephone t1 = new SmartTelephone();
        t1.ring();
    }
}
