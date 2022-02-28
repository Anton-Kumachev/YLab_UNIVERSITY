package lecture01.homework.task03;
//package com.javarush.task.task03.task0320;

/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
 */

import java.io.*;

public class Solution12task03 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        System.out.print(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}
