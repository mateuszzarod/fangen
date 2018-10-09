package com.designpatterns.matidesignpatterns.prototype2;

public class Prototype<T> implements Cloneable {

    //musimy napisać metodę, bo samo użycie interfejsu oznacza, że klasa nadaje się do klonowania "oznacza" sie tak klasę
    //wywołujemy metodę clone z klasy rodzica (object)
    @Override
    public T clone() throws CloneNotSupportedException{
        return (T)super.clone();
    }
}
