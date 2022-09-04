package com.raihan.patterns.Creational.Factory;

public class HTMLButton implements Button{
    public void render(){
        System.out.println("<button>Rendering an HTML Button...</button>");
        onClick();
    }

    public void onClick(){
        System.out.println("Click HTML Button-- Hello World!");
    }
}
