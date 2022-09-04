package com.raihan.patterns.Creational.Factory;

public class HTMLDialog extends Dialog{
    @Override
    public Button createButton(){
        return new HTMLButton();
    }
}
