package lecture03.task07;
//package com.javarush.task.task07.task0716;

/*
5. Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution22 {

    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );

        ArrayList<String> listStrings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listStrings.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(listStrings);
        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i = i + 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}