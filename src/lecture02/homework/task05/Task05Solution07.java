package lecture02.homework.task05;
//package com.javarush.task.task05.task0509;

/*
2. Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь
средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Task05Solution07 {
    public class Cat {
        //напишите тут ваш код
        String name;
        int weight;
        String address;
        String color;
        int age;

        public void initialize(String name) {
            this.name = name;
            this.weight = 3;
            this.color = "black";
            this.age = 2;
        }

        public void initialize(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "black";
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
            weight = 3;
            this.color = "black";
        }

        public void initialize(int weight, String color) {
            this.weight = weight;
            this.color = color;
            name = null;
            address = null;
            age = 2;
        }

        public void initialize(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            name = null;
            age = 2;
        }
    }
}
