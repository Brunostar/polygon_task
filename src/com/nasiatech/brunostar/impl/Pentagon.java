package com.nasiatech.brunostar.impl;

import com.nasiatech.brunostar.Polygon;

public class Pentagon implements Polygon {
    double side;
    double apothem;

    public Pentagon(double side, double apothem) {
        this.side = side;
        this.apothem = apothem;
    }

    @Override
    public double getArea() {
        return 0.5 * this.apothem * this.getPerimeter();
    }

    @Override
    public double getPerimeter() {
        return 5 * this.side;
    }
}
