package com.nasiatech.brunostar.impl;

import com.nasiatech.brunostar.Polygon;

import static java.lang.Math.sin;

public class Quadrilateral implements Polygon {
    double side1;
    double side2;
    double side3;
    double side4;
    double side1and4angle;
    double side2and3angle;

    public Quadrilateral(double side1, double side2,
                         double side3, double side4,
                         double side1and4angle, double side2and3angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side1and4angle = side1and4angle;
        this.side2and3angle = side2and3angle;
    }

    @Override
    public double getArea() {
        return (0.5*side1*side4*sin(side1and4angle)) + (0.5*side2*side3*sin(side2and3angle));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    }
}
