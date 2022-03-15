package lecture02.homework.task05;
//package com.javarush.task.task05.task0501;

/*
1. Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String),
возраст (age, int), вес (weight, int), сила (strength, int).
*/


public class Task05Solution01 { //Cat
        //напишите тут ваш код
        String name;
        int age;
        int weight;
        int strength;


        public static void main(String[] args) {
            Task05Solution01 cat = new Task05Solution01(); //Cat
            cat.name = "Barsik";
            cat.age = 3;
            cat.weight = 5;
            cat.strength = 40;

            System.out.println("Имя кота: " + cat.name);
            System.out.println("Возраст: " + cat.age);
            System.out.println("Вес: " + cat.weight);
            System.out.println("Длина: " + cat.strength);
        }
    }