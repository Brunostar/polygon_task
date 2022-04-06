package com.nasiatech.brunostar.impl;

import com.nasiatech.brunostar.Polygon;

public class Triangle implements Polygon {
    double side1;
    double side2;
    double base;
    double height;

    public Triangle(double side1, double side2, double base, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    public Triangle(){}

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + base;
    }
}
