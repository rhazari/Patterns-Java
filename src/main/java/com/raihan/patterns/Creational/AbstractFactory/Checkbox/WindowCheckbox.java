package com.raihan.patterns.Creational.AbstractFactory.Checkbox;

public class WindowCheckbox implements Checkbox{
    @Override
    public void paint(){
        System.out.println("This is a Window Checkbox");
    }
}
