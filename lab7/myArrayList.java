package lab7;

import java.util.Arrays;
import java.util.Iterator;

public class myArrayList <T> implements Iterator<Object>
{
    private final int RESERVE = 4;
    private final  int SIZE = 8;
    private int langth = 0;
    private Object[] arr = new Object[SIZE];
    private int currentElem = 0;

    private void resize(int _size)
    {
        Object[] tempArr = Arrays.copyOf(arr, _size);
        arr = tempArr;
    }

    public void add(T elem)
    {
        if(langth == arr.length -1)
        {
            resize(arr.length * 2);
        }
        arr[langth] = elem;
        langth++;
    }

    public void delete(int index)
    {
        for(int i = index; i < langth; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[langth] = null;
        langth--;
        if(langth == arr.length / RESERVE)
        {
            resize(arr.length / 2);
        }
    }

    public int size()
    {
        return langth;
    }

    public T get(int index)
    {
        return (T)arr[index];
    }

    @Override
    public void remove()
    {
        this.delete(currentElem);
    }

    @Override
    public boolean hasNext()
    {
        return currentElem < arr.length - 1;
    }

    @Override
    public Object next()
    {
        return arr[currentElem ++];
    }


}
