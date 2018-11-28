

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(var1(5));
        System.out.println("=========================");
        System.out.println(var2(12, 25));
        System.out.println("=========================");
        System.out.println(var3(5698));
    }

    public static String var1(int n)
    {
        if(n == 1)
        {
            return "1";
        }
        return var1(n-1) + " " + n;
    }

    public static String var2(int a, int b)
    {
        if(a > b)
        {
            if(a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + var2(a - 1, b);
        }
        else
        {
            if(a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + var2(a + 1, b);
        }

    }

    public static int var3(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return var3(n/10) + n%10;
    }
}
