package org.geometry.utils;

import org.geometry.shapes.*;

public class ShapeComparator {

    public static String compareArea(Object shape1, Object shape2) {
        double area1 = getArea(shape1);
        double area2 = getArea(shape2);

        if (area1 > area2) return "Первая фигура больше";
        if (area1 < area2) return "Вторая фигура больше";
        return "Фигуры равны по площади";
    }

    public static String comparePerimeter(Object shape1, Object shape2) {
        double perimeter1 = getPerimeter(shape1);
        double perimeter2 = getPerimeter(shape2);

        if (perimeter1 > perimeter2) return "Первая фигура больше";
        if (perimeter1 < perimeter2) return "Вторая фигура больше";
        return "Фигуры равны по периметру";
    }
    private static double getArea(Object shape) {
        if (shape instanceof Circle) {
            return ((Circle)shape).getArea();
        }
        if (shape instanceof Rectangle) {
            return ((Rectangle)shape).getArea();
        }
        if (shape instanceof Triangle) {
            return ((Triangle)shape).getArea();
        }
        throw new IllegalArgumentException("Неизвестный тип фигуры");
    }

    private static double getPerimeter(Object shape) {
        if (shape instanceof Circle) {
            return ((Circle)shape).getPerimeter();
        }
        if (shape instanceof Rectangle) {
            return ((Rectangle)shape).getPerimeter();
        }
        if (shape instanceof Triangle) {
            return ((Triangle)shape).getPerimeter();
        }
        throw new IllegalArgumentException("Неизвестный тип фигуры");
    }
}