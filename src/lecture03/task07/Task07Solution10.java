package lecture03.task07;
//package com.javarush.task.task07.task0709;

/*
Задача 3. Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution10 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();

        for (String string : list) {
            if (string.length() < min) {
                min = string.length();
            }
        }

        for(String string : list) {
            if (string.length() == min) {
                System.out.println(string);
            }
        }
    }
}