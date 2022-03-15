package lecture02.homework.task04;
//package com.javarush.task.task04.task0434;

/*
5. Таблица умноження
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
Example output:
1	2	3	4	5	6	7	8	9	10
2	4	6	8	10	12	14	16	18	20
3	6	9	12	15	18	21	24	27	30
...
*/

import java.io.IOException;

public class Task04Solution16 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int n = 1;
        while (n <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print(n * i + " ");
                i++;
            }
            System.out.println(" ");
            n++;
        }
    }
}
