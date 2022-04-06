package com.nasiatech.brunostar.impl;

public class IsoscelesTriangle extends Triangle{
double side;
double base;
double height;

    public IsoscelesTriangle(double side, double base, double height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return (side * 2) + base;
    }
}
