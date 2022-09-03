package com.raihan.patterns.Creational.AbstractFactory;

import com.raihan.patterns.Creational.AbstractFactory.GUIFactory.GUIFactory;
import com.raihan.patterns.Creational.AbstractFactory.GUIFactory.MacFactory;
import com.raihan.patterns.Creational.AbstractFactory.GUIFactory.WindowFactory;

import java.util.Scanner;

public class Demo {
    public static Application createApplication(){
        GUIFactory factory;
        System.out.println("Enter 1 for Window Factory");
        System.out.println("Enter 2 for Mac Factory");
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();
        switch (value){
            case 1:
                factory = new WindowFactory();
                break;
            case 2:
                factory = new MacFactory();
                break;
            default:
                System.out.println("Creating a Window Factory by default");
                factory = new WindowFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args){
        Application app = createApplication();
        app.paint();
    }
}
