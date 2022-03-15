package lecture02.homework.task05;
//package com.javarush.task.task05.task0530;
/*
1. Нужно исправить программу, чтобы компилировалась и работала.
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task05Solution21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}