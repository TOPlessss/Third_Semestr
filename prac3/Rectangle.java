package prac3;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle()
    {
        this.width = 2.56;
        this.length = 1.33;
    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean fielled, double width, double length)
    {
        super(color, fielled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }

    @Override
    public double getPerimetr()
    {
        return 2 * (length + width);
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
