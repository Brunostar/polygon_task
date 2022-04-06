package com.nasiatech.brunostar.impl;

public class EquilateralTriangle extends Triangle{
    double side;
    double height;
    double base = side;

    public EquilateralTriangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}
