package com.raihan.patterns.Creational.Factory;

public class WindowButton implements Button{
    public void render(){
        System.out.println("Rendering a Windows Button...");
        onClick();
    }

    public void onClick(){
        System.out.println("Click Windows Button-- Hello World!");
    }
}
