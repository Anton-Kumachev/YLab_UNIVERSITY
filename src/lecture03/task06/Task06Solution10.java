package lecture03.task06;
//package com.javarush.task.task06.task0613;

/*
1. Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount. Создай конструктор [public Cat()].
Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Task06Solution10 {

    public static void main(String[] args) {
        // Создай 10 котов
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount;

        // Создай конструктор
        public Cat() {
            catCount++;
        }
    }
}