package lecture02.homework.task04;
//package com.javarush.task.task04.task0442;

/*
3. Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить
программу. -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution24 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum = sum + number;
            if (number == -1) {
                System.out.println(sum);
                break;
            }
        }
    }
}