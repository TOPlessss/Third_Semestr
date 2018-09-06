public class Human
{
    private String name;
    private int age;
    private double growth;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
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

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getGrowth()
    {
        return growth;
    }

    public void setGrowth(double growth)
    {
        this.growth = growth;
    }

    @Override
    public String toString()
    {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                '}';
    }



    public double getPerfectWeight()
    {
        double weight;
        weight = (growth - 100) * 1.15;
        return weight;
    }




}
