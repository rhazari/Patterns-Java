package com.raihan.patterns.Creational.Factory;

/*
* Factory return a new Product Object
* Make the factory method abstract to force
* subclasses to implement their version
* */
public abstract class Dialog {
    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
