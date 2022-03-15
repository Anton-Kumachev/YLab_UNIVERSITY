package lecture02.homework.task05;
//package com.javarush.task.task05.task0528;

/*
4. Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде «21 06 2015».
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task05Solution19 {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();

        System.out.println(formatter.format(date));
    }
}