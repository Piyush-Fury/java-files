class Square{
    int side;
    public int area()
    {
        int area = side * side;
        return area;
    }
    public int para()
    {
        int parameter = 4*side;
        return parameter;
    }
}

public class square {
    public static void main(String[] args) {
        Square sc =new Square();
        sc.side = 4;
        System.out.println("Area of Square is :"+sc.area());
        System.out.println("Parameter of Square : "+sc.para());
    }
}
