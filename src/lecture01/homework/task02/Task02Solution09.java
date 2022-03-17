package lecture01.homework.task02;
//package com.javarush.task.task02.task0216;

/*
Минимум трёх чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
*/

public class Task02Solution09 {

    public static int min(int a, int b, int c) {

        int m;
        if (a <= b && a <= c)
            m = a;
        else if (b <= a && b <= c)
            m = b;
        else
            m = c;
        return m;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
