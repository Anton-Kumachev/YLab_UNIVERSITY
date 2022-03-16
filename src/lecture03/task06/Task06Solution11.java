package lecture03.task06;
//package com.javarush.task.task06.task0614;

/*
2. Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.

Подсказка: Чтобы создать переменную cats, используйте конструкцию:
public static ArrayList<Cat> cats = new ArrayList<Cat>();
*/

import java.util.ArrayList;

public class Task06Solution11 {

    public static class Cat { //Cat
        //напишите тут ваш код
        public static ArrayList<Cat> cats = new ArrayList<Cat>();

        public Cat() {
        }

        public static void main(String[] args) {
            //напишите тут ваш код
            for (int i = 0; i < 10; i++) {
                cats.add(new Cat());
            }
            printCats();
        }

        public static void printCats() {
            //напишите тут ваш код
            for (int i = 0; i < 10; i++) {
                System.out.println(cats.get(i));
            }
        }
    }
}