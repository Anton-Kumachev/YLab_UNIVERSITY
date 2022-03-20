package lecture03.task07;
//package com.javarush.task.task07.task0704;

/*
4. Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07Solution04 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
