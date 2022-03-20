package lecture03.task07;
//package com.javarush.task.task07.task0715;

/*
3. Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution20 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        strings.add(1,"именно");
        strings.add(3,"именно");
        strings.add(5,"именно");

        for (int i = 0; i < strings.size() ; i++) {
            System.out.println(strings.get(i));
        }
    }

}