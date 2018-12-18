package lab8;

import java.io.*;


public class File
{
    public static void main(String[] args)
    {
        try (FileOutputStream fos = new FileOutputStream("C:\\ProgramData\\Java projects\\Labs_and_Prac\\src\\lab8\\file.txt", false))
        {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Dog dog = new Dog("Snejok", 4);
            oos.writeObject(dog);
            oos.flush();
            oos.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("C:\\ProgramData\\Java projects\\Labs_and_Prac\\src\\lab8\\file.txt"))
        {
            ObjectInputStream oin = new ObjectInputStream(fis);
            Dog new_dog = new Dog();
            try
            {
             new_dog = (Dog) oin.readObject();
            }
            catch (ClassNotFoundException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println("About object=" +  new_dog.toString());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class Dog implements Serializable
{
    private String name;
    private int age;
    private double hunger;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
        hunger = 10;
    }

    public Dog()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public double getHunger()
    {
        return hunger;
    }

    public void feed(double food)
    {
        hunger += food;
    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hunger=" + hunger +
                '}';
    }
};
