package lecture03.task07;
//package com.javarush.task.task07.task0705;

/*
ArrayList
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Task07Solution07 {

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
    //Ввод строк с клавиатуры:
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
         String s = reader.readLine();
         list.add(s);
        }
    //Вывод содержимого массива на экран
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}