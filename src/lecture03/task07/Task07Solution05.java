package lecture03.task07;
//package com.javarush.task.task07.task0705;

/*
5. Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй
маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

// Решение "в лоб":

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07Solution05 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayBig = new int[20]; //Создаём массив на 20 элементов
        int[] arraySmall1 = new int[10]; //Создаём ПЕРВЫЙ массив на 10 элементов

        for (int i = 0; i < arrayBig.length; i++) {
            arrayBig[i] = Integer.parseInt(reader.readLine());//Заполняем массив на 20 элементов с клавиатуры
        }

        for (int i = 0; i < arraySmall1.length; i++) {
            arraySmall1[i] = arrayBig[i];
        }

        System.out.println("");

        int[] arraySmall2 = new int[10]; //Создаём ВТОРОЙ массив на 10 элементов
        for (int i = 0; i < arraySmall2.length; i++) {
            arraySmall2[0] = arrayBig[10];
            arraySmall2[1] = arrayBig[11];
            arraySmall2[2] = arrayBig[12];
            arraySmall2[3] = arrayBig[13];
            arraySmall2[4] = arrayBig[14];
            arraySmall2[5] = arrayBig[15];
            arraySmall2[6] = arrayBig[16];
            arraySmall2[7] = arrayBig[17];
            arraySmall2[8] = arrayBig[18];
            arraySmall2[9] = arrayBig[19];

            System.out.println(arraySmall2[i]);
        }
    }
}