package lecture02.homework.task05;
//package com.javarush.task.task05.task0529;
/*
5. Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task05Solution20 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                break;
            } else {
                int number = Integer.parseInt(s);
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}
