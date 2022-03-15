package lecture02.homework.task05;
//package com.javarush.task.task05.task0504;

/*
4. Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными. Использовать класс Cat из первой задачи.
Класс Cat создавать не надо.
*/

public class Task05Solution04 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Pushok", 1, 1, 1);
        Cat cat2 = new Cat("Vaska", 3, 3, 5);
        Cat cat3 = new Cat("Shtorm", 5, 10, 10);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
