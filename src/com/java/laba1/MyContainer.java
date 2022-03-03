package com.java.laba1;

public class MyContainer {
    private int size;
    private int[] elements;
    public MyContainer()
    {
        elements = new int[size];
    }
    public MyContainer(int count)
    {
        size = count;
        elements = new int[size];
    }
    public int getElem(int index)
    {
        int result = 0;
        if(index < size && index >= 0)
            result = elements[index];
        else
            System.out.println("Ошибка доступа, индекс вышел за границу. По умолчанию выведен 0");
        return result;
    }
    public void setElem(int elem, int index)
    {
        if(index < size && index >= 0)
            elements[index] = elem;
        else
            System.out.println("Ошибка доступа, индекс вышел за границу");
    }
    public int getSize()
    {
        return size;
    }
    private void reSize(int newSize)
    {
        if(newSize>0)
        {
            int[] newElements = new int[newSize];
            if(newSize < size)
            {
                for(int i = 0; i < newSize; i++)
                {
                    newElements[i] = elements[i];
                }
            }
            else
            {
                for(int i = 0; i < size; i++)
                {
                    newElements[i] = elements[i];
                }
                for(int i = size; i < newSize; i++ )
                {
                    newElements[i] = 0;
                }
            }
            elements = newElements;
            size = newSize;
        }
        else
            System.out.println("Ошибка. Введено отрицательное число");

    }
    public void addElem(int elem, int index)
    {
        if (index < size+1)
        {
            reSize(size +1);
            for(int i = size-1 ; i > index ; i--)
            {
                elements[i]=elements[i-1];
            }
            elements[index] = elem;
        }
        else
            System.out.println("Ошибка");
    }
    public int deleteElem(int index)
    {
        int result = 0;
        if (index<size)
        {
            result = elements[index];
            for(int i = index; i< size -1; i++)
            {
                elements[i]=elements[i+1];
            }
            reSize(size -1);
        }
        else
            System.out.println("Ошибка");
        return result;
    }
    public void clear()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(elements[i]);
            elements[i]=0;
        }
    }
    public void printElements()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(elements[i]);
        }
    }
}
