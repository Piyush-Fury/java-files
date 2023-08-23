class Area{
    int length;
    int width;
    public int recArea()
    {
        int area = length * width;
        return area;
    }
    public int recpara()
    {
        int para = 2*(length+width);
        return para;
    }

}

public class rectangle {
 public static void main(String[] args) {
    Area ar = new Area();
    ar.length=10;
    ar.width=20;
    System.out.println("Area of rectangle is : " + ar.recArea());
    System.out.println("Parameter of Rectanlge is :" + ar.recpara());
 }    
}
