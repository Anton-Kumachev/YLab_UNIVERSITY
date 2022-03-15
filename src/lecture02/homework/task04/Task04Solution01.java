package lecture02.homework.task04;
//package com.javarush.task.task04.task0403;

/*
Как зовут кота?
*/
/*Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
private String name равное переданному параметру String name.*/

public class Task04Solution01 { // Cat
        private String name = "безымянный кот";

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }

        public static void main(String[] args) {
            Task04Solution01 cat = new Task04Solution01(); // Cat
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }
