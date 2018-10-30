package prac3;

import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Shape circle1 = new Circle("RED", true);
        ((Circle) circle1).setRadius(2.37);
        System.out.println(circle1.toString());
        System.out.println("Area is " + circle1.getArea());
        System.out.println("Perimetr is " + circle1.getPerimetr());

        System.out.println("==========================");

        Shape square1 = new Square(21.3, 21.3);
        System.out.println(square1.toString());
        System.out.println("Area is " + square1.getArea());
        System.out.println("Perimetr is " + square1.getPerimetr());

        System.out.println("==========================");

        Rectangle rectangle1 = new Rectangle("BLACK", true, 3.3, 4.4);
        System.out.println(rectangle1.toString());
        System.out.println("Area is " + rectangle1.getArea());
        System.out.println("Perimetr is " + rectangle1.getPerimetr());


    }
}
