class phone{
    public void vibrating(){            // FUNCTION TO DISPLAY THE VIBRATING OUTPUT
        System.out.println("Vibrating...");
    }
    public void ringing(){              // FUNCTION TO DISPLAY THE RINGING OUTPUT
        System.out.println("Ringing...");
    }
}
public class cellphone {    
    public static void main(String[] args) {
        phone realme = new phone();         // CREATING THE OBJECT OF PHONE CLASS
        realme.vibrating();
        realme.ringing();      
    }
}
