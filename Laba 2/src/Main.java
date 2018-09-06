import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#.##");
        Human human = new Human("Bob", 26);
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("Enter growth of human");
        n = sc.nextDouble();
        human.setGrowth(n);
        System.out.println("The perfect weight of this human is "+ df.format(human.getPerfectWeight()));
        System.out.println("Enter another growth");
        n = sc.nextDouble();
        human.setGrowth(n);
        System.out.println("The perfect weight of this human is "+ df.format(human.getPerfectWeight()));

    }


}
