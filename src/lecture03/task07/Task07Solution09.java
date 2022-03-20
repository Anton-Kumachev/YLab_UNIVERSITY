package lecture03.task07;
//package com.javarush.task.task07.task0707;

/*
Задача 2. Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution09 {

    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        String maxStr = strings.get(0);
        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() > maxStr.length()) {
                maxStr = strings.get(j);
                }
        }

       //Вывод на экран всех самых длинных строк:
       for (int k = 0; k < strings.size(); k++) {
            if (strings.get(k).length() == maxStr.length()) {
                System.out.println(strings.get(k));
            }
        }
    }
}
