package lecture02.homework.task04;
//package com.javarush.task.task04.task0422;

/*
Задача 5. 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution10 {
    public static void main(String[] args) throws IOException {
//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18 ) {
            System.out.println("Подрасти еще");
        }
//        String answer = age > 18 ? null : "Подрасти еще";
        //      System.out.println(answer);
    }
}
