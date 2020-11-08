package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        Person std = new Person();
        try {
            FileOutputStream fos = new FileOutputStream("NewText.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(std);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
