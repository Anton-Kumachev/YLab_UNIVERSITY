package lecture02.homework.task04;
//package com.javarush.task.task04.task0437;

/*
3. Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution19 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
    }
}
