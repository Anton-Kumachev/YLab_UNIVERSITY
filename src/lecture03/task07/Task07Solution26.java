package lecture03.task07;
//package com.javarush.task.task07.task0722;

/*
4. Вводить с клавиатуры строки, пока пользователь не введёт строку “end"
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Task07Solution26 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String string = reader.readLine();
            if (string.equals("end")) {
                break;
            }
            list.add(string);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}