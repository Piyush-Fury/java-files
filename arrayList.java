import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(13);
        l2.add(15);
        l2.add(16);

        
        l1.add(2);
        l1.add(4);
        l1.add(5);
        l1.add(1);
        l1.add(0,9);
        l1.add(2,7);
        l1.addAll(l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
