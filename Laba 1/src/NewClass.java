import java.lang.System;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class NewClass
{
    public static void main(String[] args)
    {
        one();
        System.out.println("==================================");
        three();
        System.out.println("==================================");
        four();
        System.out.println("==================================");
        five();
    }
    public static void one ()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] mas = new int[n];
        int sum = 0;

        final Random random = new Random();
        for (i = 0; i < n; i++)
        {
            mas[i] = random.nextInt(10);
        }


        int way;
        System.out.println("Choose your way 1-for 2-while 3-do while");
        way = sc.nextInt();
        switch (way)
        {
            case 1:
                for (i = 0; i < n; i++)
                {
                    sum += mas[i];
                }
                System.out.println(sum);
                break;

            case 2:
                i = 0;
                while (i < n)
                {
                    sum += mas[i];
                    i++;
                }
                System.out.println(sum);
                break;
            case 3:
                i = 0;
                do
                {
                    sum += mas[i];
                    i++;
                }
                while (i < n);
                System.out.println(sum);
                break;

            default:
                System.out.println("Wrong way");
        }
    }

    public static void three ()
    {
        System.out.println("This is the harmonic series");
        double n = 11;
        for(double i = 1; i < n; i++)
        {
            System.out.println(1/i);
        }
    }

    public static void four ()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Enter size of array to sort it");
        n = sc.nextInt();
        int[] mas = new int[n];

        final Random random = new Random();
        for (i = 0; i < n; i++)
        {
            mas[i] = random.nextInt(10);
        }
        for (i = 0; i < n; i++)
        {
            System.out.print(mas[i]+" ");
        }
        System.out.print("\n");
        Arrays.sort(mas);
        for (i = 0; i < n; i++)
        {
            System.out.print(mas[i]+" ");
        }
        System.out.print("\n");

    }
    public static void five ()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter variable to count its factorial");
        n = sc.nextInt();
        int fact = 1;
        for ( int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }
}
