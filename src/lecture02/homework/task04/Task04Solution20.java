package lecture02.homework.task04;
//package com.javarush.task.task04.task0438;

/*
4. Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

import java.io.IOException;

public class Task04Solution20 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        for(int i = 1; i < 10; i++) {
            System.out.print('8');
        }
        for (int j = 0; j <= 10; j++) {
            System.out.println('8');
        }

    }
}
