package com.appdeveloperrakib.homework_3013.SubClass;

import com.appdeveloperrakib.homework_3013.SuperClass.Shape;

public class Triangle extends Shape {

    private double side1;
    private  double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {

        Double s = (side1+side2+side3)/2;
        Double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    public double getPerimeter() {

        Double perimeter = side1+side2+side3;

        return perimeter;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
