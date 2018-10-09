package com.designpatterns.matidesignpatterns.fangen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n;
            CharSet chars = new CharSet('.', '*');

            while ((n = Integer.parseInt(reader.readLine())) != 0)
            {
                new WingFanPrinter(n, chars, Direction.COUNTERCLOCKWISE).draw();
                new WingFanPrinter(n, chars, Direction.COUNTERCLOCKWISE).printFan(n, Direction.COUNTERCLOCKWISE);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
