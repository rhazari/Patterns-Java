package com.raihan.patterns.Creational.AbstractFactory;

import com.raihan.patterns.Creational.AbstractFactory.Button.Button;
import com.raihan.patterns.Creational.AbstractFactory.Checkbox.Checkbox;
import com.raihan.patterns.Creational.AbstractFactory.GUIFactory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
