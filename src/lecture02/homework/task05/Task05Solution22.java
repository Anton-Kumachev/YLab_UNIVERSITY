package lecture02.homework.task05;
//package com.javarush.task.task05.task0531;
/*
2. Нужно добавить в программу новую функциональность.
Старая Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task05Solution22 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min = a < b ? a : b;
        min = min < c ? min : c;
        min = min < d ? min : d;
        min = min < e ? min : e;
        return min;
    }
}