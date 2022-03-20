package lecture03.task07;
//package com.javarush.task.task07.task0705;

/*
5. Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

//Альтернатвный вариант решения:


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07Solution05_alternative_solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10]; // Умно придумано)
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
}