package com.designpatterns.matidesignpatterns.prototype2;

public class Task {
    final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "     Task [" + name + "]";
    }
}
