package lecture02.homework.task04;
//package com.javarush.task.task04.task0423;

/*
Задача 6. И 18-ти достаточно
Ввести с клавиатуры имя и возраст.
Если возраст больше 20 вывести надпись «И 18-ти достаточно»
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution11 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20 ) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
