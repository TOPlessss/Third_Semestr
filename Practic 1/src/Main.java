import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Ball ball = new Ball("Green");
        System.out.println("Pump this ball, enter the weight to add to ball");
        Scanner sc = new Scanner(System.in);
        double n;
        n = sc.nextDouble();
        ball.pump(n);
        double v;
        int a;
        System.out.println("Enter speed to throw the ball");
        v = sc.nextDouble();
        System.out.println("Enter angle to throw the ball");
        a = sc.nextInt();
        ball._throw(v,a);
        System.out.println("\n");
        System.out.println(ball.toString());
    }
}
