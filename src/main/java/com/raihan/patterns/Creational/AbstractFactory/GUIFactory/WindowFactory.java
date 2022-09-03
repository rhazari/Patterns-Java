package com.raihan.patterns.Creational.AbstractFactory.GUIFactory;

import com.raihan.patterns.Creational.AbstractFactory.Button.Button;
import com.raihan.patterns.Creational.AbstractFactory.Button.WindowButton;
import com.raihan.patterns.Creational.AbstractFactory.Checkbox.Checkbox;
import com.raihan.patterns.Creational.AbstractFactory.Checkbox.WindowCheckbox;

public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowCheckbox();
    }
}
