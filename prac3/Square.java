package prac3;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double width, double length)
    {
        super(width, length);
    }

    public Square(String color, boolean fielled, double width, double length)
    {
        super(color, fielled, width, length);
    }

    public double getSide()
    {
        return getLength();
    }

    public void setSide(double side)
    {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
