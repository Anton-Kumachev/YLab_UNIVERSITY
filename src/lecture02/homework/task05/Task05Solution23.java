package lecture02.homework.task05;
//package com.javarush.task.task05.task0532;
/*
3. Задача по алгоритмам.
Задача: Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task05Solution23 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); //количество вводимых чисел

        if (N <=0) {
            return;
        }
        //напишите тут ваш код
        int maximum = Integer.MIN_VALUE;

        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number > maximum) {
                    maximum = number;
                }
            }
        } System.out.println(maximum);
    }
}