package com.designpatterns.matidesignpatterns.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTestSuite {

    @Test
    public void PrototypeTestSuite(){
        //Given
        CloneFactory factory = new CloneFactory();
        Sheep dolly = new Sheep();
        //When
        Sheep clonedSheep = (Sheep) factory.getClone(dolly);
        System.out.println(dolly.hashCode());
        System.out.println(clonedSheep.hashCode());
        System.out.println("Dolly's toString" + " " + dolly.toString());
        System.out.println("Cloned sheep's toString" + " "  + clonedSheep.toString());

        //Then
        Assert.assertEquals(dolly.toString(), clonedSheep.toString());
    }

}
