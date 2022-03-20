package lecture03.task07;
//package com.javarush.task.task07.task0705;

/*
Array
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task07Solution06 {

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
    //Ввод строк с клавиатуры:
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++) {
         String s = reader.readLine();
         list[i] = s;
        }
    //Вывод содержимого массива на экран
        for (int i = 0; i < list.length; i++) {
            int j = list.length - i - 1;
            System.out.println(list[j]);
        }
    }
}