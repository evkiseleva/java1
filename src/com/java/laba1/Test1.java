package com.java.laba1;
/**
 * Класс для тестирования класса MyConteiner
 * */
public class Test1 {
    public void test()
    {
        System.out.println("Тест 1");
        MyContainer container = new MyContainer(5);
        int n = container.getSize();
        System.out.println("Автоматическое заполнение контейнера");
        for(int i = 0; i < n ;i++)
        {
            container.setElem( i+i*i,i);
        }
        container.printElements();
        System.out.println("Изменение значения элемента №4 на значение 5");
        container.setElem(5,4);
        container.printElements();
        System.out.println("Добавление элемента на позицию №2");
        container.addElem(14, 2);
        container.printElements();
        System.out.println("Удаление элемента №1");
        container.deleteElem(1);
        container.printElements();
        System.out.println("Очистка контейнера");
        container.clear();
        container.printElements();
    }
}
