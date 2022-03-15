package lecture02.homework.task05;
//package com.javarush.task.task05.task0504;

/*
5. Провести три боя попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Task05Solution05 { //Cat
        public static void main(String[] args) {
            //напишите тут ваш код
            Cat cat1 = new Cat("Barsik", 3, 5, 8);
            Cat cat2 = new Cat("Vaska", 2, 3, 5);
            Cat cat3 = new Cat("Pushok", 1, 2, 4);

            System.out.println(cat1.fight(cat2));
            System.out.println(cat2.fight(cat3));
            System.out.println(cat3.fight(cat1));
        }

        public static class Cat { //Cat

            protected String name;
            protected int age;
            protected int weight;
            protected int strength;

            public Cat (String name, int age, int weight, int strength) { //Cat
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }

            public boolean fight(Cat anotherCat) { //Cat
                int ageScore = Integer.compare(this.age, anotherCat.age);
                int weightScore = Integer.compare(this.weight, anotherCat.weight);
                int strengthScore = Integer.compare(this.strength, anotherCat.strength);

                int score = ageScore + weightScore + strengthScore;
                return score > 0; // return score > 0 ? true : false;
            }
        }
    }
