package com.appdeveloperrakib.homework_3013.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.widget.TextView;

import com.appdeveloperrakib.homework_3013.R;
import com.appdeveloperrakib.homework_3013.SubClass.Circle;
import com.appdeveloperrakib.homework_3013.SubClass.Rectangle;
import com.appdeveloperrakib.homework_3013.SubClass.Triangle;
import com.appdeveloperrakib.homework_3013.SuperClass.Shape;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Shape rectangle = new Rectangle(10,12);
        Double areaofRectangle = rectangle.getArea();
        Double perimeterofRactangle = rectangle.getPerimeter();
        int lengthOfRectangle = ((Rectangle) rectangle).getLength();
        int widthOfRectangle =  ((Rectangle) rectangle).getWidth();

        textView.append("\n\n Rectangle : Length :"+lengthOfRectangle+" Width:"+widthOfRectangle);
        textView.append("\n Area : "+areaofRectangle);
        textView.append("\n Perimeter: "+perimeterofRactangle);

        Shape Circle = new Circle(5);
        Double areaofCircle = Circle.getArea();
        Double perimeterofCircle = Circle.getPerimeter();
        int lengthOfCircle = (int) ((Circle) Circle).getR();

        textView.append("\n\n Circle : Radius:"+lengthOfCircle);
        textView.append("\n Area : "+areaofCircle);
        textView.append("\n Perimeter: "+perimeterofCircle);

        Shape Triangle = new Triangle(7,8,6);
        Double areaofTriangle = Triangle.getArea();
        Double perimeterofTriangle = Triangle.getPerimeter();
        int side1OfTriangle = (int) ((Triangle) Triangle).getSide1();
        int side2OfTriangle = (int) ((Triangle) Triangle).getSide2();
        int side3OfTriangle = (int) ((Triangle) Triangle).getSide3();


        textView.append("\n\n Circle : Side1:"+side1OfTriangle+" Side2:"+side2OfTriangle+" Side3:"+side3OfTriangle);
        textView.append("\n Area : "+areaofTriangle);
        textView.append("\n Perimeter: "+perimeterofTriangle);







    }
}