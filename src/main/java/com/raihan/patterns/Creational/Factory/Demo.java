package com.raihan.patterns.Creational.Factory;

import java.util.Scanner;

public class Demo {
    public static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    static void configure(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Windows Dialog");
        System.out.println("Enter 2 for HTML Dialog");

        Integer value = input.nextInt();
        switch (value){
            case 1:
                dialog = new WindowDialog();
                break;
            case 2:
                dialog = new HTMLDialog();
                break;
            default:
                System.out.println("You have to enter either 1 or 2");
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
