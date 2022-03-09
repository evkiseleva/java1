package com.java.laba1;

/**
 * Реализация класса Контейнер, позволяющего хранить произвольное количество целых чисел.
 * Реализован в виде массива, позволяет добавлять, изменять, просматривать, удалять элементы
 * */

public class MyContainer {
    /**
     * Переменная, которая хранит размер контейнера
     * */
    private int size;

        /**
     * Массив , хранящий элементы контейнера
     * */
    private int[] elements;

    /**
     * Конструктор
     * */
    public MyContainer()
    {
        elements = new int[size];
    }

    /**
     * Конструктор с параметром
     * @param count параметр задающий размер контейнра
     * */
    public MyContainer(int count)
    {
        size = count;
        elements = new int[size];
    }

    /**
     * Метод, возвращающий значение элемента
     * @param index параметр задающий индекс
     * @return знавение элемента с индексом index
     * */
    public int getElem(int index)
    {
        int result = 0;
        if(index < size && index >= 0)
            result = elements[index];
        else
            System.out.println("Ошибка доступа, индекс вышел за границу. По умолчанию выведен 0");
        return result;
    }

    /** Метод, меняющий значение элемента
     * @param elem - новое значение элемента контейнера
     * @param index - номер обновляемого элемента
     * */
        public void setElem(int elem, int index)
    {
        if(index < size && index >= 0)
            elements[index] = elem;
        else
            System.out.println("Ошибка доступа, индекс вышел за границу");
    }

    /**
     * Метод, возвращающий размер контейнера
     * @return размер контейнера
     * */
    public int getSize()
    {
        return size;
    }

    /**
     * Метод, меняющий размер контейнера
     * @param newSize - новый размер контейнера
     * */
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

    /**
     * Метод, добавляющий элемент
     * @param elem - значение элемента
     * @param index - место, на которое поставить новый элемент
     * */
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

    /**
     * Метод, удаляющий элемент
     * @param index - индекс элемента, который хотим удалить
     * @return значение уаленного элемента
     * */
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

    /**
     * Метод, очищающий элементы контейнера (заменяет на 0)
     * */
    public void clear()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(elements[i]);
            elements[i]=0;
        }
    }

    /**
     * Метод, печатающий все элементы
     * */
    public void printElements()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(elements[i]);
        }
    }
}
