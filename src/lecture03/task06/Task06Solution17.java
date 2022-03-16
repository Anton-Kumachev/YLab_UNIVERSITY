package lecture03.task06;
//package com.javarush.task.task06.task0618;

/*
1. Нужно исправить программу, чтобы компилировалась и работала.
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25».
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task06Solution17 {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max2 = a > b ? a : b;

        System.out.println(max + max2);
    }
}
