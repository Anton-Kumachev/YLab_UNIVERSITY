package lecture02.homework.task04;
//package com.javarush.task.task04.task0436;

/*
2. Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution18 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int m = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int n = Integer.parseInt(num2);

        for(int i = 1; i <= m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" 8 ");
            }
            System.out.println(" 8 ");
        }
    }
}
