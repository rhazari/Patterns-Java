package com.raihan.patterns.Creational.Factory;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton(){
        return new WindowButton();
    }
}
