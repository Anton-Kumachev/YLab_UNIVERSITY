package lecture03.task07;
//package com.javarush.task.task07.task0714;

/*
2. Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы
в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution19 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        list.remove(2);

        for (int i = list.size() - 1 ; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}