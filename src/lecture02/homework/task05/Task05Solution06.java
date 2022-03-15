package lecture02.homework.task05;
//package com.javarush.task.task05.task0504;

/*
1. Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Task05Solution06 { //Friend
         //напишите тут ваш код
        String name;
        int age;
        char sex;
        //Перегрузка методов:
        public void initialize(String name)
        {
            this.name = name;
        }

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void initialize(String name, int age, char sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public static void main(String[] args) {

        }
    }
