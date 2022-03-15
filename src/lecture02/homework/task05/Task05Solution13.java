package lecture02.homework.task05;
//package com.javarush.task.task05.task0518;

/*
3. Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Task05Solution13 {
    public class Dog {
        //напишите тут ваш код
        public String name;
        public int height;
        public String color;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }

        public static void main(String[] args) {

        }
    }
}