// Class Rectangle 
class Rectangle{
    int length;
    int width;
    Rectangle(int l, int w) // constructor where we are initializing values of length and breadth
    {
        this.length = l;
        this.width = w;
    }

    int area()             // area function to calculate the area of rectangle
    {
        return length * width;
    }
}

class Cuboid extends Rectangle {            // Class cuboid which is inheriting the class rectangle
    int height;
    Cuboid(int w, int l, int h)             // constructor here also we are initializing the values of w,l,h
    {
        super(l, w);                        // super function which is calling the constructor of the parent class which is rectangle
        this.height = h;
    }

    int volume()                            // class rectangle to calculate the volume of the cuboid
    {
        return length * width * height;
    }
}

public class rectangleInherit{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(25, 25);      // initializing the object for class rectangle
        System.out.println(rec.area()); 
        Cuboid cuboid = new Cuboid(20, 20, 20);   // initializing the object of the class cuboid
        System.out.println(cuboid.volume());
    }
}