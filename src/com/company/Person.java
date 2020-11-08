package com.company;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {
    private String name;
    private String login;
    private int age;
    private String hobby;
    public Person() {
        System.out.println("Введите имя: ");
        Scanner xscan = new Scanner(System.in);
        name = xscan.nextLine();

        System.out.println("Введите логин: ");
        Scanner yscan = new Scanner(System.in);
        login = yscan.nextLine();

        System.out.println("Введите возраст: ");
        Scanner zscan = new Scanner(System.in);
        age = zscan.nextInt();

        System.out.println("Введите Хобби: ");
        Scanner vscan = new Scanner(System.in);
        hobby = vscan.nextLine();
    }
    public Person(String name, String login, int age, String hobby) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobby=hobby;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
