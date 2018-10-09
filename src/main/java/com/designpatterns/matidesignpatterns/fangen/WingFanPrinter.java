package com.designpatterns.matidesignpatterns.fangen;

public class WingFanPrinter extends Fangen {


    public WingFanPrinter(int size, CharSet chars, Direction direction) {
        super(size, chars, direction);
        this.stream = System.out;
    }


}
