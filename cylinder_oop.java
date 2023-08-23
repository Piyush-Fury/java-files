// class cylinder to calculate the surfaceArea and Volume of the Cylinder
class Cylinder{
    private int radius;
    private int height;

    // GETTER FOR THE RADIUS
    public int getRadius()
    {   
        return radius;
    }

    // SETTER FOR THE RADIUS
    public void setRadius(int radius)
    {
        this.radius=radius;
    }

    // GETTER FOR THE HEIGHT
    public int getHeight(){
        return height;
    }

    // SETTER FOR THE HEIGHT
    public void SetHeight(int height){
        this.height = height;
    }

    // METHOD TO CALCULATE THE SURFACE AREA OF THE CYLINDER
    public float surfaceArea(){
        float surfArea = 2*3.147f*radius*height + 2 * 3.147f*radius*radius;
        return surfArea;
    }

    // METHOD TO CALCULATE THE VOLUME OF THE CYLINDER
    public float volumeCylinder(){
        float volume = 3.147f * radius * radius * height;
        return volume;
    }
}

public class cylinder_oop {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();   // CREATING OBJECT FOR THE CYLINDER CLASS

        myCylinder.SetHeight(20);        // SETTING THE HEIGHT OF THE CYLINDER
        myCylinder.setRadius(25);        // SETTING THE RADIUS OF THE CYLINDER
        System.out.println(myCylinder.volumeCylinder());
        System.out.println(myCylinder.surfaceArea());
    }
}
