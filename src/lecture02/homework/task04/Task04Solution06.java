package lecture02.homework.task04;
//package com.javarush.task.task04.task0418;

/*
Задача 1. Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution06 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int min = a <= b ? a : b;
        System.out.println(min);
    }
}
