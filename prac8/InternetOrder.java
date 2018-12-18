package prac8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class InternetOrder implements Order
{
    private ArrayList<MenuItem> list;
    private Customer customer;

    public InternetOrder(Customer customer)
    {
        this.customer = customer;
        list = new ArrayList<>();
    }

    @Override
    public boolean add(MenuItem i)
    {
        list.add(i);
        return true;
    }

    @Override
    public String[] itemsNames()
    {
        String[] str = new String[list.size()];
        for(int i =0 ; i < list.size(); i++)
        {
            str[i] = list.get(i).toString();
        }
        return str;
    }

    @Override
    public int itemsQuantity()
    {
        return list.size();
    }

    @Override
    public int itemsQuantity(String name)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(name))
            {
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equals(item))
            {
                count++;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] getItems()
    {
        return list.toArray(new MenuItem[list.size()]);
    }

    @Override
    public boolean remove(String name)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(name))
            {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equals(item))
            {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String name)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(name))
            {
                list.remove(i);
                count++;
                i--;
            }
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem item)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equals(item))
            {
                list.remove(i);
                count++;
                i--;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCost()
    {
        ArrayList<MenuItem> newList = new ArrayList<>(list);
        newList.sort(new Comparator<MenuItem>()
        {
            @Override
            public int compare(MenuItem o1, MenuItem o2)
            {
                if(o1.getPrice() > o2.getPrice())
                {
                    return -1;
                }
                else if(o1.getPrice() < o2.getPrice())
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });
        return newList.toArray(new MenuItem[newList.size()]);
    }

    @Override
    public double costTotal()
    {
        int cost = 0;
        for(int i = 0; i < list.size(); i++)
        {
            cost += list.get(i).getPrice();
        }
        return cost;
    }

    @Override
    public Customer getCustomer()
    {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
}