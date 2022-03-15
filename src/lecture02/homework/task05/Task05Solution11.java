package lecture02.homework.task05;
//package com.javarush.task.task05.task0516;

/*
1. Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Task05Solution11 {
    public class Friend {
        //напишите тут ваш код
        private String name;
        private int age;
        private char sex;

        public Friend(String name) {
            this.name = name;
        }

        public Friend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Friend(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public static void main(String[] args) {

        }
    }
}
