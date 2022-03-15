package lecture02.homework.task05;
//package com.javarush.task.task05.task0511;

/*
3. Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Task05Solution08 {
    public class Dog {
        //напишите тут ваш код
        String name;
        int height;
        String color;

        public void initialize(String name)
        {
            this.name = name;
        }
        public void initialize(String name, int height)
        {
            this.name = name;
            this.height = height;
        }
        public void initialize(String name, int height, String color)
        {
            this.name = name;
            this.height = height;
            this.color = color;
        }
        public static void main(String[] args) {

        }
    }
}
