package lecture03.task07;
//package com.javarush.task.task07.task0707;

/*
Задача 1. 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Task07Solution08 {

    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("Строка 1");
        list.add("Строка 2");
        list.add("Строка 3");
        list.add("Строка 4");
        list.add("Строка 5");
        System.out.println("В нашем списке " +list.size() + "(пять) строк:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}