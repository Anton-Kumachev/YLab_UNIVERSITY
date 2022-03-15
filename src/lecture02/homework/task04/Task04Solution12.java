package lecture02.homework.task04;
//package com.javarush.task.task04.task0430;

/*
1. 10 чисел
Вывести на экран числа от 1 до 10, используя цикл while.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution12 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int x = 1;

        while (x <= 10) {
            System.out.println(x);
            x++;

        }
    }
}