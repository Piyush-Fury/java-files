
class Employee {
        int salary;
        String name;

       public int salary(){
        return salary;
       }

       public String name(){
        return name;
       }

       public void SetName(String n)
       {
         name=n;
       }
    } 
public class oops1 {
    public static void main(String[] args) {
        Employee piyush = new Employee();
        piyush.SetName("Piyush Agrawal");
        piyush.salary = 450000;
        System.out.println(piyush.name());
        System.out.println(piyush.salary());
    }
}
