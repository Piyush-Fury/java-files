public class grades {
    public static void main(String[] args) {
        char grades = 'B';
        grades = (char)(grades + 8);
        System.out.println(grades);

        //Decrypt
        grades = (char)(grades-8);
        System.out.println(grades);
    }
}
