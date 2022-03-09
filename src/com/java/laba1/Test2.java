package com.java.laba1;
/**
 * Класс для тестирования класса MyConteiner
 * */
public class Test2 {
    public void test()
    {
        System.out.println("Тест 2");
        MyContainer container = new MyContainer(10);
        int n = container.getSize();
        System.out.println("Автоматическое заполнение контейнера");
        for(int i = 0; i < n ;i++)
        {
            container.setElem( i+1+i*i,i);
        }
        container.printElements();
        System.out.println("Изменение значения элемента №0 на значение 121");
        container.setElem(121,0);
        container.printElements();
        System.out.println("Изменение значения элемента №40 на значение 5");
        container.setElem(5,40);
        container.printElements();
        System.out.println("Добавление элемента(значение = 14) на позицию №-1");
        container.addElem(14, -1);
        container.printElements();
        System.out.println("Добавление элемента(значение = 21) на позицию №1");
        container.addElem(21, 1);
        container.printElements();
        System.out.println("Удаление элемента №100");
        container.deleteElem(100);
        container.printElements();
        System.out.println("Очистка контейнера");
        container.clear();
        container.printElements();
    }
}
