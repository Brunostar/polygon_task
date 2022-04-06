package com.nasiatech.brunostar.impl;

import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome...");
            System.out.println("What type of Polygon would you like to create?\n");
            System.out.println("Enter (E) for Equilateral Triangle\n");
            System.out.println("Enter (H) for Hexagon\n");
            System.out.println("Enter (I) for Isosceles Triangle\n");
            System.out.println("Enter (O) for Octagon\n");
            System.out.println("Enter (P) for Pentagon\n");
            System.out.println("Enter (Q) for Quadrilateral\n");
            System.out.println("Enter (R) for Rectangle\n");
            System.out.println("Enter (S) for Square\n");
            System.out.println("Enter (T) for Triangle\n");

            System.out.println("Enter (Quit) to Quit\n");
            System.out.println("Enter your choice: ");

            String pType = scanner.nextLine();

            switch (pType.toUpperCase()) {
                case "E":
                    System.out.println("Enter the side: ");
                    double side = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();

                    EquilateralTriangle equilateralTriangle = new EquilateralTriangle(side, height);
                    System.out.println("Your Equilateral Triangle's Are is: " +
                            equilateralTriangle.getArea() +
                            " and It's perimeter is: " +
                            equilateralTriangle.getPerimeter());

                case "H":
                    System.out.println("Enter the side of your Hexagon: ");
                    double hexSide = scanner.nextDouble();

                    Hexagon hexagon = new Hexagon(hexSide);
                    System.out.println("Your Hexagon's Area is: " +
                            hexagon.getArea() +
                            " and It's perimeter is: " +
                            hexagon.getPerimeter());

                case "I":
                    System.out.println("Enter the side of your Isosceles Triangle: ");
                    double iSide = scanner.nextDouble();

                    System.out.println("Enter the base of your Isosceles Triangle: ");
                    double iBase = scanner.nextDouble();

                    System.out.println("Enter the Height of your Isosceles Triangle: ");
                    double iHeight = scanner.nextDouble();

                    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(iSide, iBase, iHeight);
                    System.out.println("Your Isosceles Triangle's Area is: " +
                            isoscelesTriangle.getArea() +
                            " and It's perimeter is: " +
                            isoscelesTriangle.getPerimeter());

                case "O":
                    System.out.println("Enter the side of your Octagon: ");
                    double oSide = scanner.nextDouble();

                    System.out.println("Enter the apothem of your Octagon: ");
                    double oApothem = scanner.nextDouble();

                    Octagon octagon = new Octagon(oSide, oApothem);
                    System.out.println("Your Octagon's Area is: " +
                            octagon.getArea() +
                            " and It's perimeter is: " +
                            octagon.getPerimeter());

                case "P":
                    System.out.println("Enter the side of your Pentagon: ");
                    double pSide = scanner.nextDouble();

                    System.out.println("Enter the apothem of your Pentagon: ");
                    double pApothem = scanner.nextDouble();

                    Pentagon pentagon = new Pentagon(pSide, pApothem);
                    System.out.println("Your Pentagon's Area is: " +
                            pentagon.getArea() +
                            " and It's perimeter is: " +
                            pentagon.getPerimeter());

                case "Q":
                    System.out.println("Enter the side1 of your Quadrilateral: ");
                    double qSide1 = scanner.nextDouble();

                    System.out.println("Enter the side2 of your Quadrilateral: ");
                    double qSide2 = scanner.nextDouble();

                    System.out.println("Enter the side3 of your Quadrilateral: ");
                    double qSide3 = scanner.nextDouble();

                    System.out.println("Enter the side4 of your Quadrilateral: ");
                    double qSide4 = scanner.nextDouble();

                    System.out.println("Enter the angle between sides 1 and 4 of your Quadrilateral: ");
                    double qAngle14 = scanner.nextDouble();

                    System.out.println("Enter the angle between sides 2 and 3 of your Quadrilateral: ");
                    double qAngle23 = scanner.nextDouble();

                    Quadrilateral quadrilateral = new Quadrilateral(qSide1, qSide2, qSide3, qSide4, qAngle14, qAngle23);
                    System.out.println("Your Quadrilateral's Area is: " +
                            quadrilateral.getArea() +
                            " and It's perimeter is: " +
                            quadrilateral.getPerimeter());

                case "R":
                    System.out.println("Enter the Length of your Rectangle: ");
                    double rLength = scanner.nextDouble();

                    System.out.println("Enter the width of your Quadrilateral: ");
                    double rWidth = scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(rLength, rWidth);
                    System.out.println("Your Rectangle's Area is: " +
                            rectangle.getArea() +
                            " and It's perimeter is: " +
                            rectangle.getPerimeter());

                case "T":
                    System.out.println("Enter the side1 of your Triangle: ");
                    double tSide1 = scanner.nextDouble();

                    System.out.println("Enter the side2 of your Triangle: ");
                    double tSide2 = scanner.nextDouble();

                    System.out.println("Enter the Base of your Triangle: ");
                    double tBase = scanner.nextDouble();

                    System.out.println("Enter the height of your Triangle: ");
                    double tHeight = scanner.nextDouble();

                    Triangle triangle = new Triangle(tSide1, tSide2, tBase, tHeight);
                    System.out.println("Your Triangle's Area is: " +
                            triangle.getArea() +
                            " and It's perimeter is: " +
                            triangle.getPerimeter());

                case "QUIT":
                    System.out.println("Thanks for visiting us");
                    System.out.println("Good Bye!!");
                    return;

                default:
                    System.out.println("wrong input\n");
            }
        }
    }
}
