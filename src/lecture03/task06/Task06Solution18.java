package lecture03.task06;
//package com.javarush.task.task06.task0618;

/*
2. Нужно добавить в программу новую функциональность.

Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс, который бы помог описать данную ситуацию. Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа). Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task06Solution18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Ввод с клавиатуры

        // System.out.println("Имя дедушки-кота: ");
        String grandFatherName = reader.readLine(); //Ввод имени дедушки-кота
        Cat catGrandFather = new Cat(grandFatherName); //Создание объекта дедушка-кот

        // System.out.println("Имя бабушки-кошки: ");
        String grandMotherName = reader.readLine(); //Ввод имени бабушки-кошки
        Cat catGrandMother = new Cat(grandMotherName); //Создание объекта бабушка-кошка

        // System.out.println("Имя папы-кота: ");
        String fatherName = reader.readLine(); //Ввод имени папы-кота
        Cat catFather = new Cat(fatherName, catGrandFather, null); //Создание объекта папа-кот

        // System.out.println("Имя кошки-мамы: ");
        String motherName = reader.readLine(); //Ввод имени кошки-мамы
        Cat catMother = new Cat(motherName, null, catGrandMother); //Создание объекта кошка-мама

        // System.out.println("Имя сына-котика: ");
        String sonName = reader.readLine(); //Ввод имени сына-котика
        Cat catSon = new Cat(sonName, catFather, catMother); //Создание объекта сына-котика

        // System.out.println("Имя кошки-дочки: ");
        String daughterName = reader.readLine(); //Ввод имени кошки-дочки
        Cat catDaughter = new Cat(daughterName, catFather, catMother); //Создание объекта кошки-дочери

        System.out.println(catGrandFather);    //Вывод на консоль имени дедушки-кота
        System.out.println(catGrandMother);    //Вывод на консоль имени бабушки-кошки
        System.out.println(catFather);         //Вывод на консоль имени кошки-мамы
        System.out.println(catMother);         //Вывод на консоль имени кошки-мамы
        System.out.println(catSon);            //Вывод на консоль имени сына-котика
        System.out.println(catDaughter);       //Вывод на консоль имени кошки-дочери
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother" + ", no father"; //переопределение для дедушки-кота и бабушки-кошки
            else if (mother == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
