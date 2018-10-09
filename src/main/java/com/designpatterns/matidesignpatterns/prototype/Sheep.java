package com.designpatterns.matidesignpatterns.prototype;

public class Sheep implements Animal {

    public Sheep(){
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep makeCopy is beeing made");
        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
            //make copy of this object and cast it to (Sheep)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepObject;
    }

    public String toString(){
        return "Dolly is my hero";
    }

}
