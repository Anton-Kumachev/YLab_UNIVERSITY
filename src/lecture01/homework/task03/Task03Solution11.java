package lecture01.homework.task03;
//package com.javarush.task.task03.task0318;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
( Последовательность вводимых данных имеет большое значение.)

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03Solution11 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String years = reader.readLine();
        System.out.print(name + " захватит мир через " +  years + " лет. Му-ха-ха!");
    }
}
