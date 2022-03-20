package lecture03.task07;
//package com.javarush.task.task07.task0726;

/*
1. Нужно исправить программу, чтобы компилировалась и работала.
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.
Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution30 {

        public final static ArrayList<Cat> CATS = new ArrayList<>();

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Введите имя первого кота: ");
                String name = reader.readLine();
                if (name == null || name.isEmpty()) {
                    break;
                }
                System.out.print("Введите возраст кота, лет: ");
                int age = Integer.parseInt(reader.readLine());
                System.out.print("Введите вес кота, кг: ");
                int weight = Integer.parseInt(reader.readLine());
                System.out.print("Введите длину хвоста кота, см: ");
                int tailLength = Integer.parseInt(reader.readLine());

                Cat cat = new Cat(name, age, weight, tailLength);
                CATS.add(cat);
            }

            printList();
        }

        public static void printList() {
            for (int i = 0; i < CATS.size(); i++) {
                System.out.println(CATS.get(i));
            }
        }

        public static class Cat {
            private String name;
            private int age;
            private int weight;
            private int tailLength;

            Cat(String name, int age, int weight, int tailLength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.tailLength = tailLength;
            }

            @Override
            public String toString() {
                return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
            }
        }
}
