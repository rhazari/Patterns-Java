package com.raihan.patterns.Creational.Factory;

/*
* Declare the interface common to all objects
* Can be produced by the Factory & its subclasses
* */
public interface Button {
    void render();
    void onClick();
}
