package lecture02.homework.task04;
//package com.javarush.task.task04.task0407;

/*
Кошки во Вселенной
*/


/* Написать код, который бы подсчитывал количество созданных котов (count)
и на экран выдавалось правильно их количество.*/

public class Task04Solution05 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}