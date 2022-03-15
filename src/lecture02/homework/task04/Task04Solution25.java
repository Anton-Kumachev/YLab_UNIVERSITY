package lecture02.homework.task04;
//package com.javarush.task.task04.task0443;

/*
4. Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution25 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Как Вас зовут?");

        String name = reader.readLine();

        System.out.println("Введите цифры даты своего рождения:");
        System.out.println("Число, когда Вы родились:");
        String d = reader.readLine();
        System.out.println("Месяц:");
        String m = reader.readLine();
        System.out.println("Год:");
        String y = reader.readLine();
        System.out.println();
        System.out.println("Итого получилось:");
        System.out.println("Вас зовут " + name + ".");
        System.out.println("И Вы родились: " + d + "." + m + "." + y);
    }
}