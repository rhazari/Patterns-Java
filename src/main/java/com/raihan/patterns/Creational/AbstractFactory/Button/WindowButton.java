package com.raihan.patterns.Creational.AbstractFactory.Button;

public class WindowButton implements Button{
    @Override
    public void paint(){
        System.out.println("This is Window Button");
    }
}
