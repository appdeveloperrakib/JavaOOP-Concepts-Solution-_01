package com.appdeveloperrakib.homework_3013.SubClass;

import com.appdeveloperrakib.homework_3013.SuperClass.Shape;

public class Circle extends Shape {
    private double r;

    public Circle( double r) {

        this.r =  r;
    }

    @Override
    public double getArea() {

        double area = 3.1416*r*r;

        return area;
    }

    @Override
    public double getPerimeter() {
        Double perimeter = 2*3.1416*r;
        return perimeter;
    }

    public double getR() {
        return r;
    }
}
