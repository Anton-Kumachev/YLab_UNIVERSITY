package lecture01.homework.task03;
//package com.javarush.task.task03.task0314;

/* Таблица умножения
 */

public class Solution07task03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
