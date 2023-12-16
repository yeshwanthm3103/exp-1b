class Shape{
    String color;
    public Shape (String color)
    {
        this.color = color;
    }
    void draw()
    {
        System.out.println("Draw with:"+color);

    }
}
class Circle extends Shape
{
    double r;
    public Circle (String color ,double r)
    {
        super(color);
        this.r=r;

    }
    double area()
    {
        return 3.14*r*r;
    }
}
public class Main
{
    public static void main(String[] args)
    {
     Circle mycircle=new Circle("Red",5.0);
     mycircle.draw();
     System.out.println("Area is : "+mycircle.area());
    }
}