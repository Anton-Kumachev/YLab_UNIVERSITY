package lecture02.homework.task04;
//package com.javarush.task.task04.task0432;

/*
3. Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз, используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution14 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        while (num > 0) {
            System.out.println(str);
            num--;
        }
    }
}