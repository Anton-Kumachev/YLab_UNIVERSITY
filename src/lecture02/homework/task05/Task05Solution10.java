package lecture02.homework.task05;
//package com.javarush.task.task05.task0513;

/*
5. Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Task05Solution10 {
    public class Rectangle {
        //напишите тут ваш код
        public int left;
        public int top;
        public int width;
        public int height;
        public String name;

        public void initialize(int left, int top, int width, int height) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        }
        public void initialize(int left, int top) {
            this.left = left;
            this.top = top;
        }
        public void initialize(int left, int top, int width) {
            this.left = left;
            this.top = top;
            this.width = width;
        }
        public void initialize(int left, int top, int width, String name) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            this.name = name;
        }
        public static void main(String[] args) {

        }
    }
}
