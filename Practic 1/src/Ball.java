import java.lang.*;
import java.text.DecimalFormat;
import java.util.*;
public class Ball
{
    DecimalFormat df = new DecimalFormat("#.##");
    private String color;
    private double weight;
    private double speed;
    private double x;
    private  double y;

    public Ball(String c, double w)
    {
        color = c;
        weight = w;
        speed = 0;
        x = 0;
        y = 0;
    }
    public Ball(String c)
    {
        color = c;
        weight = 0.8;
        speed = 0;
        x = 0;
        y = 0;
    }
    public Ball(double w)
    {
        color = "Red";
        weight = w;
        speed = 0;
        x = 0;
        y = 0;
    }
    public Ball()
    {
        color = "Red";
        weight = 0.8;
        speed = 0;
        x = 0;
        y = 0;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setWeight(double w)
    {
        weight = w;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public String getColor()
    {
        return color;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getSpeed()
    {
        return speed;
    }
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
    public String toString()
    {
        return "Color "+ this.color +" Weight "+ this.weight +" Speed "+ this.speed +" CoorX "+ this.x +" CoorY "+ this.y;
    }
    public void pump(double p)
    {
        weight +=p;
    }
    public void _throw(double v,int a)
    {
        int alpha;
        int g =10;
        double S;
        double H;
        double t;
        t = (2*v*(Math.sin(a)))/g;
        S = (Math.pow(v, 2)*(Math.sin(2*a)))/2*g;
        H = (Math.pow(v, 2)*(Math.pow(Math.sin(a), 2)))/2*g;
        System.out.println("You throw the ball and this is information about it");
        System.out.print(" Flying time "+ df.format(t)+ "\n" +" Distance "+ df.format(S)+ "\n" +" Max Height "+ df.format(H));
    }

}
