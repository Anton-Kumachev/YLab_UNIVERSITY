package lecture03.task07;
//package com.javarush.task.task07.task0720;

/*
2. Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N и M
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution24 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine()); //Ввод первого числа с клавиатуры
        int M = Integer.parseInt(reader.readLine()); //Ввод второго числа с клавиатуры

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            list.add(reader.readLine()); //Добавляем в список то, что ввели с клавиатуры
        }

        for (int j = 0; j < M; j++) {
            list.add(list.remove(0));
        }

        for (String strings : list) {
            System.out.println(strings);
        }
    }
}