package lecture02.homework.task04;
//package com.javarush.task.task04.task0404;

/*
Учет котов
*/

/*Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось
на 1. За количество котов отвечает переменная catsCount.*/

public class Task04Solution02 { // Cat
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        catsCount++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            addNewCat();
        }
        System.out.println(catsCount);
    }
}
