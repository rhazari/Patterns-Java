package com.raihan.patterns.Creational.AbstractFactory.GUIFactory;

import com.raihan.patterns.Creational.AbstractFactory.Button.Button;
import com.raihan.patterns.Creational.AbstractFactory.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
