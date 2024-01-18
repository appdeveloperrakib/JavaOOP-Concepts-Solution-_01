package com.appdeveloperrakib.homework_3013.SubClass;

import com.appdeveloperrakib.homework_3013.SuperClass.Shape;

public class Rectangle extends Shape {

    public int Length;
    public int Width;

    public Rectangle(int Length, int Width) {
        this.Length = Length;
        this.Width = Width;
    }

    @Override
    public double getArea() {

        double area = Length*Width;

        return area;
    }

    @Override
    public double getPerimeter() {

        double perimeter = (Length+Width)*2;

        return perimeter;
    }

    public int getLength() {
        return Length;
    }

    public int getWidth() {
        return Width;
    }
}
