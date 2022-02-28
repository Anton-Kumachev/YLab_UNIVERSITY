package lecture01.homework.task02;
//package com.javarush.task.task02.task0218;

/*
Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
Повторенье-мать
*/

public class Solution11task02 {

    public static void print3(String text) {
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

    public static void main(String[] args) {
        print3("I love Java!");
    }
}
