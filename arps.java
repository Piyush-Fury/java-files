import java.util.*;
public class arps {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(10);
        
        //arr.remove(0);

        for(Object o:arr){
            System.out.println(o);
        }
        System.out.println("*********");
        HashSet<Integer> s = new HashSet();
        s.add(25);
        s.add(4);
        s.add(14);
        s.add(34);
        s.add(44);
        s.add(25);
        System.out.println(s);
    }
}
