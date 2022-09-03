package com.raihan.patterns.Creational.AbstractFactory.GUIFactory;

import com.raihan.patterns.Creational.AbstractFactory.Button.Button;
import com.raihan.patterns.Creational.AbstractFactory.Button.MacButton;
import com.raihan.patterns.Creational.AbstractFactory.Checkbox.Checkbox;
import com.raihan.patterns.Creational.AbstractFactory.Checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
