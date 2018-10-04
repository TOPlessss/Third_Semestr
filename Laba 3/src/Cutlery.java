import java.util.*;
import java.lang.*;

public abstract class Cutlery
{
    private String material;

    public String getMaterial()
    {
        return material;
    }

    public Cutlery(String material)
    {
        this.material = material;
    }

    public abstract void search();
}

class Spoon extends Cutlery
{
    private int size;

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public Spoon(String material, int size)
    {
        super(material);
        this.size = size;
    }

    public void search()
    {
        System.out.println("Материал: " + super.getMaterial() + " Размер: " + size);
    }
}

class Fork extends Cutlery
{
    private double length;

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public Fork(String material, double length)
    {
        super(material);
        this.length = length;
    }

    public void search()
    {
        System.out.println("Материал: " + super.getMaterial() + " Длина: " + length);
    }
}





