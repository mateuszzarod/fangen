package com.designpatterns.matidesignpatterns.fangen;


import java.io.PrintStream;

//tutaj stworzyć fabrykę


public class Fangen implements Drawable {

    protected PrintStream stream;
    protected int size;
    protected Direction direction;
    protected CharSet chars;

    public Fangen(int size, CharSet chars, Direction direction) {
        this.size = Math.abs(size * 2);
        this.direction = direction;
        this.chars = chars;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.size; ++i) {
            for (int j = 0; j < this.size; ++j) {
                // Prawo

                if (direction == Direction.CLOCKWISE) {

                    if (i < size / 2) {
                        // Lewy gorny
                        if (j < size / 2) {
                            if (j < i + 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy gorny
                        else {
                            if (j < size - i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    } else {
                        // Lewy dolny
                        if (j < size / 2) {
                            if (j >= size - i - 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy dolny
                        else {
                            if (j >= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                }
                // Lewo
                if (direction == Direction.COUNTERCLOCKWISE){
                    if (i < size / 2) {
                        // Lewy gorny
                        if (j < size / 2) {
                            if (j >= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy gorny
                        else {
                            if (j >= size - i - 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    } else {
                        // Lewy dolny
                        if (j < size / 2) {
                            if (j < size - i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy dolny
                        else {
                            if (j <= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                }

            }
            stream.println();
        }
        stream.println();
    }

    //todo
    @Override
    public void printFan(int size, Direction directionEnum) {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                // Prawo
                if (directionEnum == Direction.CLOCKWISE) {
                    if (i < size / 2) {
                        // Lewy gorny
                        if (j < size / 2) {
                            if (j < i + 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy gorny
                        else {
                            if (j < size - i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    } else {
                        // Lewy dolny
                        if (j < size / 2) {
                            if (j >= size - i - 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy dolny
                        else {
                            if (j >= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                }
                // Lewo
                if (directionEnum == Direction.COUNTERCLOCKWISE){
                    if (i < size / 2) {
                        // Lewy gorny
                        if (j < size / 2) {
                            if (j >= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy gorny
                        else {
                            if (j >= size - i - 1)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    } else {
                        // Lewy dolny
                        if (j < size / 2) {
                            if (j < size - i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                        // Prawy dolny
                        else {
                            if (j <= i)
                                stream.print(chars.getPen());
                            else
                                stream.print(chars.getBack());
                        }
                    }
                }
            }
            stream.println();
        }
        stream.println();
    }
}


