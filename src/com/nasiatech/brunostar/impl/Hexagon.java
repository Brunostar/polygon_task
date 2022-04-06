package com.nasiatech.brunostar.impl;

import com.nasiatech.brunostar.Polygon;

import static java.lang.Math.sqrt;

public class Hexagon implements Polygon {
    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (3 * sqrt(3))/2 * this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 6 * this.side;
    }
}
