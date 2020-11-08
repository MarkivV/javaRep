package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class People {
public static void main(String[] args) throws IOException, ClassNotFoundException{
    FileInputStream fis = new FileInputStream("NewText.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Person std = (Person) ois.readObject();


    System.out.println(std);


    ois.close();
}
}
