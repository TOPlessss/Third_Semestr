public class Main
{
    public static void main(String[] args)
    {
        Human hm = new Human(26);
        Animal an = new Animal(38);

        hm.sayName();
        an.Info();
    }
}

class Human implements Nameable
        {
            String name;
            int age;

            public Human(int age)
            {
                this.age = age;
            }

            public String getName(String name)
            {
                this.name = name;
                return this.name;
            }

            public void sayName()
            {
                System.out.println("My name is " + getName("Pavel") + " and I'm " + age);
            }
        }

class Animal implements Nameable
    {
        String name;
        int weight;

        public Animal(int weight)
        {
            this.weight = weight;
        }

        public String getName(String name)
        {
            this.name = name;
            return this.name;
        }

        public void Info()
        {
            System.out.println("This is " + getName("tiger") + " and weight is " + weight);
        }
    }
