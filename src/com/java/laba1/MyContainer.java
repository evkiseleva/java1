package com.java.laba1;

/**
 * Реализация класса Контейнер, позволяющего хранить произвольное количество целых чисел.
 * Реализован в виде массива, позволяет добавлять, изменять, просматривать, удалять элементы
 * */

public class MyContainer {
    private int size; /** Размер контейнера */
    private int[] elements; /** Элементы контейнера */
    /** Конструктор */
    public MyContainer()
    {
        elements = new int[size];
    }
    /** Конструктор с параметром */
    public MyContainer(int count)
    {
        size = count;
        elements = new int[size];
    }
    /** Метод, возвращающий значение элемента */
    public int getElem(int index)
    {
        int result = 0;
        if(index < size && index >= 0)
            result = elements[index];
        else
            System.out.println("Ошибка доступа, индекс вышел за границу. По умолчанию выведен 0");
        return result;
    }
    /** Метод, меняющий значение элемента */
    public void setElem(int elem, int index)
    {
        if(index < size && index >= 0)
            elements[index] = elem;
        else
            System.out.println("Ошибка доступа, индекс вышел за границу");
    }
    /** Метод, возвращающий размер контейнера */
    public int getSize()
    {
        return size;
    }
    /** Метод, меняющий размер контейнера */
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
    /** Метод, добавляющий элемент */
    public void addElem(int elem, int index)
    {
        if (index < size+1 && index >= 0)
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
    /** Метод, удаляющий элемент */
    public int deleteElem(int index)
    {
        int result = 0;
        if (index<size && index >= 0)
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
    /** Метод, очищающий элементы контейнера (заменяет на 0) */
    public void clear()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(elements[i]);
            elements[i]=0;
        }
    }
    /** Метод, печатающий все элементы */
    public void printElements()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(elements[i]);
        }
    }
}
