package prac3;

public class Circle extends Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle()
    {
        this.radius = 5.32;
    }

    public Circle(String color, boolean fielled)
    {
        super(color, fielled);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getPerimetr()
    {
        double diametr;
        diametr = 2 * radius;
        return 3.14 * diametr;
    }

    @Override
    public double getArea()
    {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Circle{" +
                "radius=" + radius +
                '}';
    }
}
