package prac3;

public abstract class Shape
{
    private String color;
    private boolean fielled;

    public Shape()
    {
        this.color = "WHITE";
        this.fielled = true;
    }

    public Shape(String color, boolean fielled)
    {
        this.color = color;
        this.fielled = fielled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFielled()
    {
        return fielled;
    }

    public void setFielled(boolean fielled)
    {
        this.fielled = fielled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();

    @Override
    public String toString()
    {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fielled=" + fielled +
                '}';
    }
}



