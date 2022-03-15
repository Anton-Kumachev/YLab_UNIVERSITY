package lecture02.homework.task04;
//package com.javarush.task.task04.task0406;
/*
Программа учета имен
*/

/*Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
private String fullName равное значению локальной переменной String fullName.  */

public class Task04Solution04 {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код
        this.fullName = fullName;
    }

    public static void main(String[] args) {
        Task04Solution04 name = new Task04Solution04();
        name.setName("Anton", "Kumachev");
        System.out.println(name.fullName);
    }
}
