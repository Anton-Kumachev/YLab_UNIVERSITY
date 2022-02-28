package lecture01.homework.task02;
//package com.javarush.task.task02.task0214;

/*
Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
*/

public class Solution07task02 {

    public static int min(int a, int b) {
        int m;
        if (a < b)
            m = a;
        else
            m = b;
        return m;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
