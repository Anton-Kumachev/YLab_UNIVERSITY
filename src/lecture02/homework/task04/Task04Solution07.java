package lecture02.homework.task04;
//package com.javarush.task.task04.task0419;

/*
Задача 2. Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution07 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max = a > b ? a : b;
        max = max > c ? max : c;
        max = max > d ? max : d;
        System.out.println(max);
    }
}
