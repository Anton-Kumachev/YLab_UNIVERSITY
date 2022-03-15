package lecture02.homework.task04;
//package com.javarush.task.task04.task0439;

/*
5. Все любят Мамбу
Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution21 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
