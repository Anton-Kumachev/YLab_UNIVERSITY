package lecture01.homework.task03;
//package com.javarush.task.task03.task0325;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».

Пример:
Я буду зарабатывать $50 в час
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution17task03 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String price = reader.readLine();
        System.out.println("Я буду зарабатывать $" + price + " в час");
    }
}

