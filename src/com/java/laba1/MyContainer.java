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
        return elements[index];
    }
    public void setElem(int elem, int index)
    {
        elements[index] = elem;
    }
    public void reSize(int newSize)
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
    public void addElem(int elem, int index)
    {
        reSize(size +1);
        for(int i = index+1; i < size; i++)
        {
            elements[i]=elements[i-1];
        }
        elements[index] = elem;
    }
    public int deleteElem(int index)
    {
        int result = elements[index];
        for(int i = index; i< size -1; i++)
        {
            elements[i]=elements[i+1];
        }
        reSize(size -1);
        return result;
    }
    public void clear()
    {
        for(int i = 0; i< size; i++)
        {
            System.out.println(elements[i]);
            elements[i]=0;
        }
    }
}
