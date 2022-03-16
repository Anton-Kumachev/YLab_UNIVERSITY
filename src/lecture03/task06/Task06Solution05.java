package lecture03.task06;
//package com.javarush.task.task06.task0604;

/*
1. Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()],
в котором увеличивай данную переменную на 1.
*/

public class Task06Solution05 {
    public static class Cat {
        //напишите тут ваш код
        static int catCount;

        public Cat() {
            Cat.catCount++;
        }
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                Cat cat = new Cat();
            }
            System.out.println(catCount);
        }

    }
}