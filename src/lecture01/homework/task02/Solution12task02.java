package lecture01.homework.task02;
//package com.javarush.task.task02.task0219;

/*
Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/

public class Solution12task02 {

    public static void print3(String text) {
        System.out.print(text + " ");
        System.out.print(text + " ");
        System.out.print(text + " ");
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
