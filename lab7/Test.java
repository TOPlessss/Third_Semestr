package lab7;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        myArrayList<Integer> arrList = new myArrayList<>();

        arrList.add(3);
        arrList.add(7);
        arrList.add(11);
        arrList.add(5);

        for(int i = 0; i < arrList.size(); i++)
        {
            System.out.println(arrList.get(i));
        }

        arrList.delete(1);

        System.out.println("===================");

        for(int i = 0; i < arrList.size(); i++)
        {
            System.out.println(arrList.get(i));
        }

        System.out.println("===================");
        arrList.next();
        System.out.println("Следует ли за первыйм элементом ещё один элемент?: " + arrList.hasNext());
    }
}
